public class Immutable2 {
      public static void main(String[] args) {
         Student s1 = new Student(25, "Alex","NIT");

        //  System.out.println(s1.getName());
        //  System.out.println(s1.getAge());
        //  System.out.println(s1.getCollege());

         College college = new College("NIT", "UP");
         System.out.println(college.name);
      }
}

// Immutable => means that cannot be changed
final class Student {
    private final int age;
    private final  String name;
    private final College college;

    Student(int age, String name, College  college) {
       this.age = age;
       this.name = name;
       this.college = college;
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
       return this.name;
    }

    public college getCollege() {
        return this.college;
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