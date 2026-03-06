
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class GradeDistribution {

    private Grades grade;
    private Scanner scan;

    public GradeDistribution(Grades grade, Scanner scanner) {
        this.grade = grade;
        this.scan = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(this.scan.nextLine());

            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 100) {
                this.grade.add(input);
            }
        }
        printAverage();
        printPassingAveage();
        printPassPercentage();
        printGradeDistribution();
    }

    private void printAverage() {
        System.out.println("Point average (all): " + grade.average());
    }

    private void printPassingAveage() {
        if (grade.passingAverage() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grade.passingAverage());
        }
    }

    private void printPassPercentage() {
        System.out.println("Pass percentage: " + grade.passPercentage());
    }

    private void printGradeDistribution() {
        this.grade.printGradeDistribution();
    }

}
