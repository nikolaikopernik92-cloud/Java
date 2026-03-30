import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedCalculator {

    // История вычислений
    private static ArrayList<String> history = new ArrayList<>();

    // Методы для операций
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено.");
        }
        return a / b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Квадратный корень из отрицательного числа не определён.");
        }
        return Math.sqrt(a);
    }

    public static double percent(double a, double b) {
        return (a * b) / 100;
    }

    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }

    // Очистка экрана (имитация)
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // Показать историю
    public static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("История пуста.");
        } else {
            System.out.println("\n--- История вычислений ---");
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        }
        System.out.println();
    }

    // Безопасный ввод числа
    public static double getDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число.");
                scanner.next(); // очистка буфера
            }
        }
    }

    // Вывод меню
    public static void showMenu() {
        System.out.println("\n=== КАЛЬКУЛЯТОР ===");
        System.out.println("1. Сложение (+)");
        System.out.println("2. Вычитание (-)");
        System.out.println("3. Умножение (*)");
        System.out.println("4. Деление (/)");
        System.out.println("5. Возведение в степень (x^y)");
        System.out.println("6. Квадратный корень (sqrt(x))");
        System.out.println("7. Процент (a% от b)");
        System.out.println("8. sin(x)");
        System.out.println("9. cos(x)");
        System.out.println("10. tan(x)");
        System.out.println("11. Показать историю");
        System.out.println("12. Очистить экран");
        System.out.println("0. Выход");
        System.out.print("Выберите операцию: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число от 0 до 12.");
                scanner.next();
                choice = -1;
                continue;
            }

            if (choice == 0) {
                System.out.println("Выход из программы. До свидания!");
                break;
            }

            if (choice == 11) {
                showHistory();
                continue;
            }

            if (choice == 12) {
                clearScreen();
                continue;
            }

            double a, b, result;
            String operation = "";

            try {
                switch (choice) {
                    case 1: // Сложение
                        a = getDouble(scanner, "Введите первое число: ");
                        b = getDouble(scanner, "Введите второе число: ");
                        result = add(a, b);
                        operation = a + " + " + b + " = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 2: // Вычитание
                        a = getDouble(scanner, "Введите первое число: ");
                        b = getDouble(scanner, "Введите второе число: ");
                        result = subtract(a, b);
                        operation = a + " - " + b + " = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 3: // Умножение
                        a = getDouble(scanner, "Введите первое число: ");
                        b = getDouble(scanner, "Введите второе число: ");
                        result = multiply(a, b);
                        operation = a + " * " + b + " = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 4: // Деление
                        a = getDouble(scanner, "Введите первое число: ");
                        b = getDouble(scanner, "Введите второе число: ");
                        result = divide(a, b);
                        operation = a + " / " + b + " = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 5: // Степень
                        a = getDouble(scanner, "Введите основание: ");
                        b = getDouble(scanner, "Введите показатель: ");
                        result = power(a, b);
                        operation = a + "^" + b + " = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 6: // Квадратный корень
                        a = getDouble(scanner, "Введите число: ");
                        result = sqrt(a);
                        operation = "sqrt(" + a + ") = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 7: // Процент
                        a = getDouble(scanner, "Введите число a: ");
                        b = getDouble(scanner, "Введите процент b: ");
                        result = percent(a, b);
                        operation = b + "% от " + a + " = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 8: // sin
                        a = getDouble(scanner, "Введите угол в градусах: ");
                        result = sin(a);
                        operation = "sin(" + a + "°) = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 9: // cos
                        a = getDouble(scanner, "Введите угол в градусах: ");
                        result = cos(a);
                        operation = "cos(" + a + "°) = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    case 10: // tan
                        a = getDouble(scanner, "Введите угол в градусах: ");
                        result = tan(a);
                        operation = "tan(" + a + "°) = " + result;
                        System.out.println("Результат: " + result);
                        break;

                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        continue;
                }
                // Добавляем в историю, если операция выполнена успешно
                history.add(operation);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Непредвиденная ошибка: " + e.getMessage());
            }

        } while (true);

        scanner.close();
    }
}