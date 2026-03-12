
import java.util.ArrayList;
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
public class UserInterface {

    private ArrayList<Bird> birdList;
    private Scanner scanner;

    public UserInterface(ArrayList<Bird> birdList, Scanner scanner) {
        this.birdList = new ArrayList<>();
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("? ");
            String input = scanner.nextLine();

            if (input.equals("Quit")) {
                break;
            }
            birdCommands(input);
        }

    }

    public void birdCommands(String input) {
        if (input.equals("Add")) {
            add();
        }
        if (input.equals("Observation")) {
            observe();
        }
        if (input.equals("All")) {
            printAllBirds();
        }
        if (input.equals("One")) {
            printOneBird();
        }
    }

    public void add() {
        System.out.println("Name: ");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latin = this.scanner.nextLine();

        this.birdList.add(new Bird(name, latin));
    }

    public void observe() {
        System.out.println("Bird? ");
        String name = this.scanner.nextLine();
        boolean found = false;
        for (Bird bird : this.birdList) {
            if (bird.getBird().equals(name)) {
                bird.addObservation();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public void printAllBirds() {
        for (Bird birds : this.birdList) {
            System.out.println(birds);
        }
    }

    public void printOneBird() {
        System.out.println("Bird? ");
        String name = this.scanner.nextLine();
        for (Bird bird : birdList) {
            if (bird.getBird().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}
