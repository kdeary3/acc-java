import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        File vehicleRecords = new File("vehicle_records.txt");
        vehicleProgram(vehicles, vehicleRecords);
    }

    public static void vehicleProgram(ArrayList<Vehicle> vehicles, File vehicleRecords) {
        Scanner userInput = new Scanner(System.in);
        int userChoice = 0;

        do {
            displayMenu() ;
            userChoice = userInput.nextInt();
            switch (userChoice) {
                case 1: addVehicle(vehicles); break ;
                case 2: removeVehicle(vehicles); break ;
                case 3: displayVehicles(vehicles); break ;
                case 4: writeVehiclesToFile(vehicles, vehicleRecords); break ;
                case 5: readVehiclesFromFile(vehicles, vehicleRecords); break ;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default: System.out.println("Invalid choice."); break ;
            }
        } while (true) ;
    }

    public static void displayMenu() {
        System.out.println("1 - Add vehicle");
        System.out.println("2 - Remove vehicle");
        System.out.println("3 - Display vehicles by type");
        System.out.println("4 - Write vehicles to file");
        System.out.println("5 - Read vehicles from file");
        System.out.println("6 - Quit Program");
        System.out.println("Enter your choice: ");
    }

    public static void addVehicle(ArrayList<Vehicle> vehicles) {

        if (vehicles.size() >= 50) {
            System.out.println("There are already 50 vehicles.");
            return;
        }

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter vehicle type (motorcycle, truck, suv, electric, gas or hybrid): ");
        String addVehicleType = userInput.nextLine();

        System.out.println("Enter vin: ");
        String vin = userInput.nextLine();
        System.out.println("Enter make: ");
        String make = userInput.nextLine();
        System.out.println("Enter price: ");
        double price = userInput.nextDouble();

        switch(addVehicleType) {
            case "motorcycle":
                System.out.println("Enter top speed: ");
                int speed = userInput.nextInt();
                Vehicle addMotorcycle = new Motorcycle(vin, make, price, speed) ;
                vehicles.add(addMotorcycle);
                break ;
            case "truck":
                System.out.println("Enter tow capacity: ");
                int tow_capacity = userInput.nextInt();
                Vehicle addTruck = new Truck(vin, make, price, tow_capacity) ;
                vehicles.add(addTruck);
                break ;
            case "suv":
                System.out.println("Enter seats: ");
                int seats = userInput.nextInt();
                Vehicle addSUV = new SUV(vin, make, price, seats) ;
                vehicles.add(addSUV);
                break ;
            case "electric":
                System.out.println("Enter range: ");
                int range = userInput.nextInt();
                Vehicle addElectric = new ElectricCar(vin, make, price, range) ;
                vehicles.add(addElectric);
                break ;
            case "gas":
                System.out.println("Enter horsepower: ");
                int horsepower = userInput.nextInt();
                Vehicle addGas = new GasCar(vin, make, price, horsepower) ;
                vehicles.add(addGas);
                break ;
            case "hybrid":
                System.out.println("Enter mpg: ");
                int mpg = userInput.nextInt();
                Vehicle addHybrid = new HybridCar(vin, make, price, mpg) ;
                vehicles.add(addHybrid);
                break ;
            default:
                System.out.println("Invalid vehicle type");
                break ;
        }

    }

    public static void removeVehicle(ArrayList<Vehicle> vehicles) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter vehicle vin to remove: ");
        String vin = userInput.nextLine();

        boolean removed = vehicles.removeIf(vehicle -> vehicle.getVin().equals(vin));

        if (removed) System.out.println("Vehicle removed: " + vin);
        else System.out.println("Vehicle not found.");
    }

    public static void displayVehicles(ArrayList<Vehicle> vehicles) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("How do you want it displayed?:");
        System.out.println("1 - Display all vehicles");
        System.out.println("2 - Display by VIN");
        System.out.println("3 - By Price (Lowest to Highest)");
        System.out.println("4 - By Price (lower than specified amount)");
        System.out.println("5 - EVs above range");

        int userChoice =  userInput.nextInt();

        switch (userChoice) {
            case 1: displayAll(vehicles); break ;
            case 2: displayByVin(vehicles); break ;
            case 3: displayByOrderedLowestToHighest(vehicles); break ;
            case 4: displayByLowerThanAmount(vehicles); break ;
            case 5: displayElectricAboveRange(vehicles); break ;
        }
    }

    public static void displayAll(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.toString());
            }
        }
    }

    public static void displayByVin(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found");
        } else {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter vin: ");
            String vin = userInput.nextLine();

            for (Vehicle vehicle : vehicles)
                if (vin.equals(vehicle.getVin())) {
                    System.out.println(vehicle.toString());
                    return ;
                }

            System.out.println("VIN not found.");
        }
    }

    public static void displayByOrderedLowestToHighest(ArrayList<Vehicle> vehicles) {
        ArrayList<Vehicle> sortedVehicles = new ArrayList<>(vehicles);

        mergeSort(sortedVehicles, 0, sortedVehicles.size() - 1);

        for (Vehicle vehicle : sortedVehicles) {
            System.out.println(vehicle);
        }
    }

    public static void mergeSort(ArrayList<Vehicle> vehicles, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(vehicles, low, mid);
        mergeSort(vehicles, mid + 1, high);

        merge(vehicles, low, mid, high);
    }

    public static void merge(ArrayList<Vehicle> vehicles, int low, int mid, int high) {

        ArrayList<Vehicle> left = new ArrayList<>();
        ArrayList<Vehicle> right = new ArrayList<>();

        for (int i = 0; i < mid - low + 1; i++) {
            left.add(vehicles.get(low + i));
        }
        for (int j = 0; j < high - mid; j++) {
            right.add(vehicles.get(mid + 1 + j));
        }

        int i = 0, j = 0, k = low;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getPrice() <= right.get(j).getPrice()) {
                vehicles.set(k++, left.get(i++));
            } else {
                vehicles.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            vehicles.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            vehicles.set(k++, right.get(j++));
        }
    }
    
    public static void displayByLowerThanAmount(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found");
        } else {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter price: ");
            double price = userInput.nextDouble();
            System.out.println("pls");

            for (Vehicle vehicle : vehicles)
                if (price >= vehicle.getPrice()) {
                    System.out.println(vehicle);
                }
        }
    }

    public static void displayElectricAboveRange(ArrayList<Vehicle> vehicles) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter EV range: ");
        int range = userInput.nextInt();

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof ElectricCar)
                if (((ElectricCar) vehicle).getRange() > range)
                    System.out.println(vehicle);
        }
    }

    public static void writeVehiclesToFile(ArrayList<Vehicle> vehicles, File vehicleRecords) {
        try {
            FileWriter fw = new FileWriter(vehicleRecords) ;

            for(Vehicle vehicle : vehicles) {
                fw.write(vehicle.toString());
            }
            fw.close();
            System.out.println("Vehicles written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    public static void readVehiclesFromFile(ArrayList<Vehicle> vehicles, File vehicleRecords) {
        vehicles.clear();

        if (!vehicleRecords.exists()) {
            System.out.println("Vehicle Records does not exist");
            return;
        }

        try ( Scanner fr = new Scanner(vehicleRecords) ) {

            while (fr.hasNextLine() && vehicles.size() < 50) {
                String[] vicData = fr.nextLine().split(" ") ;

                String vin = vicData[1].trim();
                String make = vicData[2].trim();
                double price = Double.parseDouble(vicData[3].trim());

                switch (vicData[0]) {
                    case "Motorcycle":
                        int speed = Integer.parseInt(vicData[4]);
                        Vehicle addMotorcycle = new Motorcycle(vin, make, price, speed) ;
                        vehicles.add(addMotorcycle);
                        break ;
                    case "Truck":
                        int tow_capacity = Integer.parseInt(vicData[4]);
                        Vehicle addTruck = new Truck(vin, make, price, tow_capacity) ;
                        vehicles.add(addTruck);
                        break ;
                    case "SUV":
                        int seats = Integer.parseInt(vicData[4]);
                        Vehicle addSUV = new SUV(vin, make, price, seats) ;
                        vehicles.add(addSUV);
                        break ;
                    case "ElectricCar":
                        int range = Integer.parseInt(vicData[4]);
                        Vehicle addElectric = new ElectricCar(vin, make, price, range) ;
                        vehicles.add(addElectric);
                        break ;
                    case "GasCar":
                        int horsepower = Integer.parseInt(vicData[4]);
                        Vehicle addGas = new GasCar(vin, make, price, horsepower) ;
                        vehicles.add(addGas);
                        break ;
                    case "HybridCar":
                        int mpg = Integer.parseInt(vicData[4]);
                        Vehicle addHybrid = new HybridCar(vin, make, price, mpg) ;
                        vehicles.add(addHybrid);
                        break ;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Vehicle Records does not exist");
            e.printStackTrace();
        }
    }
}

class Vehicle {
    protected String vin ;
    protected String make ;
    protected double price ;

    public Vehicle(String vin, String make, double price) {
        this.vin = vin;
        this.make = make;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return vin + " " + make + " " + price;
    }
}

class Motorcycle extends Vehicle {
    private int speed ;

    public Motorcycle(String vin, String make, double price, int speed) {
        super(vin, make, price);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Motorcycle" + " " +
                super.toString() + " " + speed ;
    }
}

class Truck extends Vehicle {
    private int tow_capacity ;

    public Truck(String vin, String make, double price, int tow_capacity) {
        super(vin, make, price);
        this.tow_capacity = tow_capacity;
    }

    public int getTow_capacity() {
        return tow_capacity;
    }

    public void setTow_capacity(int tow_capacity) {
        this.tow_capacity = tow_capacity;
    }

    @Override
    public String toString() {
        return "Truck" + " " +
                super.toString() + " " + tow_capacity ;
    }
}

class SUV extends Vehicle {
    private int seats ;

    public SUV(String vin, String make, double price, int seats) {
        super(vin, make, price);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "SUV" + " " +
                super.toString() + " " + seats ;
    }
}

class ElectricCar extends Vehicle {
    private int range ;

    public ElectricCar(String vin, String make, double price, int range) {
        super(vin, make, price);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "ElectricCar" + " " +
                super.toString() + " " + range ;
    }
}

class GasCar extends Vehicle {
    private int horsepower ;

    public GasCar(String vin, String make, double price, int horsepower) {
        super(vin, make, price);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "GasCar" + " " +
                super.toString() + " " + horsepower ;
    }
}

class HybridCar extends Vehicle {
    private double mpg ;

    public HybridCar(String vin, String make, double price, double mpg) {
        super(vin, make, price);
        this.mpg = mpg;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    @Override
    public String toString() {
        return "HybridCar" + " " +
                super.toString() + " " + mpg ;
    }
}
