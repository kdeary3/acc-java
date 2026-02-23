public class Employee {

    private String name ;
    private double salary ;
    private String eid ;

    // Setter
    // constructor (Employee) has to be the same name as the class.
    public Employee(String name, double salary, String eid) {
        this.name = name ;
        this.salary = salary ;
        this.eid = eid ;
    }

    // Getters
    public String getName() {
        return name ;
    }

    public double getSalary() {
        return salary ;
    }

    public String getEid() {
        return eid ;
    }
}
