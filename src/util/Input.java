package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    String getString(String msg){
        System.out.println(msg);
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String input = getString("Type yes/no: ");
        return input.equals("yes") || input.equals("y");
    }
//
    public int getInt(int min, int max){
        int num = getInt();

        if(num < min || num > max){
            System.out.println("Error outside of the boundaries");
            return getInt(min, max);
        }

        return num;
    }
//
    // getInt and getDouble methods make sure that the value returned from method
        //is actually an int or a double
    public int getInt(){
        return Integer.parseInt(getString("Give me a number: "));
//        String s = (); <---Trying to define "s" so that it won't cause issue below
//        try {
//            return Integer.valueOf(String s); <--- This is fussing.
//        } catch (Exception e) {
//            System.out.println("This needs to be a number!");
//        }
    }

    public double getDouble(){
        return Double.parseDouble(getString("Give me a decimal: "));
    }


    public static void main(String[] args) {

        Input input = new Input();

        input.getString("Potatoes can be able companions.");
    }

}
