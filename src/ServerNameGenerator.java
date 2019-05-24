import java.util.Random;

public class ServerNameGenerator {
    static String[] adjs = {"Emaciated", "Tricksy", "Clandestine", "Ornery", "Tasty", "Pernicious", "Crispy", "Mushy", "Spartan", "Partisan"};
    static String[] nouns = {"Narwahl", "Fish", "Squid", "Museum", "Whistler", "Train", "Rhino", "Pooter", "Grump", "Spork"};

    static Random randomizer = new Random();

    public static String randomWord (String[] strings) {
        return strings[randomizer.nextInt(strings.length)];
    }

    public static String newServerName(String adj, String noun) {
        return "Your new server name has been created:\n" +
                adj+"-"+noun;
    }

    public static void main(String[] args) {
        System.out.println(newServerName(randomWord(adjs), randomWord(nouns)));
    }
}