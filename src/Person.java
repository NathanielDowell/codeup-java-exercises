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
            System.out.println("Hello!");
        }


    public static void main(String[] args) {


        Person nathaniel = new Person();

        nathaniel.setName("Nathaniel");

        System.out.println(nathaniel.getName());


        //======= Exercise 2 =========//

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


    }



}
