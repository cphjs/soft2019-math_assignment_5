package cphb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Set<Integer> set = new RangeSet<>(1, 5);
        Set<Integer> set2 = new RangeSet<>(10, 20);

        System.out.println("Set1 has 5?" + set.member(5));
        System.out.println("Set2 has 12?" + set2.member(12));

        Set<Integer> union = set.union(set2);
        System.out.println("Union has 5?" + union.member(5));
        System.out.println("Union has 12?" + union.member(12));

    }
}
