import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] arrayPeeps, Person person) {
        Person[] morePeople = Arrays.copyOf(arrayPeeps, arrayPeeps.length +1);
        morePeople[morePeople.length - 1] = person;

        return morePeople;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        Person[] arrayPeeps = {
                new Person("Bunny Bob"),
                new Person("Stickler Sam"),
                new Person("Ronaldo Fuerte")
        };

        for(int i = 0; i < arrayPeeps.length; i++) {
            System.out.println(arrayPeeps[i].getName());

        }
        arrayPeeps = addPerson(arrayPeeps, new Person("Filibuster Bill"));
        arrayPeeps = addPerson(arrayPeeps, new Person("Porkbarrel Stellinski"));

        //loop through the array
        for(int i = 0; i < arrayPeeps.length; i++) {
            System.err.println(arrayPeeps[i].getName());

        }




    }
}
