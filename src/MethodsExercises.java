import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");


        System.out.println("5 + 7 = " + addition(5,7) + "!");

        System.out.println("5 + 7 = " + subtraction(5, 7) + "!");

        System.out.println("5 * 7 = " + multiplication(5, 7) + "!");

//        System.out.println("5 / 7 = " + division(5, 7) + "!");
//
//        System.out.println("5 % 7 = " + modulus(5, 7) + "!");

        String answer = "Y";

        while(answer.equals("Y")){
            dice();
            System.out.println("Do you want to continue? Y/N");
            answer = scan.nextLine().toUpperCase();
        }
    }


    //===Addition Method ====//

    public static int addition(int number1, int number2){
        return number1 + number2;
    }

    //===Subtraction Method ===//

    public static int subtraction(int number1, int number2){
        return number1 - number2;
    }

    //=== Multiplication Method ==//

    public static int multiplication(int number1, int number2){
        return number1 * number2;
    }

    //=== Division ==== //

    //====Input Range Validation ===//
    public static int getInteger(int min, int max) {
        System.out.println("Give me a number!");
//        int input = Integer.parseInt(scan.nextLine());
//
//        if (input >= min && input <= max) {
//            return input;
//
//        } else {
//            System.out.println("Number out of range!");
//            return getInteger(min, max);

        return 0;
    }

    public static void factorial(){
        int number = getInteger(1,10);
        String output = "";
        int total = 1;

        for(int i = 1; i <= number; i++) {
            total *= 1;
            output += i+ "! = ... = " + (total) +"\n";
        }
    }

    public static void dice() {
        int sides = getInteger(1,100);

        int rnd = (int) (Math.random() * sides ) + 1;
        int rnd2 = (int) (Math.random() * sides ) + 1;

        System.out.println("rnd = " + rnd);
        System.out.println("rnd2 = " + rnd2);
    }

    public static void game(int random) {
        do {
            int guess = getInteger(1,100);
            if(guess > random) {
                System.out.println("Go LOWER");
            } else if (guess < random) {
                System.out.println("Go HIGHER");
            } else {
                System.out.println("You guessed right!");
            }
        } while(true);
    }



}
