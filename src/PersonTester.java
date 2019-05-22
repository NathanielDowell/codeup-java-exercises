public class PersonTester {

    public static void main(String[] args) {
        Person flamingolani = new Person("Flamingolani");
        System.out.println(flamingolani.getName());

        flamingolani.setName("Carl");
        System.out.println(flamingolani.getName());

        flamingolani.sayHello();
    }
}
