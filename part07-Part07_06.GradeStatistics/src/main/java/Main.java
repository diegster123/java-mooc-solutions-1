
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grade = new Grades();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeDistribution userInterface = new GradeDistribution(grade, scanner);
        userInterface.start();
    }
}
