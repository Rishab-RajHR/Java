public class Generics4 {
    public static void main(String[] args) {
          // Pair<Integer> p1 = new Pair<>(2, 3);
          Pair<Integer, String> p1 = new Pair<>(2, "Pandian");

          System.out.println(p1.first + ", " + p1.second);
    }
}

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
} 
