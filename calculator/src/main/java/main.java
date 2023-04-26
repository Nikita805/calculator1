
import java.util.Scanner;

public class main {
    static boolean valid = true;
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите первое число");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            while (isNumber(a) == false) {
                System.out.println("Некорректное число");
                System.out.println("Введите первое число");
                a = scanner.nextLine();
            }
            float aNum = Float.parseFloat(a);
            System.out.println("Введите знак действия + - * /");
            char n = scanner.next().charAt(0);
            while ((n=='+' || n=='-' || n=='*' || n=='/')==false) {
                System.out.println("Некорректный знак действия. Введите знак действия + - * /");
                n = scanner.next().charAt(0);
            }
            scanner.nextLine();
            System.out.println("Введите второе число");
            String b = scanner.nextLine();
            while (isNumber(b) == false) {
                System.out.println("Некорректное число");
                System.out.println("Введите второе число");
                b = scanner.nextLine();
            }
            float bNum = Float.parseFloat(b);
                if (n == '+') {
                    float result = aNum+bNum;
                    System.out.println(a + " + " + b + " = " + result);
                }
                if (n == '-') {
                    float result = aNum-bNum;
                    System.out.println(a + " - " + b + " = " + result);
                }
                if (n == '*') {
                    float result = aNum*bNum;
                    System.out.println(a + " * " + b + " = " + result);
                }
                if (n == '/') {
                    if (bNum==0) {
                        System.out.println("Деление на ноль невозможно");
                    } else {
                    float result = aNum/bNum;
                    System.out.println(a + " / " + b + " = " + result);
                }

            }
        }
    }
    public static boolean isNumber(String in) {
        try {
            Float.parseFloat(in);
            valid = true;
            return true;
        }
        catch (Exception E) {
            valid = false;
            return false;
        }
    }
}

