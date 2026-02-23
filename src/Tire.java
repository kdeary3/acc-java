public class Tire {
    // properties
    private double price ;
    private String make;
    private int mileage;

    // default constructor
    public Tire() {
        this.price = 0.0 ;
        this.make = "none" ;
        this.mileage = 0 ;
    }

    // non-default constructor
    public Tire(double price, String make, int mileage) {
        this.price = price ;
        this.make = make ;
        this.mileage = mileage ;
    }

    // setters
    public void setPrice(double price) {
        this.price = price ;
    }
    public void setMake(String make) {
        this.make = make ;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage ;
    }

    // getters
    public double getPrice() {
        return price ;
    }
    public String getMake() {
        return make ;
    }
    public int getMileage() {
        return mileage ;
    }

    // toString method
    @Override
    public String toString() {
        return "Tire{" +
                "price=" + price +
                ", make='" + make + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
