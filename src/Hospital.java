import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("Inpatient, Outpatient or Quit: ");
            String patientID = userInput.nextLine();

            switch(patientID.toLowerCase()) {
                case "inpatient":
                    System.out.println("The final amount for impatient charges is: " + inpatient()) ;
                    break;
                case "outpatient":
                    System.out.println("The final amount for outpatient charges is: " + outpatient()) ;
                    break;
                case "quit":
                    System.out.println("Exiting...");
                    return ;
                default: System.out.println("Invalid input. Try again.");
            }
        } while (true);
    }

    public static double inpatient() {
        System.out.println("Inpatient.");

        System.out.print("Enter the number of days spent in the hospital: ");
        double days_spent = getCostAndCheckNonNegative() ;

        System.out.print("Enter the daily rate: ");
        double daily_rate = getCostAndCheckNonNegative() ;

        System.out.print("Enter the amount for hospital charges (lab tests, etc.): ");
        double charges = getCostAndCheckNonNegative() ;

        System.out.print("Enter the amount for medication charges: ");
        double hospital_medication_charges = getCostAndCheckNonNegative() ;

        return calcCost(days_spent, daily_rate, charges, hospital_medication_charges) ;
    }

    public static double outpatient() {
        System.out.print("Enter the amount for hospital charges (lab tests, etc.): ");
        double charges = getCostAndCheckNonNegative() ;

        System.out.print("Enter the amount for medication charges: ");
        double hospital_medication_charges = getCostAndCheckNonNegative() ;

        return calcCost(charges, hospital_medication_charges) ;
    }

    public static double calcCost(double charges, double hospital_medication_charges) {
        return charges + hospital_medication_charges ;
    }

    public static double calcCost(double days_spent, double daily_rate, double charges, double hospital_medication_charges) {
        return (days_spent * daily_rate) + charges + hospital_medication_charges ;
    }

    public static double getCostAndCheckNonNegative() {
        Scanner userInput = new Scanner(System.in);
        double number = userInput.nextDouble() ;
        while (number <= 0) {
            System.out.print("Enter a number greater than 0: ");
            number = userInput.nextDouble();
        }
        return number ;
    }
}