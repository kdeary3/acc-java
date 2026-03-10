import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        Scanner userInput = new Scanner(System.in);
        int menuChoice = 0 ;
        ArrayList<Employee> employees = new ArrayList<Employee>();

        do {
            System.out.println("1 - Add Employee");
            System.out.println("2 - Delete Employee");
            System.out.println("3 - Report Employees");
            System.out.println("4 - Report Employees by Salary");
            System.out.println("5 - Exit Program");

            System.out.print("Enter menu choice: ");
            menuChoice = userInput.nextInt() ;
            switch (menuChoice) {
                case 1: addEmployee(employees); break ;
                case 2: deleteEmployee(employees); break ;
                case 3: reportEmployees(employees); break ;
                case 4: reportEmployeesBySalary(employees); break ;
                case 5: System.out.print("Quitting..."); return ;
            }
        } while (true) ;
    }

    public static void addEmployee(ArrayList<Employee> employees) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Add Employee: ");

        do {
            System.out.println("Enter an Employee type (salaried, hourly, parttime). 0 to exit.:");
            String fullOrPart = userInput.nextLine();
            int id = 0 ;
            String name ;
            String address ;
            double benefit ;
            double salary ;
            double hours ;
            double hourlyRate ;

            switch (fullOrPart) {
                case "0": return ;
                case "salaried":
                    System.out.print("Enter Employee ID: ");
                    id = userInput.nextInt(); userInput.nextLine();
                    System.out.print("Enter Employee Name: ");
                    name = userInput.nextLine();
                    System.out.print("Enter Employee Address: ");
                    address = userInput.nextLine();
                    System.out.print("Enter Benefit Amount: ");
                    benefit = userInput.nextDouble();
                    System.out.print("Enter Salary: ");
                    salary = userInput.nextDouble();
                    Employee f = new Salaried(id, name, address, benefit, salary) ;
                    employees.add(f) ;
                    break ;
                case "hourly":
                    System.out.print("Enter Employee ID: ");
                    id = userInput.nextInt(); userInput.nextLine();
                    System.out.print("Enter Employee Name: ");
                    name = userInput.nextLine();
                    System.out.print("Enter Employee Address: ");
                    address = userInput.nextLine();
                    System.out.print("Enter Benefit Amount: ");
                    benefit = userInput.nextDouble();
                    System.out.print("Enter Hours: ");
                    hours = userInput.nextDouble();
                    System.out.print("Enter Hourly Rate: ");
                    hourlyRate = userInput.nextDouble();
                    Employee h = new Hourly(id, name, address, benefit, hours, hourlyRate) ;
                    employees.add(h) ;
                    break ;
                case "parttime":
                    System.out.print("Enter Employee ID: ");
                    id = userInput.nextInt(); userInput.nextLine();
                    System.out.print("Enter Employee Name: ");
                    name = userInput.nextLine();
                    System.out.print("Enter Employee Address: ");
                    address = userInput.nextLine();
                    System.out.print("Enter Hours: ");
                    hours = userInput.nextDouble();
                    System.out.print("Enter Hourly Rate: ");
                    hourlyRate = userInput.nextDouble();
                    Employee p = new Parttime(id, name, address, hours, hourlyRate) ;
                    employees.add(p) ;
                    break ;
            }
        } while (true);
    }

    public static void deleteEmployee(ArrayList<Employee> employees) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Employee ID to delete: ");
        int id = userInput.nextInt();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee) ;
            }
        }
    }

    public static void reportEmployees(ArrayList<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static void reportEmployeesBySalary(ArrayList<Employee> employees) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a salary: ");
        int amount = userInput.nextInt();
//        for (Employee e : employees) {
//            double pay = switch(e) {
//                case Salaried ;
//                case Hourly ;
//                case Parttime ;
//            }
        }
    }


class Employee {
    protected int id ;
    protected String name ;
    protected String address ;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee() {
        this.id = 0;
        this.name = "none";
        this.address = "none";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

class Fulltime extends Employee {
    protected double benefit;

    public Fulltime(int id, String name, String address, double benefit) {
        super(id, name, address);
        this.benefit = benefit;
    }

    public Fulltime() {
        this.benefit = 0 ;
    }

    @Override
    public String toString() {
        return "Fulltime{" +
                "benefit=" + benefit +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public double getBenefit() {
        return benefit;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }
}

class Parttime extends Employee {
    private double hours;
    private double hourlyRate;

    public Parttime(int id, String name, String address, double hours, double hourlyRate) {
        super(id, name, address);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public Parttime() {
        this.hours = 0;
        this.hourlyRate = 0;
    }

    @Override
    public String toString() {
        return "Parttime{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}

class Salaried extends Fulltime {
    private double salary;

    public Salaried(int id, String name, String address, double benefit, double salary) {
        super(id, name, address, benefit);
        this.salary = salary;
    }

    public Salaried() {
        this.salary = 0 ;
    }

    @Override
    public String toString() {
        return "Salaried{" +
                "salary=" + salary +
                ", benefit=" + benefit +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Hourly extends Fulltime {
    private double hours;
    private double hourlyRate;

    public Hourly(int id, String name, String address, double benefit, double hours, double hourlyRate) {
        super(id, name, address, benefit);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public Hourly() {
        this.hours = 0;
        this.hourlyRate = 0;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                ", benefit=" + benefit +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}