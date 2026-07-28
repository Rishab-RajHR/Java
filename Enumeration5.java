public class Enumeration5 {
     public static void main(String[] args) {
        // Direction[] directions = Direction.values();

        // for(Direction d : directions) {
        //    System.out.println(d.name());
        // }

        Direction d = Direction.valueOf("EAST");
        // System.out.println(d.name());
        System.out.println(d.toString());

        System.out.println(d.ordinal());

     }
}

// values()  --> We can iterate in this enum
// valueOf()  --> Convert a string to enum constant
// name()  vs toString()  --> 
// ordinal()
// toString(), equals(), hashCode()
enum Direction {
   NORTH,
   SOUTH,
   EAST,
   WEST;

   @Override
   public String toString() {
       return this.name() + " Direction";
   }
}
