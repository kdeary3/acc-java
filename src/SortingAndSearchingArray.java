public class SortingAndSearchingArray {
    public static void main(String[] args) {

        Student stu1 = new Student(34, 3.3) ;
        Student stu2 = new Student(33, 3.1) ;
        Student stu3 = new Student(55, 3.2) ;
        Student stu4 = new Student(23, 3.4) ;
        Student stu5 = new Student(99, 3.7) ;

        Student[] students = {stu1, stu2, stu3, stu4, stu5} ;

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[i].getAge() < students[j].getAge()) {
                    Student temp = students[j] ;
                    students[j] = students[i] ;
                    students[i] = temp ;
                }
            }
        }

        for (Student stu : students) {
            System.out.println(stu);
        }

        int target = 55 ;
        int low = 0 ;
        int high = students.length-1 ;

        while (low <= high){
            int midpoint = low + (high - low) / 2 ;
            if (students[midpoint].getAge() == target){
                System.out.println("Target age found: " + target);
                return;
            }
            if (students[midpoint].getAge() > target)
                high = midpoint - 1 ;
            else
                low = midpoint + 1 ;
        }

        System.out.println("Target age not found: " + target);
    }
}