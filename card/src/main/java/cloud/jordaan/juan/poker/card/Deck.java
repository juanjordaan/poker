package cloud.jordaan.juan.poker.card;

import java.io.Serializable;
import java.util.List;

public class Deck implements Serializable {
	private static final long serialVersionUID = -5685138822886382259L;
	private List<Card> cards;

	protected Deck() {

	}

	public Deck(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public Card draw() {
		return cards.remove(0);
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Deck[cards=" + cards + "]";
	}
}
