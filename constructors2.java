public class constructors2 {
     public static void main(String[] args) {
        Student s1 = new Student("Alex",24,102,"IIT");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
     }
}

class Student {
   String name; 
   int age;
   int rollNumber;
   String college;

  //  Default Constructor
   Student() {
   }

  //  Parameterized Constructor
  Student(String n, int a, int rn, String c) {
     name = n;
     age = a;
     rollNumber = rn;
     college = c;
  }

}