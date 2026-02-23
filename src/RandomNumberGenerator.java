import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {

//        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i < 99; i++) {
            int year = random.nextInt(2027,2030);
            int month = random.nextInt(1,13);
            int day = random.nextInt(1,32);
            System.out.println(year + "-" + month + "-" + day);
        }

        System.out.println(179*3);

    }
}
