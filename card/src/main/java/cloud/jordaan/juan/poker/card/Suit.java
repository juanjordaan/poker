package cloud.jordaan.juan.poker.card;

public enum Suit {
	SPADES('S', '♠'), CLUBS('C', '♣'), DIAMONDS('D', '♦'), HEARTS('H', '♥');

	private final Character symbol;
	private final Character print;

	Suit(Character symbol, Character print) {
		this.symbol = symbol;
		this.print = print;
	}

	public Character getSymbol() {
		return symbol;
	}

	public Character getPrint() {
		return print;
	}
}
