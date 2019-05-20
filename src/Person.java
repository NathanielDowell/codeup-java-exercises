public class Person {

    // Here are some things that are critical to defining my Person.
    // They are "Private" because we don't want people directly messing with
    // the source information (why we use "getters" and "setters").

        private String name;
        private int age;
        private boolean ninjaStatus;


        // I believe this section is where we set methods for interacting with
    // the source information we have above, or defining useful methods that are
    // attached to the public class


    // I think this is a "getter" which is public, so can be accessed outside the class,
    // and so allows for us to access the private information indirectly:
        public String getName() {
            return name;
        }

        // I think this is a setter.  I'm not sure what is being "set", whether
    // it is a COPY of the protected information, or whether it is the information itself,
    // (i.e. the information remains protected from willy-nilly access and can only be accessed
    // via the strictly defined setter rules):
        public void setName(String name) {

        }

        //This method is public, so it can be accessed outside the class, and it
    // uses its ability to access the source information to output a message with
    // said information.
        public void sayHello() {

        }


    public static void main(String[] args) {

        // Where I call things to test functionality of my class
    }



}
