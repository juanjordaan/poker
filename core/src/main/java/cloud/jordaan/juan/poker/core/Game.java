package cloud.jordaan.juan.poker.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cloud.jordaan.juan.poker.card.Deck;

public class Game implements Serializable {
	private static final long serialVersionUID = -1937031319750079113L;

	private Long id;
	private List<Player> players;
	private Deck deck;

	public Game() {
		
	}

	public Game(Long id, List<Player> players, Deck deck) {
		super();
		this.id = id;
		this.players = players;
		this.deck = deck;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void addPlayer(Player player) {
		if(this.players == null) {
			players = new ArrayList<Player>();
		}
		players.add(player);
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	@Override
	public String toString() {
		return "Game[id=" + id + ",players=" + players + ",deck=" + deck + "]";
	}
}
