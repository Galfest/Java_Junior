package l1.hw1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Ваш список чисел

        double averageOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтрация четных чисел
                .mapToInt(n -> n) // Преобразование в IntStream
                .average() // Вычисление среднего значения
                .orElse(0.0); // Если нет четных чисел, вернуть 0

        System.out.println("Среднее значение четных чисел: " + averageOfEvenNumbers);
    }
}