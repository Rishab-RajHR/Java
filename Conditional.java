import java.util.Scanner;
public class Conditional {
    public static void main(String1[] args) {
        //  int age = 19;
        //  if(age > 18)
        //  {
        //      System.out.println("You Can Vote!");
        //  }
        //  else
        // {
        //       System.out.println("You Cannot Vote becouse you are under 18");
        // }


        // Nested if
        // int a = 2;
        // int b = 3;
        // if(a==2)
        // {
        //    if(b==3)
        //    {
        //       System.out.println("Both Conditions are True");
        //    }
        //    else
        //    {
        //        System.out.println("A = 2 but B is not equal to 3");
        //   }
        // }
        // else{
        //    System.out.println("A is not equal to 2");
        // }


        //  If Else If Ladder
        // int number = 2;
        // if(number>0)
        // {
        //     System.out.println("Number is Positive");
        // }
        // else if(number<0)
        // {
        //     System.out.println("Number is Negative");
        // }
        // else{
        //    System.out.println("Number is Equal to Zero");
        // }


        // Practice Program
        double percentage;
        System.out.println("Enter Your Percentage: ");
        Scanner sc = new Scanner(System.in);
        percentage = sc.nextDouble();

        if(percentage<=100 && percentage>=90)
        {
            System.out.println("Grade A+");
        }
        else if(percentage<90 && percentage>=80)
        {
            System.out.println("Grade A");
        }
        else if(percentage<80 && percentage>=70)
        {
            System.out.println("Grade B");
        }
        else if(percentage<70 && percentage>=60)
        {
            System.out.println("Grade C");
        }
        else if(percentage<60 && percentage>=50)
        {
            System.out.println("Grade D");
        }
        else if(percentage<50 && percentage>=0)
        {
            System.out.println("Grade F! You are Fail Focus on your studies");
        }
        else{
           System.out.println("Invalid Percentage");
        }

    } 
}
