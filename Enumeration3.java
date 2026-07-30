public class Enumeration3 {
     public static void main(String1[] args) {
        Direction d =  Direction.NORTH;

        System.out.println(d.getDegree());
     }
}

enum Direction {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);

    private int degrees;

    Direction(int degrees) {
      this.degrees = degrees;
    }

    public int getDegree() {
       return this.degrees;
    }
}
