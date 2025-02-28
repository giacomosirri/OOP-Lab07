package it.unibo.oop.lab.nesting2;

/**
 * 
 * Represent a class of objects accepting a given sequence of elements.
 *
 * @param <T>
 */
public interface Acceptable<T> {

    /**
     * Returns the acceptor, i.e. the object which will take a sequence of
     * elements in the very same order as defined on acceptable.
     * 
     * @return the acceptor
     */
    Acceptor<T> acceptor();

}
