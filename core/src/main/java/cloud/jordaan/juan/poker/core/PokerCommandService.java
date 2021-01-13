package cloud.jordaan.juan.poker.core;

import java.util.List;

public interface PokerCommandService {
	public Game createGame(List<Player> players);
	public Dealer getDealer();
}
