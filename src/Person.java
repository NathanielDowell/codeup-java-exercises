public class Person {

    // Here are some things that are critical to defining my Person.
    // They are "Private" because we don't want people directly messing with
    // the source information (why we use "getters" and "setters").

        private String name;
        private int age;
        private boolean ninjaStatus;


        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println("Hello, " + this.name + "!");
        }

        //Constructor//
        public Person(String name) {
         this.name = name;
        }

    public static void main(String[] args) {


        Person nathaniel = new Person("Nathaniel");

        nathaniel.setName("Floyd"); //resets "Nathaniel" to "Floyd"

        System.out.println(nathaniel.getName());

        nathaniel.sayHello();


        //======= Exercise 2 =========//

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());  // John
//        System.out.println(person2.getName());  // John
//        person2.setName("Jane");               // since person2 = person1, person1 is also set to "Jane"
//        System.out.println(person1.getName()); // Jane
//        System.out.println(person2.getName()); // Jane
//        person1.setName("Bobo the Lion");      // Should set both to "Bobo the Lion"
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }



}
