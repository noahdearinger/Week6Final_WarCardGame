package warcardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		
	}
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public int incrementScore() {
		return this.score +=1;
	}
	
	public void describe() {
		System.out.println(name + hand);
	}
	
}
