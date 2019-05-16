import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;

            }
//==========Counting by 2s to 100==============//

        int j = 0;

        do {
            if(j % 2 == 0) {

                System.out.println(j);
            }
                j++;

        } while(j <= 100);
//===========Count backwards by 5s from 100 to -10 =======//

        System.out.println("BANANA");

        int k = 100;

            do{
                System.out.println(k);
                k -= 5;

            } while(k >= -10);

        System.out.println("BANANA");

            //============square numbers from 2 to -1,000,000

            long start = 2;
            do {
                System.out.println(start);
                start *= start;
            } while(start < 1000000);

            //refactor previous 2 exercises with for-loop//
        for(int x = 100; x >= -10; x -=5) {
            System.out.println(x);
        }

        for(long y= 2; y < 1000000; y*=y){
            System.out.println(y);
        }

        //======FIZZBUZZ==========//

        for (int a = 1; a <= 100; a++) {
          if (a % 15 == 0) {
              System.out.println("FizzBuzz");
          } else if (a % 5 == 0) {
              System.out.println("Buzz");
          } else if (a % 3 == 0) {
              System.out.println("Fizz");
          } else {
              System.out.println(a);
          }
        }

        //====Display a table of powers =====//

        System.out.println("Please enter an integer");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int userInput = sc.nextInt();
        System.out.println("Do you want to continue?");
        String answer = sc.next();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        if (answer.equalsIgnoreCase("yes")){
            for(int b = 1; b <= userInput; b++) {
                int squared = b*b;
                int cubed = b*b*b;
                System.out.printf("%-7d|%-9d|%-6d%n",b, squared, cubed);
            }
        }

        //Convert number grades into letter grades//

        System.out.println("Please enter the student's grade:");
        int grade = sc.nextInt();
        System.out.println("Do you want to continue?");
        String userAnswer = sc.next();
        if(userAnswer.equalsIgnoreCase("yes")) {
            if(grade >= 90) {
                System.out.println("You got an A! Excellent job.");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("You get a B. You aren't as good as the A students.");
            } else if (grade >= 70 && grade <= 79) {
                System.out.println("A C is average, but not really.  Work harder.");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("D. You you sort of passed. D is for Dumb.");
            } else {
                System.out.println("F for failure.  Sad.");
            }
        }


        }

    }
