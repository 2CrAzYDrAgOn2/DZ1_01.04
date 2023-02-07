public class Phone {
    private static String number = "89040338183";
    private static String model = "Xiaomi";
    private static int weight = 95;
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
//        this(number, model);
        this.weight = weight;
    }
    public Phone() {

    }
    public static void main(String[] args) {
        System.out.println(number + " " + model + " " + weight);
        receiveCall();
        getNumber();
    }
    static void receiveCall() {
        String name = "Саня";
        System.out.println("Звонит " + name);
    }
    static void getNumber() {
        System.out.println(number);
    }
    static void sendMessage() {

    }
}
