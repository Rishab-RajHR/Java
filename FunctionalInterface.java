import java.util.*;

public class FunctionalInterface {
    public static void main(String[] args) {
       List<Student> list = new ArrayList<>();
       list.add(new Student("Alex", 101, 85));
       list.add(new Student("Tovino", 102, 75));
       list.add(new Student("Basil", 103, 95));
       list.add(new Student("Naveen", 104, 97));

       Collections.sort(list);

       for(Student s : list) {
          System.out.println(s.name + " , " + s.rollNo + " , " + s.marks);
       }
    }
}

class Student implements Comparable<Student>{
   String name;
   int rollNo;
   int marks;

   public Student(String name, int rollNo, int marks) {
      this.name = name;
      this.rollNo = rollNo;
      this.marks = marks;
   }

   @Override
   public int compareTo(Student s) {
      return this.marks - s.marks;
   }
}
