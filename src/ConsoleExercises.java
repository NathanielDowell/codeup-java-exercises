import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s.\n", pi);

        //=======Call the scanner once.==================//

        Scanner scanner = new Scanner(System.in);


        //========Input Anything.==================//

//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //=========Input Integer==============//

//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInt + "\" <--");

        //=======Prompt for 3 words===========//

//        System.out.print("Enter three words: ");
//        String var1 = scanner.next();
//        String var2 = scanner.next();
//        String var3 = scanner.next();
//
//        System.out.println("You entered: --> \"" + var1 + " " + var2 + " " + var3 + "\"<--");

        //======Sentence=============//

        //======Delimiter allows the ability to tell the computer how to separate information (\n is a return, but you can use other characters.==========//
//        scanner.useDelimiter("\n");

//        System.out.print("Write me a big, beautiful sentence: ");
//        String userSentence = scanner.nextLine();
//
//        System.out.println(userSentence);
        //======Perimeter======//
        System.out.print("Enter the length and width of your CodeUp classroom (provide two whole numbers, separated by a space, assume feet):");
        int measurement1 = scanner.nextInt();
        int measurement2 = scanner.nextInt();

        System.out.println("The area of the room is " + (measurement1 * measurement2) + " ft.");

//        System.out.print("Hey stranger, what's your hero name?");
//        String heroName = scanner.nextLine();
//
//        System.out.println("Welcome, " + heroName + "!  Are you ready to start?");
    }

}
