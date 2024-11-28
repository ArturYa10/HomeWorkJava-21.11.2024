import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Пример a) Фильтрация списка
        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> doubles = doubleList.stream()
                .filter(d -> d % 2 == 1)
                .toList();
        System.out.println(doubles);

        // Пример b) Поиск элемента с длиной 3
        List<String> list = List.of("one", "two", "three", "four");
        String word = list.stream()
                .filter(t -> t.length() == 3)
                .findFirst()
                .orElse(null);
        System.out.println(word);
    }

    // Пример c) Сумма нечётных чисел
    public static int getSum(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
