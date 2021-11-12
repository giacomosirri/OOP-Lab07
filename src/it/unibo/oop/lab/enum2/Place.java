package it.unibo.oop.lab.enum2;

public enum Place {

	INDOOR("indoor"), OUTDOOR("outdoor");

	private final String place;
	
	Place(final String place) {
		this.place = place;
	}
	
	public String toString() {
		return this.place;
	}
}
