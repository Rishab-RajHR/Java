public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        Student s1 = new Student();
        s1.markAttendance();
        // s1.attendLab(); => In student class we can attend only Student class method beacuse it is a base class
    }
}

/*
parent (SuperClass) --> child (SubClass)
*/

class Student {
    String name;
    int age;

    void markAttendance() {
       System.out.println("Attendance Marked");
    }
}

class EngineeringStudent extends Student {
    void attendLab() {
       System.out.println("Lab attended");
    }
}
