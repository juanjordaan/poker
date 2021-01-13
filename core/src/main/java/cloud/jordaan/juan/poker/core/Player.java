package cloud.jordaan.juan.poker.core;

import cloud.jordaan.juan.poker.card.Hand;
import cloud.jordaan.juan.poker.exception.ApplicationException;

public class Player {
	private Long id;
	private String displayName;
	private Hand hand = new Hand();

	protected Player() {
		
	}

	public Player(Long id, String displayName, Hand hand) {
		super();
		if(hand == null) {
			throw new ApplicationException("Hand may not be null");
		}

		this.id = id;
		this.displayName = displayName;
		this.hand = hand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public String toString() {
		return "Player[id=" + id + ",displayName=" + displayName + ",hand=" + hand + "]";
	}
}
