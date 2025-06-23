package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WorksWithTheArray {
     static ArrayList<String> food = new ArrayList<>();

    public WorksWithTheArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n****************************************************************************");
        System.out.println("Type out a food item: ");
        String userInput = scanner.nextLine();
        food.add(userInput);
        System.out.println("Current food list: " + food);
        while (food.size() < 5) {
            System.out.print("Tell me more food, I'm still hungry: ");
            userInput = scanner.nextLine();
            food.add(userInput);
            System.out.println("Current food list: " + food);
        }

    }

    public static void food() {
    }


    public void pennyMunchingStoryElement() {
        System.out.println("\n****************************************************************************");
        System.out.println("Penny smiles and licks her lips\nMmmm These look great!");
        System.out.println("I'm gonna start munching on the <" + food.get(2) + "> it looks the most tasty!");
        food.remove(2);
        System.out.println("\n****************************************************************************");
        System.out.println("your remaining Food Items are: ");
        System.out.println(food);
    }

    public void guessHowManyTimesPennyBites(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n****************************************************************************");
        System.out.println("Hey guess how many bites it take for Penny to eat that snack!");
        System.out.println("Guess a number between 1 and 50, I'll tell you if you're getting close");
        Random randomNumber = new Random();
        int randomGuess = randomNumber.nextInt(1,50);
        boolean exit = false;

        while (!exit) {
            int userInput = scanner.nextInt();
            if (randomGuess > userInput){
                System.out.println("No Higher!");
            }
            if (randomGuess < userInput){
                System.out.println("No Lower!");
            }
            if (randomGuess == userInput){
                System.out.println("Yes that's exactly it! Look at her go!");
                exit = true;
            }
        }


    }

    public void remainingItemsInInventory(){
        System.out.println("\n****************************************************************************");
        System.out.println("your remaining Food Items are: ");
        System.out.println(food);
    }


}


