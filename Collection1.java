import java.util.*;

public class Collection1 {
     public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        c.add(1);
        c.add(2);
        c.add(3);

        // size()
        int n = c.size();
        // System.out.println(c.size());

        System.out.println(c.isEmpty());
        // c.size() == 0

        // boolean contains(Object o) --> 1, 2, 3  --> equals()
        System.out.println(c.contains(2));

        // Object toArray();

        // Object[] obj = c.toArray();
        // for(Object o : obj) {
        //    System.out.println(o);
        // }

        // T[] toArray(T[] a)

        // Integer[] arr = c.toArray(new Integer[0]);
        // for(Integer i : arr) {
        //    System.out.println(i);
        // }

        // boolean add(E a);
        // boolean b = c.add(4);
        // System.out.println(b);

        // boolean remove(Object obj)
        // System.out.println(c.remove(2));


        // boolean addAll(Collection <? extends E> c)
        // c.addAll(List.of(5,6,7,8,9));

        // System.out.println(c);

        // containsAllCollection<?> c);

        // System.out.println(c.containsAll(List.of(1,2,3)));

        // Boolean removeAll(Collection<?> c)

        // Boolean retainAll(Collection<?> c);  --> Intersection

        // c.removeAll(List.of(1,2));

        // System.out.println(c);


        // clear()

        c.clear();
        System.out.println(c);

     }
}

// Add, remove, AddAll, removeAll, retainAll, contains, containsAll, toArray, iterator, sizeof, clear, isEmpty
