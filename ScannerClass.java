import java.util.Scanner;
public class ScannerClass {
     public static void main(String[] args) {
        //  System.out.println("Enter Your Age:");
        //  Scanner obj = new Scanner(System.in);
        //  int age = obj.nextInt();
        //  System.out.println("Your Age is: ");
        //  System.out.println(age);
        // String fullName = obj.next();
        // String fullName = obj.nextLine();
        // System.out.println("Your Name Is: ");
        // System.out.println(fullName);

        System.out.println("Claculate Your Result ");
        float totalMarks = 500;

        System.out.println("Enter Your 5 Subject Marks");
        Scanner m = new Scanner(System.in);
        float sub1 = m.nextFloat();
        float sub2 = m.nextFloat();
        float sub3 = m.nextFloat();
        float sub4 = m.nextFloat();
        float sub5 = m.nextFloat();

        float obtainedMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Your obtainedMarks is: ");
        System.out.println(obtainedMarks);

        float percentage = (obtainedMarks/totalMarks) * 100;
        System.out.println("Your percentage: ");
        System.out.println(percentage);
     } 
}
