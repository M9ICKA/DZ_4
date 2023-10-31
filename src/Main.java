import LongboardShop.Longboard;
import LongboardShop.PeniBoard;
import LongboardShop.Skate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's go for a ride???\n1 - Yes\n2 - No");
        int userChoise = scanner.nextInt();
        String manufacturer;
        String typeDeck;
        String materialsDecks;
        String trucks;

        for (; userChoise != 1 && userChoise != 2; ) {
            System.out.println("you enter not 1 or 2");
            userChoise = scanner.nextInt();
        };
        while (userChoise == 1) {
            System.out.println("Where will we go for a ride???\n1 - In town\n2 - To a skate spot\n3 - Ride on the bike path");
            userChoise = scanner.nextInt();
            scanner.nextLine();
            for (; userChoise != 1 && userChoise != 2 && userChoise !=3; ) {
                System.out.println("Select option 1, 2 or 3");
                userChoise = scanner.nextInt();
                scanner.nextLine();
            };
            switch (userChoise) {
                case 1:
                    System.out.print("Indicate which manufacturer you want the board - ");
                    manufacturer = scanner.nextLine();
                    typeDeck = "Cruiser";
                    System.out.print("What material do you want the board from? - ");
                    materialsDecks = scanner.nextLine();
                    trucks = "TKP — traditional kingpin";
                    PeniBoard myPenni = new PeniBoard(manufacturer, typeDeck, materialsDecks, trucks);
                    System.out.println("We take our custom Penny consisting of " + myPenni.getBoardInfo() +
                            "\nAnd let's go for a ride into the city");
                    System.out.println("We're driving around the city. We can see different sights.");
                    break;
                case 2:
                    System.out.print("Indicate which manufacturer you want the board - ");
                    manufacturer = scanner.nextLine();
                    typeDeck = "Skate";
                    System.out.print("What material do you want the board from? - ");
                    materialsDecks = scanner.nextLine();
                    trucks = "TKP — traditional kingpin";
                    Skate mySkate = new Skate(manufacturer, typeDeck, materialsDecks, trucks);
                    System.out.println("We arrived at the skate spot. Everyone is interested in our board and we answerthem"
                            + mySkate.getBoardInfo() + "\nand we practice different tricks");
                    break;

                case 3:
                    System.out.print("Indicate which manufacturer you want the board - ");
                    manufacturer = scanner.nextLine();
                    System.out.print("What deck shape do you want for your longboard? - ");
                    typeDeck = scanner.nextLine();
                    System.out.print("What material do you want the board from? - ");
                    materialsDecks = scanner.nextLine();
                    trucks = "RKP — reversed kingpin";
                    Longboard myLongBoard = new Longboard(manufacturer, typeDeck, materialsDecks, trucks);
                    System.out.println("We got out on the bike path with friends and they were very interested in our new complete set consisting of"
                            + myLongBoard.getBoardInfo() + "\nWe rode the entirebike"
                            + " path several times. We saw a bunch of beautiful views and had a great time.");
                    break;
            }
            System.out.println("Are we going home or are we going to ride some more????\n1 - Ride some more\n2 - Go home");
            userChoise = scanner.nextInt();
            if (userChoise == 2) {
                userChoise++;
            }
            ;
        }
        if (userChoise == 2) {
            System.out.print("Well, no, no, let's stay at home.");
        } else if (userChoise == 3) {
            System.out.print("We had a great ride and now we can go home.");
        }

    }
}

