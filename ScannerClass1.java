// Scanner Class

import java.util.Scanner;

public class ScannerClass1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // next() => It reads one word
        // next() => It reads entire line

        // String name = sc.nextLine();
        // int age = sc.nextInt();
        double age = sc.nextDouble();
        System.out.println(age);

        boolean x = sc.nextBoolean();

        System.out.println(x);

        // System.out.println(name);
      }
}
