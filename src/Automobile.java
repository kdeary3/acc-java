public class Automobile {

    // properties
    private String make ;
    private double price ;
    private Tire tire ;
    private static int count ;

    // default constructor
    public Automobile() {
        this.make = "none" ;
        this.price = 0.0 ;
        this.tire = null ;
        count += 1 ;
    }

    // non-default constructor
    public Automobile(String make, double price, Tire tire) {
        this.make = make ;
        this.price = price ;
        this.tire = tire ;
        count += 1 ;
    }

    // setters
    public void setMake(String make) {
        this.make = make ;
    }
    public void setPrice(double price) {
        this.price = price ;
    }
    public void setTire(Tire tire) {
        this.tire = tire ;
    }

    // getters
    public String getMake() { return make ; }
    public double getPrice() { return price ; }
    public Tire getTire() { return tire ; }

    public static int getCount() {
        return count ;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", tire=" + tire +
                '}';
    }
}
