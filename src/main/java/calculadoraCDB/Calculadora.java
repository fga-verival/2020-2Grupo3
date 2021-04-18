package calculadoraCDB;

public class Calculadora {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Calculadora().getGreeting());
    }
}
