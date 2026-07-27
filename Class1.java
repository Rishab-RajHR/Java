public class Class1 {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Alex";
       s1.age = 24;

       System.out.println(s1.toString());
    }
}

class Student {
   String name;
   int age;

   @Override
   public String toString() {
      return (name + " , " + age);
   }
}