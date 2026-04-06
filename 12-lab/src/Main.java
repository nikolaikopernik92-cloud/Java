import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример строки для большинства заданий
        System.out.println("Введите строку для демонстрации:");
        String input = scanner.nextLine();

        // Задание 1: Определение длины строки
        System.out.println("\n=== Задание 1: Длина строки ===");
        System.out.println("Длина: " + input.length());

        // Задание 2: Изменение регистра
        System.out.println("\n=== Задание 2: Изменение регистра ===");
        System.out.println("Верхний регистр: " + input.toUpperCase());
        System.out.println("Нижний регистр: " + input.toLowerCase());

        // Задание 3: Подсчёт слов
        System.out.println("\n=== Задание 3: Подсчёт слов ===");
        String[] words = input.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);

        // Задание 4: Обратный порядок слов
        System.out.println("\n=== Задание 4: Обратный порядок слов ===");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            reversedSentence.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println("Слова задом наперёд: " + reversedSentence.toString().trim());

        // Задание 5: Поиск слова
        System.out.println("\n=== Задание 5: Поиск слова ===");
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        System.out.println("Содержит \"" + searchWord + "\"? " + input.contains(searchWord));

        // Задание 6: Замена слова
        System.out.println("\n=== Задание 6: Замена слова ===");
        System.out.print("Какое слово заменить? ");
        String oldWord = scanner.nextLine();
        System.out.print("На какое слово заменить? ");
        String newWord = scanner.nextLine();
        System.out.println("Результат: " + input.replace(oldWord, newWord));

        // Задание 7: Проверка палиндрома
        System.out.println("\n=== Задание 7: Проверка палиндрома ===");
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = cleanInput.equals(new StringBuilder(cleanInput).reverse().toString());
        System.out.println("Строка палиндром? " + isPalindrome);

        // Задание 8: Сравнение строк
        System.out.println("\n=== Задание 8: Сравнение строк ===");
        System.out.print("Введите строку для сравнения: ");
        String compareStr = scanner.nextLine();
        System.out.println("Строки равны? " + input.equals(compareStr));

        // Задание 9: Разделение строки
        System.out.println("\n=== Задание 9: Разделение строки ===");
        System.out.print("Введите разделитель (например, пробел или запятую): ");
        String delimiter = scanner.nextLine();
        String[] parts = input.split(delimiter);
        System.out.println("Результат разбиения:");
        for (String part : parts) {
            System.out.println(" - " + part);
        }

        // Дополнительные задания
        System.out.println("\n=== ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ ===");

        // Задание 10: Количество гласных и согласных
        System.out.println("\n=== Задание 10: Гласные и согласные ===");
        countVowelsAndConsonants(input);

        // Задание 11: Удалить все пробелы
        System.out.println("\n=== Задание 11: Удалить пробелы ===");
        System.out.println("Без пробелов: " + input.replaceAll("\\s+", ""));

        // Задание 12: Самое длинное слово
        System.out.println("\n=== Задание 12: Самое длинное слово ===");
        System.out.println("Самое длинное слово: " + findLongestWord(words));

        // Задание 13: Количество символов без пробелов
        System.out.println("\n=== Задание 13: Символы без пробелов ===");
        System.out.println("Количество символов (без пробелов): " + input.replaceAll("\\s+", "").length());

        // Задание 14: startsWith
        System.out.println("\n=== Задание 14: startsWith ===");
        System.out.print("Введите начало строки для проверки: ");
        String prefix = scanner.nextLine();
        System.out.println("Начинается с \"" + prefix + "\"? " + input.startsWith(prefix));

        // Задание 15: endsWith
        System.out.println("\n=== Задание 15: endsWith ===");
        System.out.print("Введите окончание строки для проверки: ");
        String suffix = scanner.nextLine();
        System.out.println("Заканчивается на \"" + suffix + "\"? " + input.endsWith(suffix));

        // Задание 16: Обратный порядок всей строки
        System.out.println("\n=== Задание 16: Строка в обратном порядке ===");
        System.out.println("Результат: " + new StringBuilder(input).reverse().toString());

        // Задание 17: Удалить все цифры
        System.out.println("\n=== Задание 17: Удалить цифры ===");
        System.out.println("Без цифр: " + input.replaceAll("\\d", ""));

        // Задание 18: Заменить гласные на *
        System.out.println("\n=== Задание 18: Заменить гласные на * ===");
        System.out.println("Результат: " + replaceVowelsWithStar(input));

        // Задание 19: Частота каждого символа
        System.out.println("\n=== Задание 19: Частота символов ===");
        countCharacterFrequency(input);

        // Задание 20: Проверка, содержит ли только цифры
        System.out.println("\n=== Задание 20: Только цифры? ===");
        System.out.println("Строка содержит только цифры? " + input.matches("\\d+"));

        scanner.close();
    }

    // Метод для задания 10
    public static void countVowelsAndConsonants(String str) {
        String lower = str.toLowerCase();
        int vowels = 0, consonants = 0;
        String vowelSet = "аеёиоуыэюяaeiou";

        for (char c : lower.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelSet.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
    }

    // Метод для задания 12
    public static String findLongestWord(String[] words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // Метод для задания 18
    public static String replaceVowelsWithStar(String str) {
        return str.replaceAll("(?i)[аеёиоуыэюяaeiou]", "*");
    }

    // Метод для задания 19
    public static void countCharacterFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) { // не считаем пробелы
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}