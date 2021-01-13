package cloud.jordaan.juan.poker.card;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory {
	/**
	 * 
	 * @return 52 Cards, No Jokers
	 */
	public static List<Card> getStandardDeck() {
		List<Card> standardDeck = new ArrayList<>();
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				standardDeck.add(new Card(r, s));
			}
		}

		return standardDeck;
	}
}
