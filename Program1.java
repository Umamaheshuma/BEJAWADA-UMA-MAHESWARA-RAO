import java.util.*;
// A Simple Calculator 10
class Calculator {
    double a, b;
    String type;

    Calculator(double a, double b, String type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }

    double calculate() {
        switch (type.toLowerCase()) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div": return a / b;
            default: System.out.println("Invalid operation"); return 0;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add/sub/mul/div): ");
        String type = sc.next();

        Calculator c = new Calculator(a, b, type);
        System.out.println("Result = " + c.calculate());
    }
}
