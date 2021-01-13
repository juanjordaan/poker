package cloud.jordaan.juan.poker.fivecarddraw;

import java.util.Comparator;

import cloud.jordaan.juan.poker.card.Card;

public class FiveCardDrawCardComperator implements Comparator<Card> {
	@Override
	public int compare(Card card1, Card card2) {
		if(card2.getRank() == card1.getRank()) {
			return card1.getSuit().ordinal() - card2.getSuit().ordinal();
		} else {
			return card1.getRank().ordinal() - card2.getRank().ordinal();
		}
	}
}
