package pokerEnums;

public enum eHandExceptions {
	ShortHand() {
		public String toString() {
			return "Hand contains less than five cards.";
		}
	}

}
