public class Immutable4 {
    public static void main(String[] args) {
         College college = new College("NIT", "UP");

         Student s1 = new Student(25, "Alex", college);

         System.out.println(s1.getCollege().name);  // NIT

         s1.getCollege().name = "IIT B";

         System.out.println(s1.getCollege().name); // IIT B
    }
}

// Immutable (Not Purely Immutable) => means that cannot be changed
// Defensive copy of college (non primitive)
final class Student {
    private final int age;
    private final  String name;
    private final College college;

    Student(int age, String name, College  college) {
       this.age = age;
       this.name = name;
       this.college = new College(college.name, college.address);
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
       return this.name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.address);
    }
}


// Mutable => means that can be changed
class College {
   String name;
   String address;

   College(String name, String address) {
       this.name = name;
       this.address = address;
   }
}
