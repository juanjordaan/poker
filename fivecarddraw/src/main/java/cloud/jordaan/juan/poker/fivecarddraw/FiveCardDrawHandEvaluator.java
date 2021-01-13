package cloud.jordaan.juan.poker.fivecarddraw;

import cloud.jordaan.juan.poker.card.Hand;
import cloud.jordaan.juan.poker.card.HandEvaluation;
import cloud.jordaan.juan.poker.fivecarddraw.bb4.BB4Convertor;
import cloud.jordaan.juan.poker.fivecarddraw.bb4.HandScore;
import cloud.jordaan.juan.poker.fivecarddraw.bb4.PokerHandScorer;

public interface FiveCardDrawHandEvaluator {
	public static void evaluate(Hand hand) {
		PokerHandScorer scorer = new PokerHandScorer();
		HandScore score = scorer.getScore(BB4Convertor.toBb4(hand));
		HandEvaluation evaluation = new HandEvaluation();
		evaluation.setId(1L);
		evaluation.setScore(Double.valueOf(""+score.getType().odds()));
		evaluation.addComment(score.getType().toString());
		hand.setEvaluation(evaluation);
	}
}
