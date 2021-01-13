package cloud.jordaan.juan.poker.fivecarddraw;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cloud.jordaan.juan.poker.card.Deck;
import cloud.jordaan.juan.poker.card.DeckFactory;
import cloud.jordaan.juan.poker.core.Dealer;
import cloud.jordaan.juan.poker.core.Game;
import cloud.jordaan.juan.poker.core.Player;
import cloud.jordaan.juan.poker.core.PokerCommandService;
import cloud.jordaan.juan.poker.exception.ApplicationException;

public class FiveCardDrawCommandService implements PokerCommandService {
	static Logger logger = LoggerFactory.getLogger(FiveCardDrawCommandService.class);

	private FiveCardDrawDealer dealer;

	public Game createGame(List<Player> players) {
		if(players == null || players.isEmpty()) {
			throw new ApplicationException("Game must have players");
		}

		Game game = new Game(1L, players, new Deck(DeckFactory.getStandardDeck()));
		dealer = new FiveCardDrawDealer(game);

		return game;
	}

	@Override
	public Dealer getDealer() {
		return dealer;
	}
}
