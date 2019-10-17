package cphb;

/**
 * RangeSet
 */
public class RangeSet<T extends Comparable<T>> implements Set<T> {

    private T min;
    private T max;

    public RangeSet(T min, T max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int compareTo(Set<T> o) {
        if (o instanceof RangeSet) {
            RangeSet<T> s = (RangeSet<T>)o;
            if (min.compareTo(s.min) > 0 && max.compareTo(s.max) < 0) return -1;
            else if (min.compareTo(s.min) < 0 && max.compareTo(s.max) > 0) return 1;
            else return 0;
        }
        throw new RuntimeException("I don't know how to compare other kinds of sets");
    }

    @Override
    public boolean member(T t) {
        return t.compareTo(min) >= 0 && t.compareTo(max) <= 0;
    }

    @Override
    public Set<T> union(Set<T> t) {
        return new UnionSet<T>(this, t);
    }

    @Override
    public Set<T> intersection(Set<T> t) {
        return new IntersectionSet<T>(this, t);
    }

    @Override
    public Set<T> difference(Set<T> t) {
        return new DifferenceSet<T>(this, t);
    }

    @Override
    public Set<T> complement(Set<T> t) {
        return new ComplementSet<T>(this, t);
    }

}