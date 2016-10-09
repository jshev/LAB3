package pokerExceptions;

import pokerBase.Hand;

public class HandException extends Exception {
	
	private Hand h;
	
	public HandException(String message, Hand h) {
		super(message);
		this.h = h;
	}
	
	public Hand getH() {
		return h;
	}

}
