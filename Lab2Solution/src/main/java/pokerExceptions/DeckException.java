package pokerExceptions;

import java.util.ArrayList;

import pokerBase.Card;
import pokerBase.Deck;

public class DeckException extends Exception {
	private ArrayList<Card> d;
	
	public DeckException(String message, ArrayList<Card> d) {
		super(message);
		this.d = d;
	}
	
	public ArrayList<Card> getD() {
		return d;
	}

}
