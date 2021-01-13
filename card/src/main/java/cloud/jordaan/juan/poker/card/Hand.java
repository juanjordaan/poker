package cloud.jordaan.juan.poker.card;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Hand implements Serializable {
	private static final long serialVersionUID = -2190777000916664206L;
	private List<Card> cards = new ArrayList<Card>();
	private HandEvaluation evaluation;

	public Hand() {

	}

	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void addCard(Card card) {
		if (cards == null) {
			cards = new ArrayList<Card>();
		}
		cards.add(card);
	}

	public HandEvaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(HandEvaluation evaluation) {
		this.evaluation = evaluation;
	}

	@Override
	public String toString() {
		return "Hand[cards=" + cards + ",evaluation=" + evaluation + "]";
	}
}
