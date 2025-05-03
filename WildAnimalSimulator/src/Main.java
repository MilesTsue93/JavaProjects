import animals.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random animalGenerator = new Random(42);
        for (int i = 0; i < 7; i++) {

            int nextChar = animalGenerator.nextInt();
            String animal = "B";

            // loop the above.

            switch(animal) {
                case "B":
                    System.out.println("Bird");
                    Bird bird = new Bird();
                    // other logic

                case "F":
                    System.out.println("Frog");
                    Frog frog = new Frog();

                case "M":
                    System.out.println("mouse");
                    Mouse mouse = new Mouse();

                case "T":
                    System.out.println("turtle");
                    Turtle turtle = new Turtle();

                case "W":
                    System.out.println("wolf");
                    Wolf wolf = new Wolf();
            }
        }
    }
}