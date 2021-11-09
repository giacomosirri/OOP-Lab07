/**
 * 
 */
package it.unibo.oop.lab.nesting1;

import java.util.HashSet;
import java.util.Set;

import it.unibo.oop.lab.socialnetwork.SocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * 
 * Represents a social network user along with the sports he/she likes to do or
 * to follow.
 * 
 * 1) Complete the definition of the nested static class Sport, featuring just a
 * field representing the sport name.
 * 
 * 2) Add the unimplemented methods.
 * 
 * @param <U>
 *            specific {@link User} type
 */
public class SportSocialNetworkUserImpl<U extends User> extends SocialNetworkUserImpl<U> {

    /**
     * Static {@link Sport} constant.
     */
    public static final Sport SOCCER;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport F1;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport MOTOGP;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport VOLLEY;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport BASKET;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport BIKE;

    static {
        SOCCER = new Sport("soccer");
        F1 = new Sport("f1");
        MOTOGP = new Sport("motogp");
        VOLLEY = new Sport("volley");
        BASKET = new Sport("basket");
        BIKE = new Sport("bike");
    }

    /**
     * Field meant to keep track of the set of sports followed/done by a user.
     */
    private final Set<Sport> sports;

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user first name
     * @param surname
     *            the user last name
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user) {
        this(name, surname, user, -1);
    }

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user first name
     * @param surname
     *            the user last name
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
        this.sports = new HashSet<>();
    }

    /**
     * Add a new sport followed by this user: if the user already likes or does
     * the sport, nothing happens.
     * 
     * @param sport
     *            a sport followed/done by the user
     */
    // TODO
    public void addSport(final Sport sport) {
    	this.sports.add(sport);
    }

    /**
     * Returns true if a user likes/does a given sport.
     * 
     * @param s
     *            sport to use as an input
     * @return true if a user likes sport s
     */
    // TODO
    public boolean hasSport(final Sport s) {
        return this.sports.contains(s);
    }

    public static final class Sport {

    	private final String name;
    	
    	public Sport(final String name) {
    		this.name = name;
    	}
    	
    	public int hashCode() {
    		return this.name.hashCode();
    	}
    	
        @Override
        public boolean equals(final Object o) {
        	return (o instanceof Sport) ? this.hashCode() == o.hashCode() : false;
        }
        
    }
    
}
