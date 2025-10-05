import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Решение первой задачи
        System.out.println("=== Задача 1: Операции с числами ===");
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Математические операции
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }
        
        // Решение второй задачи
        System.out.println("\n=== Задача 2: Сравнение строк ===");
        System.out.print("Введите первую строку (a): ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку (b): ");
        String str2 = scanner.nextLine();
        
        // Сравнение строк
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        // Решение третьей задачи
        System.out.println("\n=== Задача 3: Четные числа в массиве ===");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.print("Четные числа: ");
        
        // Поиск и вывод четных чисел
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        
        scanner.close();
    }
}