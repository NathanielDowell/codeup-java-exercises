package Fake;

public class Person {

        public String name;
        private boolean insured;

        public Person(String name){
            this.name = name;
        }

        public void sayHello(){
            System.out.println("Hello from " + this.name + "!");
        }

        public boolean isInsured() {
            return insured;
        }

        public void setInsured(boolean insured) {
            this.insured = insured;
        }
}
