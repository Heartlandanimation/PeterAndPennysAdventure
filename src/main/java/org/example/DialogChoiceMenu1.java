package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static org.example.WorksWithTheArray.food;

public class DialogChoiceMenu1 {

    //After Sam the Crow flies down and yells at peter and Penny the following Dialog choices Appear


    public void dialogMenuAgainstSam() {
        System.out.println("\n****************************************************************************");
        System.out.println("--------------- What Should Peter and Penny do?---------------");
        System.out.println("(1) Offer Sam one of the Items"); //Might work, will be randomized, might ask for more.
        System.out.println("(2) Say: Sorry Sam we didn't mean to upset you, we'll leave!"); //WON'T WORK, he'll say you owe him Something
        System.out.println("(3) Say: Beat it Sam! This is Pennies garbage"); // WIll Lead Directly into a FIGHT
        System.out.println("(4) Look at Penny and Wink: (Activate PLAY DEAD PROTOCALL)"); // will lead to OMG... isAngry = false
        System.out.print("Enter choice: ");
    }

    public void simpleDialogMenuAgainstSam(){
        System.out.println("--------------- Give in to Demands?---------------");
        System.out.println("(1) Offer Sam one of the Items"); //Might work, will be randomized, might ask for more.
        System.out.println("(2) Say: No these are ours! Find your own Sam"); //Triggers Fight
        System.out.print("Enter choice: ");
    }

    public void fightMenu(){
        System.out.println("--------------- Fight or RunAway---------------");
        System.out.println("(1) Fight Sam"); //Peter Wins Handedly
        System.out.println("(2) Run Away"); //Run Away without any issue
        System.out.println("(3) [Perception] Size him up first, can you win?"); //Triggers really stupid Dialog lol
        System.out.print("Enter choice: ");
    }


    public void AgainstSam_ChoiceOne() {
        System.out.println("\n****************************************************************************\n");
        food();
        boolean samAccepts = false;
        while (!samAccepts) {
            ///////////
            Random randomNumber = new Random();
            Random randomItem = new Random();
            int randomInt = randomNumber.nextInt(2) + 1;
            System.out.println(randomInt);
            ////////////
            if (randomInt == 1) {
                int randomIndex = randomItem.nextInt(food.size());
                System.out.println("Peter and Penny give same an Item");
                System.out.println("Sam: This isn't enough for me, GIVE ME MORE!");
                food.remove(randomIndex);
                System.out.println("Current food list: " + food);
            } else if (randomInt == 2) {
                int randomIndex = randomItem.nextInt(food.size());
                System.out.println("Peter and Penny give same an Item");
                System.out.println("Sam: Alright, that's enough... get out of here!");
                food.remove(randomIndex);
                samAccepts = true;
                System.out.println("Current food list: " + food);
            }
        }
    }

    public void AgainstSam_ChoiceTwo(){
        System.out.println("\n****************************************************************************\n");
        System.out.println("Penny Says: Sorry Sam, we didn't mean to upset you, we'll leave you alone, Come on Peter~");
        System.out.println("Sam: NOW HOLD UP, After disturbing me, I think i deserve a little a bit more than an apology");
        System.out.println("Sam: What did you get out of that trashcan?\nSam: GIVE ME SOMETHING"); //Triggers Simple Menu
        AgainstSam_ChoiceOne();
    }
    public void AgainstSam_ChoiceThree(){
        System.out.println("\n****************************************************************************\n");;
        System.out.println("Oh hell No! those are fighting words!\nSam raised his fists\nPut em up!!");
        System.out.println("\n****************************************************************************\n");
    }

    public void AgainstSam_ChoiceFour(){
        System.out.println("\n****************************************************************************\n");
        System.out.println("Peter and Penny both clutch their hearts and fall on their backs, pose like they are Rigor Mortis and lul their tongues out");
        System.out.println("Sam: Oh my Gosh! these two just died out of nowhere! I gotta get out of here!!\nSam: I'm NOT GONNA GET BLAMED FOR THIS");
        System.out.println("Sam Flies away");
    }

    //Run Method that walls all through this shit

    public void MethodControlMenu(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        boolean doneWithMenu = false;
        while(!doneWithMenu){
            if (userInput.equals("1")){
                AgainstSam_ChoiceOne();
                doneWithMenu = true;
            }
            else if (userInput.equals("2")){
                AgainstSam_ChoiceTwo();
                doneWithMenu = true;

            }
            else if (userInput.equals("3")){
                AgainstSam_ChoiceThree();
                fightMenu();
                //needs more above :O
                doneWithMenu = true;
            }
            else if (userInput.equals("4")){
                AgainstSam_ChoiceFour();
                doneWithMenu = true;
            } else {
                System.out.println("eat shit bird");
                doneWithMenu = true;
            }

        }




    }




}
