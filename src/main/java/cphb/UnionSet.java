package cphb;

public class UnionSet<T extends Comparable<T>> implements Set<T> {

    private Set<T> first,second;

    public UnionSet(Set<T> first, Set<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Set<T> o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean member(T t) {
        return first.member(t) || second.member(t);
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
