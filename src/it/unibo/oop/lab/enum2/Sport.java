/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * 
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	
	BASKET(5, "Basketball", Place.INDOOR), VOLLEY(6, "Volley", Place.INDOOR), TENNIS(1, "Tennis", Place.OUTDOOR),
	BIKE(1, "Road cycling", Place.OUTDOOR), F1(1, "Formula 1", Place.OUTDOOR), MOTOGP(1, "MotoGP", Place.OUTDOOR),
	SOCCER(11, "Soccer", Place.OUTDOOR);

	private final int members;
	private final String sportName;
	private final Place place;

	private Sport(final int noTeamMembers, final String actualName, final Place place) {
		this.members = noTeamMembers;
		this.sportName = actualName;
		this.place = place;
	}

	/**
	 * Returns whether a sport is individual or not.
	 * 
	 * @return true if teams are composed of one member.
	 */
	public boolean isIndividualSport() {
		return this.members == 1;
	}
	
	/**
	 * Returns whether a sport is played indoor or outdoor.
	 * 
	 * @return true if the sport is practiced indoor.
	 */
	public boolean isIndoorSport() {
		return this.place.equals(Place.INDOOR);
	}
	
	/**
	 * Returns the place where the sport is played.
	 * 
	 * @return a place.
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String toString() {
		return this.sportName + ": a team is composed by " + (this.isIndividualSport() ?
				"1" : this.members) + "members and is played" + this.place.toString();
	}
}
