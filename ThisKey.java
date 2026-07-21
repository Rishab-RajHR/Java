public class ThisKey {
    public static void main(String[] args) {
         Student s1 = new Student();
         Student s2 = new Student("Alex");
         Student s3 = new Student("Rolex", 23);
         Student s4 = new Student("Basil", 32, 103);
         Student s5 = new Student("Tovino", 23, 123, "IIT Bombay");

         System.out.println(s3.rollNumber);
    }
}

// Constructor Chaining
class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        // this.name = "Unknown";
        // this.age = 0;
        // this.rollNumber = 0;
        // this.college = "Unknown";

        // Shorter way to write the this keyword
        // this("unknown", 0, 0, "Unknown");

        this("Unknown");
        System.out.println("I am in First Constructor");

    }

    Student(String name) {
        this(name, 0, 0, "Unknown");
        System.out.println("I am in Second Constructor");
    }

    Student(String name, int age) {
        this(name, age, 0, "Unknown");
        System.out.println("I am in Third Constructor");
    }

    Student(String name, int age, int rollNumber) {
       this(name, age, rollNumber, "Unknown");
       System.out.println("I am in Fourth Constructor");
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("I am in Fifth Constructor");
    }

    void markAttendance() {
       System.out.println("Attendance marked for student " + name);
    }
}
