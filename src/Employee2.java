public class Employee2 implements Comparable<Employee2> {

    private int years;
    private double salary;
    private double totalComp;

    public Employee2(int years, double salary) {
        this.years = years;
        this.salary = salary;
        this.totalComp = years * salary;
    }

    public int getYears() { return years; }
    public void setYears(int years) { this.years = years; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public double getTotalComp() {
        return totalComp;
    }
    public void setTotalComp(double totalComp) {
        this.totalComp = totalComp;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "totalComp=" + (years * salary) +
                " (" + years + ", " + salary + ")}";
    }

    @Override
    public int compareTo(Employee2 o) {
        return Double.compare(this.totalComp, o.totalComp);
    }
}