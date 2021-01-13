package cloud.jordaan.juan.poker.core;

public abstract class Dealer {
	protected Game game;

	public Dealer() {
		
	}

	public Dealer(Game game) {
		setGame(game);
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	protected abstract void shuffle();
	public abstract void dealCards();
}
