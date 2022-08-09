package warcardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] value = new String[14];
		//rank
				value[0] = "Two";
				value[1] = "Three";
				value[2] = "Four";
				value[3] = "Five";
				value[4] = "Six";
				value[5] = "Seven";
				value[6] = "Eight";
				value[7] = "Nine";
				value[8] = "Ten";
				value[9] = "Jack";
				value[10] = "Queen";
				value[11] = "King";
				value[12] = "Ace";
		
 		
	
		String[] name = new String[4];
		//suits
				name[0] = " of Hearts";
				name[1] = " of Diamonds";	
				name[2] = " of Clubs";
				name[3] = " of Spades";

				
		for (int i = 1; i < 14; i++) {
			for (int j = 0; j < 4; j++) {
				
				Card newCard = new Card();
				newCard.setName(value[i] + name[j]);
				newCard.setValue(i);
				cards.add(newCard);
			}
		} 
	
	}
	public Card draw() {
		return cards.remove(0);
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
}
