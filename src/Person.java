public class Person {
    static String fullName;
    static String age;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        move();
        talk();
    }
    static void move() {
        System.out.println(fullName + " Говорит");
    }
    static void talk() {
        System.out.println(fullName + " Говорит");
    }
    public Person() {

    }
    public Person(String fullName, String age) {

    }
}
