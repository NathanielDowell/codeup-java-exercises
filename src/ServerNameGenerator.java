import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives = {"Emaciated", "Tricksy", "Clandestine", "Ornery", "Tasty", "Pernicious", "Crispy", "Mushy", "Spartan", "Partisan", "Cold", "Oily", "Scatterbrained", "Clueless", "Unreliable", "Foggy", "Insidious"};
    static String[] nouns = {"Narwahl", "Sadman", "Squid", "Museum", "Whistler", "Train", "Chicken", "Pooter", "Grump", "Spork", "Trout", "Potato", "Enchilada", "Vampire-hunter", "Harry Potter Fan", "Man-Child", "Goose", "Rainbow", "Fluster-muffin" };

    //instantiate the randomizer
    static Random randomizer = new Random();

//method takes in an array of strings, arrayStrings is a placeholder for the array, and returns a random string item
    public static String randomWord (String[] arrayStrings) {
        return arrayStrings[randomizer.nextInt(arrayStrings.length)];
    }

    //method takes in two strings and concatenates them, but uses randomWord with array inputs instead of a simple string.
    public static String newServerName(String adjective, String noun) {
        return "Server name: " + adjective + "-" + noun;
    }


    public static void main(String[] args) {

        System.out.println("Tacos are friends too.");

        System.out.println(newServerName(randomWord(adjectives), randomWord(nouns)));
        System.out.println(newServerName(randomWord(adjectives), randomWord(nouns)));
        System.out.println(newServerName(randomWord(adjectives), randomWord(nouns)));
        System.out.println(newServerName(randomWord(adjectives), randomWord(nouns)));
        System.out.println(newServerName(randomWord(adjectives), randomWord(nouns)));
        System.out.println(newServerName(randomWord(adjectives), randomWord(nouns)));
    }
}