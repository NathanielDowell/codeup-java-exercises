import shapes.Circle;
import shapes.Square;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    // We're familiar with Arrays in Java, but just as a reminder, you can declare them like this:
    private static Square[] squaresArray = {new Square(7), new Square(2), new Square(9), new Square(10)};
    // Let's look at the anatomy of declaring an ArrayList...
    private static ArrayList<Square> squaresList = new ArrayList<>();
    // One of those things you CAN do, but probably SHOULDN'T do...
    private static ArrayList badList = new ArrayList();
    // In Java, we can also use HashMaps!
    private static HashMap<Character, Square> squaresHashMap = new HashMap<>();

    public static void main(String[] args) {

        squaresList.add(new Square(8));
        squaresList.add(new Square(14));
//        squaresList.add(new Circle(6));

        squaresHashMap.put('A', new Square(7));
        squaresHashMap.put('B', new Square(22));
//        squaresHashMap.put('D');

        // Why is badList a bad list?
        // He didn't choose to be bad, he was instantiated that way...

//        badList.add(1);
//        badList.add("Bill");
//        badList.add('Q');
//        badList.add(new Circle(6));

//        for (Object element : badList) {
//            System.out.println(element);
//        }

        // Before, when we iterated through an array, we'd use a for loop like so:
//        for (int i = 1; i <= squaresArray.length; i++) {
//            System.out.format("Square number %d has sides with a length of %.1f.%n", i, squaresArray[i-1].getPerimeter()/4);
//            System.out.format("Square number %d has a perimeter of %.1f.%n", i, squaresArray[i-1].getPerimeter());
//            System.out.format("Square number %d has an area of %.1f.%n", i, squaresArray[i-1].getArea());
//        }

        // For ArrayLists, we would iterate through with a for loop like this:
//        for (int i = 1; i <= squaresList.size(); i++) {
//            System.out.format("Square number %d has sides with a length of %.1f.%n", i, squaresList.get(i-1).getPerimeter()/4);
//            System.out.format("Square number %d has a perimeter of %.1f.%n", i, squaresList.get(i-1).getPerimeter());
//            System.out.format("Square number %d has an area of %.1f.%n", i, squaresList.get(i-1).getArea());
//        }

        // However, we can also use a for each loop as well:
//        for (Square square : squaresList) {
//            System.out.format("This square has sides with a length of %.1f, a perimeter of %.1f, and an area of %.1f.%n", square.getPerimeter()/4, square.getPerimeter(),square.getArea());
//        }

        // ArrayLists have many different methods we can use. You've already seen .add(), .size() and .get(), but we also have...

        // .indexOf() = return the first found index of the given item, or -1 if not found

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(22);
        numbersList.add(17);
        numbersList.add(34);
        numbersList.add(42);
        numbersList.add(101);

//        System.out.println(numbersList.indexOf(34));
//        System.out.println(numbersList.indexOf(19));

        // Notice that we are using a method to access the information at a given index, but just like an Array, elements are zero indexed.

        // Something to be careful of when trying to find the index of a list of objects...

        Square hipToBe = new Square (14);
//        System.out.println(squaresList.indexOf(hipToBe));
//        squaresList.add(hipToBe);
//        System.out.println(squaresList.indexOf(hipToBe));
//        System.out.println("--+--+--+--+--+--+--+--");
//        System.out.println(hipToBe.getArea());
//        System.err.println(hipToBe);
//        System.out.println(squaresList.get(1).getArea());
//        System.err.println(squaresList.get(1));
//        System.out.println(squaresList.get(2).getArea());
//        System.err.println(squaresList.get(2));

        // .contains() - Check if an ArrayList contains a given element. Returns a boolean.

//        System.out.println(numbersList.contains(101));
//        System.out.println(numbersList.contains(19));
//        System.out.println("--+--+--+--+--+--+--+--");
//        System.out.println(squaresList.contains(hipToBe));

        // lastIndexOf() - Where indexOf will grab the first occurrence of an object; lastIndexOf will find the last.

        ArrayList<Integer> repeatingThreesAndASix = new ArrayList<>();
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(6);
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(3);
        repeatingThreesAndASix.add(3);

//        System.out.println(repeatingThreesAndASix.indexOf(3));
//        System.out.println(repeatingThreesAndASix.lastIndexOf(3));
//        System.out.println(repeatingThreesAndASix.indexOf(6));
//        System.out.println(repeatingThreesAndASix.lastIndexOf(6));

        // .isEmpty - Return a boolean as to whether the ArrayList is empty or not:

//        ArrayList<Object> empty = new ArrayList<>();
//        System.out.println(empty.isEmpty());
//        System.out.println(repeatingThreesAndASix.isEmpty());

        // .remove - Remove the first occurrence of an object from an ArrayList.
//        System.out.format("The size of the squaresList is %d!%n", squaresList.size());
//        squaresList.remove(hipToBe);
//        System.out.format("The size of the squaresList is %d!%n", squaresList.size());

        // Why'd I have to cast 6 in the code below?
//        repeatingThreesAndASix.remove((Integer) 6);
//        System.out.println(repeatingThreesAndASix.indexOf(6));

        // -- HASH MAPS -----------------------------------------

        // Earlier, we showed how to instantiate a HashMap. Unlike an ArrayList, it had two parameters
        // established in the generics (angle brackets). HashMaps are a collection of key/value pairs.

        HashMap<Integer, String> favoriteCheeses = new HashMap<>();

        // We add to a HashMap by using the put and putIfAbsent methods.
        favoriteCheeses.put(99,"Kraft Singles");
        favoriteCheeses.put(1,"Muenster");
        favoriteCheeses.put(3,"Provolone");
        favoriteCheeses.putIfAbsent(3, "String");
        favoriteCheeses.putIfAbsent(35, "Muenster");

        // Keys have to be unique in a HashMap. The code below will replace the previous information at
        // the key 'A' of the squaresHashMap. putIfAbsent protects the previous information from being
        // overwritten.

//        squaresHashMap.put('A', new Square(18));
//        squaresHashMap.putIfAbsent('A', new Square(21));
//        squaresHashMap.putIfAbsent('C', new Square(7));

        // We can still use the size method to return the size of our HashMap.
//        System.out.println(favoriteCheeses.size());


        // We can also access the value of a HashMap at a given key by using the get method.

//        System.out.println(favoriteCheeses.get(99));
//        System.out.println(favoriteCheeses.get(314));

        // We also have a getOrDefault to help give more helpful results when trying to get information for a HashMap.
//        System.out.println(favoriteCheeses.getOrDefault(3, "Cheese not found."));
//        System.out.println(favoriteCheeses.getOrDefault(1100, "Cheese not found."));

        // We can see if our HashMap contains a key or value with the containsKey and containsValue respectively.
//        System.out.println(favoriteCheeses.containsKey(88));
//        System.out.println(favoriteCheeses.containsValue("Kraft Singles"));

        // We can remove key value pairs with the remove method.
//        favoriteCheeses.remove(99, "Provolone");
//        System.out.println(favoriteCheeses.size());
//        favoriteCheeses.remove(35);
//        System.out.println(favoriteCheeses.size());

        // We can remove all the information from a HashMap by using the clear method.
//        favoriteCheeses.clear();
//        System.out.println(favoriteCheeses.isEmpty());

        // This doesn't work...
//        for (Square square : squaresHashMap) {
//            System.out.println("Here be squares...");
//        }

        // If we want to iterate through a HashMap, we can do this:
//        for (char key : squaresHashMap.keySet()) { // The .keySet() method will generate a Set, another kind of collection.
//            System.out.format("Square %c has sides with a length of %.1f.%n", key, squaresHashMap.get(key).getPerimeter()/4);
//            System.out.format("Square %c has a perimeter of %.1f.%n", key, squaresHashMap.get(key).getPerimeter());
//            System.out.format("Square %c has an area of %.1f.%n", key, squaresHashMap.get(key).getArea());
//        }
    }
}