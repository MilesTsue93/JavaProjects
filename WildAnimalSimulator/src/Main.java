public class Main {
    public static void main(String[] args) {

        String animal = args[1];
        switch(animal.toUpperCase()) {
            case "B":
                System.out.println("Bird");
                // other logic

            case "F":
                System.out.println("Frog");

            case "M":
                System.out.println("mouse");

            case "T":
                System.out.println("turtle");

            case "W":
                System.out.println("wolf");
        }

    }
}