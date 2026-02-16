
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= N) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 1 до " + N + " = " + sum);

        scanner.close();
    }
}
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + N + " = " + factorial);

        scanner.close();
    }
}
public class Task4 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            if (i % 2 != 0) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Сумма введённых чисел = " + sum);

        scanner.close();
    }
}
public class Task6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
















