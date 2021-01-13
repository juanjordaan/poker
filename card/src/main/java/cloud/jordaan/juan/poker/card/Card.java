package cloud.jordaan.juan.poker.card;

import java.io.Serializable;

public class Card implements Serializable {
	private static final long serialVersionUID = 8654968227244443193L;
	private Rank rank;
	private Suit suit;
	
	private String rankSymbol;
	private Character suitSymbol;

	public Card() {

	}

	public Card(Rank rank, Suit suit) {
		super();
		setRank(rank);
		setSuit(suit);
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
		this.rankSymbol = rank.getSymbol();
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
		this.suitSymbol = suit.getSymbol();
	}

	@Override
	public String toString() {
		return "Card[rankSymbol=" + rankSymbol + ",suitSymbol=" + suitSymbol + "]";
	}
}
