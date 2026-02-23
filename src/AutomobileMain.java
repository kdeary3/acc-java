import java.util.Scanner;

public class AutomobileMain {
    public static void main(String[] args) {

        // create tire
        Tire pirelli = new Tire(300,"pirelli", 20000) ;

        // auto1 (using default constructor)
        Automobile auto1 = new Automobile() ;
        System.out.println( Automobile.getCount() + ", default constructor, " + auto1 ) ;

        // auto2 (using non-default constructor)
        Automobile auto2 = new Automobile() ;
        auto2.setMake("Tesla") ;
        auto2.setPrice(35000.0) ;
        auto2.setTire(pirelli) ;
        System.out.println( Automobile.getCount() + ", non-default constructor, " + auto2) ;

        // auto3 (scanner)
        Scanner userInput = new Scanner(System.in) ;
        System.out.println("Provide an automobile make and price: ");
        String make3 = userInput.nextLine() ;
        double price3 = userInput.nextDouble() ;

        System.out.println("Provide a tire price, make and mileage: ");
        double tire_price3 = userInput.nextDouble() ;
        String tire_make3 = userInput.next() ;
        int tire_mileage3 = userInput.nextInt() ;

        Automobile auto3 = new Automobile(make3, price3, new Tire(tire_price3, tire_make3, tire_mileage3)) ;
        System.out.println( Automobile.getCount() + " " + auto3 ) ;

    }
}