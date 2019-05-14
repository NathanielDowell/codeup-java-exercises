
//==== Import the scanner, then call it in the class, below. =======//

import java.util.Scanner;

public class AdventureGame {

//====== My Methods! (Java functions) ======//

    //======= Delay ============//
    public static void gameDelay() {
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(".....");
        }
    } //========End Pause==========//
    public static void main(String[] args) {

        //=======Call the scanner once.=============//

        Scanner scanner = new Scanner(System.in);

        //======Start the game!====================//

        System.out.print("Hey stranger, what's your hero name?\n");
        String heroName = scanner.nextLine();

        System.out.println("Welcome, " + heroName + "!  Are you ready to start?");
        String start = scanner.nextLine();

        if (start.equals("yes")) {
            System.out.print("Then prepare, brave " + heroName + ", to meet your destiny!\n");
        } else if (start.equals("no")) {
            System.out.print("I'm sorry to hear that.  Maybe you should take a nap.\n");
        }

        //==== Allows me to slow the progress of the text display. ===//


        //======Story Starts======================//

        System.out.print("You leave behind your Comfy Couch and sally forth into a world of adventure.\n");

        gameDelay();

        System.out.print("However, you will always keep Comfy Couch with you in your heart.\n");

        gameDelay();

        System.out.print("Fresh Air attacks!!\n");

        gameDelay();

        System.out.print("You have an allergic reaction to Fresh Air and die.\n");
    }
}
