package cloud.jordaan.juan.poker.card;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HandEvaluation implements Serializable {
	private static final long serialVersionUID = -527819029475124052L;

	private Long id;
	private Double score;
	private List<String> comments = new ArrayList<>();

	public HandEvaluation() {

	}

	public HandEvaluation(Long id, Double score, List<String> comments) {
		super();
		this.id = id;
		this.score = score;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "HandEvaluation[id=" + id + ",score=" + score + ",comments=" + comments + "]";
	}

	public void addComment(String comment) {
		if(comments == null) {
			comments = new ArrayList<>();
		}
		comments.add(comment);
	}
}
