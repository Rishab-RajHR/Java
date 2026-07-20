public class contructors {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Alex";
        s1.age = 28;
        s1.rollNumber = 101;
        s1.college = "NIT Tanjavur";

        // Contructors => To create an object

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        // int x = 4;  // local variable
        // int x;  // local variable   --> no default values
        // System.out.println(x);
    }
}

/*
Integer  --> 0
FLoating  --> 0.0
Boolean  --> false
String   --> null (nothing)
*/

class Student {
   String name;  // information/data/characteristics  --> instance variables
   int age;
   int rollNumber;
   String college;

   void markAttendance() {  // Behaviours  --> functions  --> instance methods  
     System.out.println("Attendance marked for student " + name);
   }
}