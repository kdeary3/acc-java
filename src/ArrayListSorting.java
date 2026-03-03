import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>() ;
        students.add(new Student(34, 3.3)) ;
        students.add(new Student(33, 3.1)) ;
        students.add(new Student(55, 3.2)) ;
        students.add(new Student(23, 3.4)) ;
        students.add(new Student(99, 3.7)) ;

//        public class Student implements Comparable<Student>{
//        public int compareTo(Student student) {
//            return this.age - student.age;
//        }

        // need to implements Comparable<Student> to use Collections sort
        Collections.sort(students);
        for (Student student : students) System.out.println(student);

        }
}