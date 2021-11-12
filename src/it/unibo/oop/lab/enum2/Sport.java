/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
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

	BASKET(5, "basket", Place.INDOOR), VOLLEY(6, "volley", Place.INDOOR), TENNIS(1, "tennis", Place.OUTDOOR),
	BIKE(1, "cycling", Place.OUTDOOR), F1(1, "formula 1", Place.OUTDOOR), MOTOGP(1, "motogp", Place.OUTDOOR),
	SOCCER(11, "soccer", Place.OUTDOOR);

	private final int members;
	private final String sportName;
	private final Place place;

	private Sport(final int noTeamMembers, final String actualName, final Place place) {
		this.members = noTeamMembers;
		this.sportName = actualName;
		this.place = place;
	}

	public boolean isIndividualSport() {
		return this.members == 1;
	}
	
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return this.sportName + ": a team is composed by " + (this.isIndividualSport() ?
				"1" : this.members) + "members and is played" + this.place.toString();
	}
}
