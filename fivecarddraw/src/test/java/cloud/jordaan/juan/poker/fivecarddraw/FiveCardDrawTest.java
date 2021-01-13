package cloud.jordaan.juan.poker.fivecarddraw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import cloud.jordaan.juan.poker.card.Hand;
import cloud.jordaan.juan.poker.core.Game;
import cloud.jordaan.juan.poker.core.Player;

public class FiveCardDrawTest {
	@Test
	public void TestFiveCardDrawGameCreate_Passes() {
		FiveCardDrawCommandService service = new FiveCardDrawCommandService();
		Game game = service.createGame(Collections.singletonList(new Player(1L, "Player 1", new Hand())));

		assertNotNull(game);

		assertEquals(1, game.getPlayers().size());

		assertNotNull(game.getDeck());
		assertEquals(52, game.getDeck().getCards().size());
	}

	@Test
	public void TestFiveCardDraw2Players_Passes() {
		List<Player> players = new ArrayList<>();
		players.add(new Player(1L, "Player 1", new Hand()));
		players.add(new Player(2L, "Player 2", new Hand()));

		FiveCardDrawCommandService service = new FiveCardDrawCommandService();
		Game game = service.createGame(players);
		service.getDealer().dealCards();

		assertEquals(42, game.getDeck().getCards().size());

		assertEquals(2, game.getPlayers().size());
		assertNotNull(game.getPlayers().get(0).getHand().getEvaluation());
		assertNotNull(game.getPlayers().get(1).getHand().getEvaluation());
	}
}
