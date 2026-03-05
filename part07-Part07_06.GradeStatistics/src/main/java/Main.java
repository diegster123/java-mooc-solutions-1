
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grade = new Grades();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input >= 0 && input <= 100) {
                grade.add(input);
            }
        }
        
        System.out.println("Point average (all): " + grade.average());
            if (grade.passingAverage() == 0) {
                System.out.println("Point average (passing): -");
            } else {
                System.out.println("Point average (passing): " + grade.passingAverage());
            }
        System.out.println("Pass Percentage: " + grade.passPercentage());
    }
}
