import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("input.txt");
        writeFile(file);
        readFile(file);
    }

    public static void writeFile(File file) {
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("This is a new sentence");
            fw.close();
            System.out.println("wrote to file");
        } catch (IOException e) {
            System.out.println("Error writing to file") ;
            e.printStackTrace() ;
        }
    }

    public static void readFile(File file) {
        try (Scanner fr = new Scanner(file)) {
            while (fr.hasNextLine()) {
                System.out.println(fr.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace() ;
        }
    }
}
