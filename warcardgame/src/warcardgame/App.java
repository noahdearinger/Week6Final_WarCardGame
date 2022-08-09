package warcardgame;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		
		Player p1 = new Player("Player 1");
		Player p2 = new Player("Player 2");

		deck.shuffle();
		
		deal(p1, p2, deck);
		
		
		
		for (int i = 0; i < 26; i++) {
			
		//player 1 turn
			Card p1Card = p1.flip();
			int p1CardVal = p1Card.getValue();
			System.out.println("Player 1's card is: ");
			p1Card.describe();
			System.out.println();
			
		//player 2 turn
			Card p2Card = p2.flip();
			int p2CardVal = p2Card.getValue();
			System.out.println("Player 2's card is: ");
			p2Card.describe();
			System.out.println();
		
		//Scoring
			if(p1CardVal > p2CardVal) {
				p1.incrementScore();
				System.out.println("Player 1 wins! Next round...");
				System.out.println();
			}
			else if (p2CardVal > p1CardVal) {
				p2.incrementScore();
				System.out.println("Player 2 wins! Next round...");
				System.out.println();
			}
			else {
				System.out.println("Oops! It's a tie. Nobody will recieve points.");
			}
		
		
		
		}
			
		//final score comparison
			if(p1.getScore() > p2.getScore()) {
				System.out.println("Player 1 wins the game! Final score: " + p1.getScore() + p2.getScore());
			}
			else if (p2.getScore() > p1.getScore()) {
				System.out.println("Player 2 wins the game! Final score: " + p1.getScore() + p2.getScore());
			}
			else {
				System.out.println("Somehow, it ended in a tie! Final score: " + p1.getScore() + p2.getScore());
			}
}
		
		private static void deal(Player p1, Player p2, Deck deck) {
			for (int i = 0; i < 26; i++) {
				p1.draw(deck);
				p2.draw(deck);
			}
		}
	




}
