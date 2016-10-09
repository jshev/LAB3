package pokerBase;
//Bonnie McNellis
//Julianna Shevchenko
//Section 10, Lab 22

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eDeckExceptions;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerExceptions.DeckException;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		// Fixed
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if (eSuit != eSuit.JOKER) {
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {
		//Implemented joker constructor
		this();
		for (int i = 0; i < NbrOfJokers; i++) {
			deckCards.add(new Card(eSuit.JOKER, eRank.JOKER,99));
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {
		// Implemented Joker and Wild constructor
		this(NbrOfJokers);
		for (Card c : Wilds) {
			for (Card a : deckCards) {
				if (c.geteSuit() == a.geteSuit() && c.geteRank() == a.geteRank()) {
					a.setbWild(true);
				}
			}
		}
		Collections.shuffle(deckCards);
	}
	
	public Card Draw() throws DeckException{
		// Implemented exception handling for overdraw
		if (deckCards.size() == 0) {
			throw new DeckException(eDeckExceptions.EmptyDeck.toString(), deckCards);
		}
		Card FirstCard = deckCards.get(0);
		return deckCards.remove(0);
	}
	
	public ArrayList<Card> getDeck() {
		return deckCards;
	}
}
