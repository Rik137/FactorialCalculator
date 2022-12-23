import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите число для расчета факториала");
        int factorial = 1;
        int value = new Scanner(System.in).nextInt();
        String massage = value + "! = ";
        switch (value) {
            case 0 -> System.out.println("не является натуральным числом");
            case 1 -> System.out.println(massage + value);
            case 2 -> System.out.println(massage + "1 * " + value + " = " + value);
            default -> {
                if (value < 0) {
                    System.out.println("не является натуральным числом");
                    break;
                }
                System.out.print(massage);
                for (int i = 1; i <= value; i = i + 1) {
                    factorial = factorial * i;
                    System.out.print(i);
                    if (i < value) {
                        System.out.print(" * ");
                    }
                }
                System.out.print(" = " + factorial);
            }
        }
    }
}