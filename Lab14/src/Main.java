import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N:");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Сумма: " + sum);
    }
}

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Количество цифр: " + count);
    }
}

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();

        int i = 1;

        do {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }
}

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int max = 0;

        do {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        } while (number > 0);

        System.out.println("Максимальная цифра: " + max);
    }
}

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;

        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number > 0);

        if (original == reversed) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}

import java.util.Scanner;

public class EvenDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int count = 0;

        do {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        } while (number > 0);

        System.out.println("Чётных цифр: " + count);
    }
}

import java.util.Random;

public class RandomUntilZero {
    public static void main(String[] args) {
        Random random = new Random();
        int number;

        do {
            number = random.nextInt(10); // 0–9
            System.out.println(number);
        } while (number != 0);
    }
}

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.println("Введите число (0 для выхода):");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Сумма: " + sum);
    }
}

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Введите пароль (минимум 6 символов):");
            password = scanner.nextLine();
        } while (password.length() < 6);

        System.out.println("Пароль принят");
    }
}

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = Integer.MAX_VALUE;

        do {
            System.out.println("Введите число (0 для выхода):");
            number = scanner.nextInt();

            if (number != 0 && number < min) {
                min = number;
            }

        } while (number != 0);

        System.out.println("Минимальное число: " + min);
    }
}
















































































































































































































