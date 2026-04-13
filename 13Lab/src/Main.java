import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lab13 {
    public static void main(String[] args) {
        System.out.println("========== Лабораторная работа №13 ==========\n");

        // Задание 1: Сложение двух чисел
        System.out.println("--- Задание 1: Сложение ---");
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("5 + 3 = " + sum.apply(5, 3));

        // Задание 2: Преобразование в верхний регистр
        System.out.println("\n--- Задание 2: UpperCase ---");
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("hello -> " + toUpper.apply("hello"));

        // Задание 3: Фильтрация нечётных чисел
        System.out.println("\n--- Задание 3: Фильтрация чётных чисел ---");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Чётные числа: " + evenNumbers);

        // Задание 4: Квадрат каждого числа
        System.out.println("\n--- Задание 4: Квадраты чисел ---");
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Квадраты: " + squares);

        // Задание 5: Максимальный элемент
        System.out.println("\n--- Задание 5: Максимальный элемент ---");
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println("Максимум: " + max);

        // Задание 6: Сортировка строк по длине
        System.out.println("\n--- Задание 6: Сортировка строк по длине ---");
        List<String> words = Arrays.asList("java", "stream", "a", "lambda", "api");
        List<String> sortedByLength = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Отсортировано по длине: " + sortedByLength);

        // Задание 7: Первая буква заглавная
        System.out.println("\n--- Задание 7: Капитализация первой буквы ---");
        Function<String, String> capitalize = s ->
                s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println("java -> " + capitalize.apply("java"));

        // Задание 8: Фильтрация строк длиной > 5
        System.out.println("\n--- Задание 8: Строки длиной > 5 ---");
        List<String> longWords = words.stream()
                .filter(w -> w.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Строки длиннее 5 символов: " + longWords);

        // Задание 9: Method Reference
        System.out.println("\n--- Задание 9: Method Reference ---");
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Вывод через method reference:");
        nums.forEach(System.out::println);

        // Задание 10: Optional (минимальное число)
        System.out.println("\n--- Задание 10: Optional (минимальное число) ---");
        List<Integer> emptyList = Collections.emptyList();
        int min = emptyList.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println("Минимум в пустом списке (значение по умолчанию): " + min);

        List<Integer> nonEmptyList = Arrays.asList(42, 17, 89, 3);
        min = nonEmptyList.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println("Минимум в списке [42, 17, 89, 3]: " + min);

        // Задание 11: Consumer
        System.out.println("\n--- Задание 11: Consumer ---");
        Consumer<String> printer = s -> System.out.println(">> " + s);
        printer.accept("Hello World");

        // Задание 12: Supplier
        System.out.println("\n--- Задание 12: Supplier ---");
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println("Случайное число: " + randomSupplier.get());
        System.out.println("Ещё одно случайное число: " + randomSupplier.get());

        // Задание 13: Comparator.comparing
        System.out.println("\n--- Задание 13: Сортировка по возрасту ---");
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Diana", 28)
        );
        people.sort(Comparator.comparingInt(p -> p.age));
        System.out.println("Отсортировано по возрасту: " + people);

        // Задание 14: Объекты Student
        System.out.println("\n--- Задание 14: Работа со студентами ---");
        List<Student> students = Arrays.asList(
                new Student("Anna", 20, 90),
                new Student("Paul", 22, 70),
                new Student("John", 21, 85),
                new Student("Maria", 20, 95),
                new Student("David", 23, 65)
        );

        System.out.println("Студенты с оценкой > 80, отсортированные по имени:");
        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        // Задание 15: Stream chaining
        System.out.println("\n--- Задание 15: Цепочка операций ---");
        List<Integer> data = Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6);
        System.out.println("Исходные данные: " + data);
        System.out.println("Результат цепочки (фильтр > 3 -> *10 -> сортировка):");
        data.stream()
                .filter(n -> n > 3)
                .map(n -> n * 10)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 16: Группировка по возрасту
        System.out.println("\n--- Задание 16: Группировка студентов по возрасту ---");
        Map<Integer, List<Student>> byAge = students.stream()
                .collect(Collectors.groupingBy(s -> s.age));
        byAge.forEach((age, studentList) -> {
            System.out.println("Возраст " + age + ": " + studentList);
        });

        // Задание 17: Reduce (сумма)
        System.out.println("\n--- Задание 17: Сумма элементов через reduce ---");
        int sumResult = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Сумма чисел 1..10: " + sumResult);

        // Задание 18: Distinct + Limit
        System.out.println("\n--- Задание 18: Удаление дубликатов и первые 3 элемента ---");
        List<Integer> withDups = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8);
        System.out.println("Исходный список с дубликатами: " + withDups);
        System.out.println("После distinct и limit(3):");
        withDups.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // Задание 19: FlatMap
        System.out.println("\n--- Задание 19: FlatMap (список списков) ---");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        System.out.println("Список списков: " + listOfLists);
        List<Integer> flat = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("После flatMap: " + flat);

        // Задание 20: Real case (заказы)
        System.out.println("\n--- Задание 20: Обработка заказов ---");
        List<Order> orders = Arrays.asList(
                new Order(1, 500),
                new Order(2, 1500),
                new Order(3, 1200),
                new Order(4, 800),
                new Order(5, 2000),
                new Order(6, 950)
        );

        System.out.println("Заказы с суммой > 1000, отсортированные по сумме:");
        orders.stream()
                .filter(o -> o.amount > 1000)
                .sorted(Comparator.comparingDouble(o -> o.amount))
                .forEach(System.out::println);

        System.out.println("\n========== Лабораторная работа выполнена ==========");
    }
}

// Вспомогательные классы

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + " (возраст: " + age + ", оценка: " + grade + ")";
    }
}

class Order {
    int id;
    double amount;

    Order(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String toString() {
        return "Заказ #" + id + ": $" + amount;
    }
}