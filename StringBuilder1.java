public class StringBuilder1 {
     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();

         sb.append("Alex");
        //  sb.append(" Pandian");

        //  System.out.println(sb);

        //  Insert
        // sb.insert(2, 'a');
        //  System.out.println(sb);

        //  Delete
        // sb.delete(0, 2);
          // System.out.println(sb);

          // sb.deleteCharAt(1);

          // replace()

          // sb.replace(1, 3, "XY");
          // // System.out.println(sb);

          // sb.reverse();
          // System.out.println(sb);

          // sb.charAt(1);
          // sb.setCharAt(3, 'r');

          System.out.println(sb.length());

          System.out.println(sb.capacity());

          // (sb.ensureCapacity(0));

          sb.trimToSize();
     }
}
