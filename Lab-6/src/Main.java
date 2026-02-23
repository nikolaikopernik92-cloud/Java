import java.util.Scanner;

public class Main {

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        System.out.print("Введите высоту: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);
        System.out.println("Площадь прямоугольника: " + area);
    }
}
import java.util.Scanner;

public class Main {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}
public class Main {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int intMax = max(5, 9);
        double doubleMax = max(3.7, 2.4);

        System.out.println("Максимум (int): " + intMax);
        System.out.println("Максимум (double): " + doubleMax);
    }
}
import java.util.Scanner;

public class Main {

    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        long result = factorial(number);

        if (result != -1) {
            System.out.println("Факториал равен: " + result);
        }
    }
}
import java.util.Scanner;

public class Main {

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите степень: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println("Результат: " + result);
    }
}




