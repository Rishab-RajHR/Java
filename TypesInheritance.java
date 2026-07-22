// Types of Inheritance
// Simple Inheritance
// Multilevel Inheritance
// Mulitple Inheritance  => Not Supported
// Hierarchical Inheritance

public class TypesInheritance {
     public static void main(String[] args) {
        CSEEngineeringStudent s1 = new CSEEngineeringStudent();
     }
}

class Student {   // Parent   --> A
    String name;
    int age;

    public void markAttendance() {
       System.out.println("Attendance Marked");
    }
}

class EngineeringStudent extends Student {  // Child  --> B
    void attendLab() {
      System.out.println("Lab attended");
    }
}

class CSEEngineeringStudent extends EngineeringStudent {   // Child --> C
   
      void attendLab() {
      System.out.println("Lab attended");
    }

}