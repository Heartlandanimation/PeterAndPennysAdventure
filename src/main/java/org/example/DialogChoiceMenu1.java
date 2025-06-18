package org.example;

public class DialogChoiceMenu1 {

    //After Sam the Crow flies down and yells at peter and Penny the following Dialog choices Appear


    public void dialogMenuAgainstSam() {
        System.out.println("\n****************************************************************************");
        System.out.println("--------------- What Should Peter and Penny do?---------------");
        System.out.println("(1) Offer Sam one of the Items"); //Might work, will be randomized, might ask for more.
        System.out.println("(2) Say: Sorry Sam we didn't mean to upset you, we'll leave!"); //WON'T WORK, he'll say you owe him Something
        System.out.println("(3) Say: Beat it Sam! This is Pennies garbage"); // WIll Lead Directly into a FIGHT
        System.out.println("(4) Look at Penny and Wink; (Activate PLAY DEAD PROTOCALL"); // will lead to OMG... isAngry = false
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


    public void AgainstSam_ChoiceOne(){
        // ((Dialog))


        // Needs Logic that References Array


        //if Sam accepts
            // Remove Item from <ArrayList>
        //-----------------------------------------------
            // ((Dialog))
            // Peter and Penny walk away

        //If Sam rejects
            //Offer another Item
            //Remove Item from <ArrayList>

            //If Sam Accepts
                  // ((Dialog))
                  // Peter and Penny walk away
            //If Sam rejects
                 //Offer another Item
                 //Remove Item from <ArrayList>
                //SO ON AND SO FORTH UNTIL YOUR ARRAY LIST IS EMPTY :((
    }

    public void AgainstSam_ChoiceTwo(){
        System.out.println("Penny Says: Sorry Sam, we didn't mean to upset you, we'll leave you alone, Come on Peter~");
        System.out.println("Sam: NOW HOLD UP, After disturbing me,I think i deserve a little a bit more than an apology");
        System.out.println("Sam: What did you get out of that trashcan?\nGIVE ME SOMETHING"); //Triggers Simple Menu
    }
    public void AgainstSam_ChoiceThree(){
        System.out.println("Oh hell No! those are fighting words!\nSam raised his fists\nPut em up!!");
    }

    public void AgainstSam_ChoiceFour(){
        System.out.println("Peter and Penny both clutch their hearts and fall on their backs, pose like they are Rigor Mortis and lul their tongues out");
        System.out.println("Sam: Oh my Gosh! these two just died out of nowhere! I gotta get out of here\n I'm NOT GONNA GET BLAMED FOR THIS");
    }

}
