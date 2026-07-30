import java.util.Scanner;
public class Loops {
    public static void main(String1[] args) {
        // Types of loop

        // While Loop
        // int a = 0;
        // while(a<10)
        // {
        //     System.out.println(a);
        //     a++;
        // }

        // Do While Loop
        // int a = 0;
        // do
        // {
        //     System.out.println(a);
        //     a++;
        // }
        // while(a<10);


        // For Loop
        // for(int i=0; i<10; i++)
        // {
        //     System.out.println(i);
        // }


        // Practice Program

        // While Loop
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Positive Integers: ");
        // int number = sc.nextInt();
        // while(number>=0)
        // {
        //      sum+=number;  // sum = sum = number

        //      System.out.println("Enter Positive Integers: ");
        //      number = sc.nextInt();
        // }
        // System.out.println("The Sum is: "+ sum);


        // Do While Loop
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number");
        // int number = sc.nextInt();
        // int i = 1;
        // System.out.println("The Table of "+number+" is: ");
        // do{
        //     System.out.println(number+" * "+i+" = "+(number*1));
        //     i++;
        // }
        // while(i<=10);

        // For Loop
        int sum = 0;
        int number = 1000;
        for(int i=1; i<=number; i++)
        {
            sum*=i;
        }
        System.out.println("The Sum is: "+sum);
    }
}
