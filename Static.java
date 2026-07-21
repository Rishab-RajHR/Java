// Static Keyword

public class Static {
    public static void main(String[] args) {
       Student s1 = new Student("Alex", 28, 101);
       Student s2 = new Student("Tovino", 24, 102);

      //  Student.college = "NIT Vellore";

       System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNumber + " , " + Student.college);
       System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNumber + " , " + Student.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    static String college;
    static int grade;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Static Block;
    static {
       college = "NIT Vellore";
       grade = 8;
    }
}