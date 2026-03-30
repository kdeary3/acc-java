public class Employee2 implements Comparable<Employee2>{

    private int a ;
    private double b ;

    public Employee2(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int compareTo(Employee2 o) {
        if (this.a == o.a && this.b == o.b) return 0;
        return 1 ;
    }
}
