package org.example;

import org.example.WorksWithTheArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        ContinueTheStory continueTheStory = new ContinueTheStory();
        CharacterDescriptions characterDescriptions = new CharacterDescriptions();
        DialogChoiceMenu1 dialogChoiceMenu1 = new DialogChoiceMenu1();
        continueTheStory.OpeningCredits();
//                   //choice
        continueTheStory.areYouAwake();
        characterDescriptions.describePeter();
        continueTheStory.nextPartOfTale();
//                   //choice
        continueTheStory.playerChoice1();
        characterDescriptions.describePenny();
        continueTheStory.pennyTalkingToPeter();
//                     //choice
        continueTheStory.doYouWantToHelp();
        continueTheStory.knockingOverTrashcan();
//                  //Computation
        WorksWithTheArray ourArray = new WorksWithTheArray();
        ourArray.pennyMunchingStoryElement();
//                   //choice
        ourArray.guessHowManyTimesPennyBites();
        continueTheStory.describingPennyEatingFood();
//                  //Computation
        ourArray.remainingItemsInInventory();
        continueTheStory.pennyFinishedEatingAndTalksWithPeter();
        continueTheStory.samYellingAtPeterAndPenny();
        characterDescriptions.describeSamTheCrow();

        //Dialog Menu Choice
        dialogChoiceMenu1.dialogMenuAgainstSam();
        dialogChoiceMenu1.MethodControlMenu();
    }
}



































































//        while (playerisAwake = true;){
//        ContinueTheStory continueTheStory = new ContinueTheStory();
//        CharacterDescriptions characterDescriptions = new CharacterDescriptions();
//
//        continueTheStory.OpeningCredits();
//        characterDescriptions.describePeter();
////        continueTheStory.areYouAwake();
//
//        if(continueTheStory.playerIsAwake) {
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//        if(continueTheStory.playerIsAwake) {
//            continueTheStory.nextPartOfTale();
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//        if(continueTheStory.playerIsAwake) {
//            continueTheStory.playerChoice1();
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//        if(continueTheStory.playerIsAwake) {
//            characterDescriptions.describePenny();
//            continueTheStory.breakers();
//            continueTheStory.pennyTalkingToPeter();
//            continueTheStory.breakers();
//            continueTheStory.doYouWantToHelp();
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//        if(continueTheStory.playerIsAwake) {
//            continueTheStory.knockingOverTrashcan();
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//        WorksWithTheArray worksWithTheArray = new WorksWithTheArray();
//        if(continueTheStory.playerIsAwake) {
//            ArrayList<String> pickingFood = worksWithTheArray.food;
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//        if(continueTheStory.playerIsAwake) {
//            worksWithTheArray.pennyMunchingStoryElement();
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//        if(continueTheStory.playerIsAwake) {
//            worksWithTheArray.guessHowManyTimesPennyBites();
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//        if(continueTheStory.playerIsAwake) {
//            continueTheStory.describingPennyEatingFood();
//            continueTheStory.breakers();
//        } else {
//            System.out.println(" ");
//        }
//
//
//
//
//
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//













/*********************Confusion************************/
//    private Logger logger;
//    public void run(){
//        String fileName = "logFile.txt";
//        try {
//            logger = new Logger(fileName);
//        } catch (IOException e) {
//            System.out.println("Unable to open");
//            System.exit(1);
//        }
//
//        /***************************************************/