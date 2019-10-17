package cphb;

/**
 * Set
 */
public interface Set<T extends Comparable<T>> extends Comparable<Set<T>> {

    boolean member(T t);
    Set<T> union(Set<T> t);
    Set<T> intersection(Set<T> t);
    Set<T> difference(Set<T> t);
    Set<T> complement(Set<T> t);
    
}