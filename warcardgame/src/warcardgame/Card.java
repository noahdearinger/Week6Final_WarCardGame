package warcardgame;

public class Card {
	
	
	private int value;
	private String name;
	
	
	
	//getter for value
	public int getValue() {
		return value;
	}
	//setter for value
	public void setValue(int value) {
		this.value = value;
	}
	//getter for name 
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("(" + getValue() + ")" + getName());
		System.out.println();
	}
	
	
}
