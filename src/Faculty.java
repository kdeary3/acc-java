public class Faculty {

    private String name ;
    private double salary ;

    public Faculty(String name, double salary) {
        this.name = name ;
        this.salary = salary ;
    }

    // Setters
    public void setName(String name) {
         this.name = name ;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name ;
    }

    public double getSalary() {
        return salary ;
    }
}

