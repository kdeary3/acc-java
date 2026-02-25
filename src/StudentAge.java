public class StudentAge {
    private int age ;
    private double gpa ;

    public StudentAge(int age, double gpa) {
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
