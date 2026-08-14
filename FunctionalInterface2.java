import java.util.*;

public class FunctionalInterface2 {
    public static void main(String[] args) {
       List<Student> list = new ArrayList<>();
       list.add(new Student("Alex", 101, 85));
       list.add(new Student("Tovino", 102, 75));
       list.add(new Student("Basil", 103, 95));
       list.add(new Student("Naveen", 104, 97));

      //  Comparator<Student> c1 = new SortByName();
      //  Comparator<Student> c2 = new SortByMarks();
      //  Comparator<Student> c3 = new SortByRollNo();

       // Anonymous Class
       Collections.sort(list, new Comparator<Student>() {
          @Override
          public int compare(Student s1, Student s2) {
              return s1.marks - s2.marks;
          }
       });

       for(Student s : list) {
          System.out.println(s.name + " , " + s.rollNo + " , " + s.marks);
       }
    }
}

// class SortByName implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.name.compareTo(s2.name);
//    }
// }

// class SortByRollNo implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.rollNo - s2.rollNo;
//    }
// }

// class SortByMarks implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.marks - s2.marks;
//    }
// }

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
