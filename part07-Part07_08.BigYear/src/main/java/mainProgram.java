
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> birdList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
//            Implement as ui.start()
            System.out.println("? ");
            String input = scan.nextLine();
            
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
//                add(); IMPLEMENT METHOD
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scan.nextLine();

                birdList.add(new Bird(name, latin));
            }
            if (input.equals("Observation")) {
//                observe(); IMPLEMENT METHOD
                System.out.println("Bird? ");
                String name = scan.nextLine();
                for (Bird bird : birdList) {
                    if (bird.getBird().contains(name)) {
                        bird.addObservation();
                    }
                }
            }
            if (input.equals("All")) {
//                printAllBirds(); IMPLEMENT METHOD
                for (Bird birds : birdList) {
                    System.out.println(birds);
                }
            }
            if (input.equals("One")) {
//                printOneBird(); IMPLEMENT METHOD
            }
        }

    }

}
