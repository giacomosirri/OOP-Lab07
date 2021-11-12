/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * 
 * Represents an enumeration for declaring sports;
 */
public enum Sport {
	
	BASKET("Basketball"), SOCCER("Soccer"), TENNIS("Tennis"), BIKE("Road cycling"), F1("Formula 1"), 
	MOTOGP("MotoGP"), VOLLEY("Volleyball");
		
	private Sport(final String name) { 
	}
}
