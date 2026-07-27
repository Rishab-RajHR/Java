public class Equals2 {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Alex";
       s1.age = 24;

       System.out.println(s1);

       Student s2 = new Student();
       s2.name = "Alex";
       s2.age = 24;

       Student s3 = null;

       Integer i = 20;

       System.out.println(s1.equals(i));
    }
}

class Student {
   String name;
   int age;

   @Override
   public String toString() {
      return (name + " , " + age);
   }

   @Override
   public boolean equals(Object obj) {

        if(this == obj) return true;

        if(obj == null) {
            return false;
        }

        // Check if both classes are of type Student
        // If not checked  --> ClassCaseException

        if(obj.getClass() != this.getClass()) {
            return false;
        }

        Student s = (Student) obj;

        return (this.name == s.name && this.age == s.age);
   }
}
