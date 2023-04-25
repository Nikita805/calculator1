
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите первое число");
            Scanner scanner = new Scanner(System.in);
            float a = scanner.nextFloat();
            System.out.println("Введите знак действия + - * /");
            char n = scanner.next().charAt(0);
            System.out.println("Введите второе число");
            float b = scanner.nextFloat();
                if (n == '+') {
                    float result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                }
                if (n == '-') {
                    float result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                }
                if (n == '*') {
                    float result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                }
                if (n == '/') {
                    if (b==0) {
                        System.out.println("Деление на ноль невозможно");
                    } else {
                    float result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                }

            }
        }
    }
}

