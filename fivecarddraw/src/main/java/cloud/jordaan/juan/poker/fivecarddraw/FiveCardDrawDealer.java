package cloud.jordaan.juan.poker.fivecarddraw;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloud.jordaan.juan.poker.card.Deck;
import cloud.jordaan.juan.poker.core.Dealer;
import cloud.jordaan.juan.poker.core.Game;
import cloud.jordaan.juan.poker.core.Player;
import cloud.jordaan.juan.poker.exception.ApplicationException;

public class FiveCardDrawDealer extends Dealer {
	static Logger logger = LoggerFactory.getLogger(FiveCardDrawDealer.class);

	private Boolean shuffled = false;
	private static final int HAND_SIZE = 5;

	public FiveCardDrawDealer(Game game) {
		super(game);
		shuffle();
	}

	@Override
	protected void shuffle() {
		logger.info("Shuffling ...");
		Collections.shuffle(game.getDeck().getCards());
		shuffled = true;
	}

	@Override
	public void dealCards() {
		if(!shuffled) {
			throw new ApplicationException("The deck must be shuffled before cards may be dealt.");
		}

		Deck deck = game.getDeck();
		List<Player> players = game.getPlayers();
		int currentPlayer = 0;
		int playerCount = players.size();

		// can't parrallel, cards are dealt in a round-robin order
		for(int i = 0; i < (HAND_SIZE * playerCount); i++) {
			players.get(currentPlayer++).getHand().addCard(deck.draw());

			if(currentPlayer >= playerCount) {
				currentPlayer = 0;
			}
		}

		players.parallelStream()
			.map(Player::getHand)
			.forEach(h -> {
				Collections.sort(h.getCards(), new FiveCardDrawCardComperator());
				FiveCardDrawHandEvaluator.evaluate(h);
			});
	}
}
