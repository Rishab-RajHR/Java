import java.util.*;

public class Interface11 {
     public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Alex", 95));
        list.add(new Student("Tovino", 90));
        list.add(new Student("Roshan", 60));

        Collections.sort(list);   // ascending

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(5);
        list2.add(45);

        Collections.sort(list2);

        System.out.println(list2);
     }
}

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
