import java.util.*;

public class ComparableInterface{
     public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Alex", 95));
        list.add(new Student("Tovino", 90));
        list.add(new Student("Roshan", 60));
        list.add(new Student("Sam", 70));

        Collections.sort(list);   // ascending

        // System.out.println(list);

        for(Student s : list){
             System.out.println(s.name + " , " + s.marks);
        }

        // List<Integer> list2 = new ArrayList<>();
        // list2.add(10);
        // list2.add(5);
        // list2.add(45);

        // Collections.sort(list2);

        // System.out.println(list2);
     }
}

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        if(this.marks != other.marks) {
            return this.marks - other.marks;
        }
        return this.name.compareTo(other.name);

    }
}

