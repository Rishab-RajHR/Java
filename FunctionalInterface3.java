import java.util.*;

public class FunctionalInterface3 {
    public static void main(String[] args) {
       List<Student> list = new ArrayList<>();
       list.add(new Student("Alex", 101, 85));
       list.add(new Student("Tovino", 102, 75));
       list.add(new Student("Basil", 103, 95));
       list.add(new Student("Naveen", 104, 97));

      //  Comparator<Student> c1 = new SortByName();
      //  Comparator<Student> c2 = new SortByMarks();
      //  Comparator<Student> c3 = new SortByRollNo();

      Collections.sort(list, (s1,s2) -> s1.marks - s2.marks);

       for(Student s : list) {
          System.out.println(s.name + " , " + s.rollNo + " , " + s.marks);
       }
    }
}


class Student{
   String name;
   int rollNo;
   int marks;

   public Student(String name, int rollNo, int marks) {
      this.name = name;
      this.rollNo = rollNo;
      this.marks = marks;
   }

  
}
