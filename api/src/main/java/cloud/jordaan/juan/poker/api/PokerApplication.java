package cloud.jordaan.juan.poker.api;

import java.util.Collections;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cloud.jordaan.juan.poker.card.Hand;
import cloud.jordaan.juan.poker.core.Game;
import cloud.jordaan.juan.poker.core.Player;
import cloud.jordaan.juan.poker.core.PokerCommandService;
import cloud.jordaan.juan.poker.fivecarddraw.FiveCardDrawCommandService;

@SpringBootApplication
public class PokerApplication implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(PokerApplication.class);

	public static void main(String[] args) {
		logger.info("Starting Poker Application");
		SpringApplication.run(PokerApplication.class, args);
	}

	@Override
	public void run(String... args) {
		logger.info("EXECUTING : FiveCardDrawCommandService");
		PokerCommandService service = new FiveCardDrawCommandService();
		Game game = service.createGame(Collections.singletonList(new Player(1L, "Player 1", new Hand())));
		service.getDealer().dealCards();

		Hand hand = game.getPlayers().get(0).getHand();
		String s = hand.getCards().stream().map(c -> c.getRank().getSymbol() + c.getSuit().getPrint()).collect(Collectors.joining(" "));

		logger.info("Your hand : " + s);
		logger.info("You have  : " + hand.getEvaluation().getComments().get(0));
	}
}
