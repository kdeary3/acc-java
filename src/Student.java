public class Student {

    private String name ;
    private double gpa ;
    private Address address ;
    private static int count = 0 ;

//    // default constructor - setting values to defaults
//    public Student() {
//        name = "none" ;
//        gpa = 0.0 ;
//    }


    // non-default constructor - initializing attributes to objects
    public Student(String name, double gpa, Address address) {
        this.name = name;
        this.gpa = gpa;
        this.address = address;
        count = count + 1 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", address=" + address +
                '}';
    }

    public static int getCount() {
        return count ;
    }
}
