package cloud.jordaan.juan.poker.fivecarddraw.bb4;

import java.util.List;
import java.util.stream.Collectors;

public interface BB4Convertor {
	public static Hand toBb4(cloud.jordaan.juan.poker.card.Hand source) {
		return new Hand(toBb4(source.getCards()));
	}

	public static List<Card> toBb4(List<cloud.jordaan.juan.poker.card.Card> source) {
		return source.parallelStream()
			.map(BB4Convertor::toBb4)
			.collect(Collectors.toList());
	}

	public static Card toBb4(cloud.jordaan.juan.poker.card.Card source) {
		Rank rank = toBb4(source.getRank());
		Suit suit = toBb4(source.getSuit());

		return new Card(rank, suit);
	}

	public static Rank toBb4(cloud.jordaan.juan.poker.card.Rank source) {
		return Rank.getRankForSymbol(source.getSymbol());
	}

	public static Suit toBb4(cloud.jordaan.juan.poker.card.Suit source) {
		return Suit.getSuitForSymbol(""+source.getSymbol());
	}
}
