package org.example;

import java.util.Scanner;


public class ContinueTheStory {
    private int poopy = 1;
    ColorPrinter newColor = new ColorPrinter();
    public void OpeningCredits() {
        
        System.out.println("**********************");
        System.out.println("**********************");
        System.out.println("The Scene opens on a Sunny New Orleans Day");
        System.out.println("Our camera pans onto a unique fellow in overalls hanging out in a park. \nA fellow named Peter.");
        System.out.println("**********************");
        System.out.println("**********************");
    }
    public void areYouAwake() {
        boolean playerIsAwake = false;
        while (!playerIsAwake) {
            Scanner input = new Scanner(System.in);
            System.out.print("Would you like to Continue the Story? Y/N: ");
            String userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("Y")) {
                playerIsAwake = false;
                break;
            } else {
                System.out.println("Peter drifts to sleep never to wake again...");
                playerIsAwake = true;
                System.exit(0);

            }
        }
    }

    public void nextPartOfTale() {
        System.out.println("\n****************************************************************************");
        System.out.println("Peter is the type of fellow who likes to sleep with his strawHat over his eyes\n" +
                "When you live in a hot climate...resting under a shade tree in the mid afternoon sun is a dream\n" +
                "Peter find himself sleeping for a few hours more before anything interesting happens\n" +
                "at 6 pm something happens, you choose what happens next!");
    }

    public void playerChoice1() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n****************************************************************************");
        System.out.print("1) A heavy object Falls from the tree landing on Peters groin\n" +
                "2) Something is pulling on Peters foot trying to wake him up\n" +
                "What option do you choose?: (1) or (2) ");
        String userInput = input.nextLine();
        if (userInput.contains("1")) {
            System.out.println("****************************************************************************");
            System.out.println("\nPeter Stands Up with a start, Oh man that didn't feel good!");
            System.out.println("Before Peter is his friend Penny");
        } else if (userInput.contains("2")) {
            System.out.println("****************************************************************************");
            System.out.println("\nPeter stirs slowly and lifts his hat to see whats touching him");
            System.out.println("Before Peter is his friend Penny");
        }

    }



    public void pennyTalkingToPeter() {
        System.out.println("Hi Peter! Can you help me figure out what to eat today?\n");
    }

    public void knockingOverTrashcan() {
        System.out.println("\n****************************************************************************");
        System.out.println("Penny and Peter find a trashcan\nPenny knocks it over and items spill out\nPenny asks: Can you tell me what food items you see?: ");
    }


    public void doYouWantToHelp() {
//        boolean playerIsAwake = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to Help Penny Y/N: ");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("Y")) {
            System.out.println("\n****************************************************************************");
            System.out.println("Peter Nods his head yes");

        } else {
            System.out.println("\n****************************************************************************");
            System.out.println("Peter shakes his head no");
            System.exit(0);

        }
    }

    public void describingPennyEatingFood() {
        System.out.println("\n****************************************************************************");
        System.out.println("If you've never watched a opossum eat food before do yourself a favor and watch this:\nhttps://www.youtube.com/watch?v=Rfbj2YgqtLM");
        System.out.println("Penny takes big bites of the food");
    }

    public void pennyFinishedEatingAndTalksWithPeter() {
        System.out.println("\n****************************************************************************");
        System.out.println("Penny burps\nPenny: Peter that was so tasty! and Look! we still have so much food we can save for Later!");
        System.out.println("Peter: gives Penny a thumbs up");

    }

    public void samYellingAtPeterAndPenny() {
        System.out.println("\n****************************************************************************");
        System.out.println("a voice calls from above:\nStranger:");
        newColor.printlnRed("HEY YOU TWO, WHAT DO YOU THINK YOU'RE DOING???");
        System.out.println("\n****************************************************************************");
        System.out.println("Peter and Penny look upwards, and see a crow in the tall oak tree above the trashcan");
        System.out.println("it flies down and confronts them...Ah its Sam the Crow.");

    }
}


//    public void Empty(){
//        System.out.println("\n****************************************************************************");