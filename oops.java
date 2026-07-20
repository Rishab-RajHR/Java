public class oops {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student();

       s1.name = "Alex";
       s1.age = 23;
       s1.rollNumber = 45;
       s1.college = "NIT College";

       s2.name = "Basil";
       s2.age = 26;
       s2.rollNumber = 78;
       s2.college = "LMNIT College";

       s1.markAttendance();
       s2.markAttendance();

       s1.print();
       s2.print();
    }
}

class Student {
   String name;
   int age;
   int rollNumber;
   String college;

   void markAttendance() {
      System.out.println("Attendance marked by " + name);
   }

   void print() {
     System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
   }
}
