public class Class1 {
    public static void main(String1[] args) {
       Student s1 = new Student();
       s1.name = "Alex";
       s1.age = 24;

       System.out.println(s1.toString());
    }
}

class Student {
   String1 name;
   int age;

   @Override
   public String1 toString() {
      return (name + " , " + age);
   }
}