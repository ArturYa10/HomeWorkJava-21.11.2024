import java.util.*;
import java.util.stream.*;


public class StreamTasks {

    // Задача A: Фильтрация чисел
    public static void taskA(List<Double> doubleList) {
        List<Double> doubles = doubleList.stream()
                .filter(d -> d % 2 == 1)
                .collect(Collectors.toList());
        System.out.println("Числа, подходящие под условие: " + doubles);
    }

    // Задача B: Поиск слова длиной 3 символа
    public static void taskB(List<String> list) {
        String word = list.stream()
                .filter(t -> t.length() == 3)
                .findFirst()
                .orElse(null);
        System.out.println("Первое слово длиной 3 символа: " + word);
    }

    // Задача C: Сумма нечетных чисел
    public static int taskC(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Задача D: Поиск индекса элемента
    public static int taskD(String[] data, String element) {
        return IntStream.range(0, data.length)
                .filter(i -> data[i].equals(element))
                .findFirst()
                .orElse(-1);
    }

    // Задача E: Подсчет суммы
    public static void taskE() {
        double sum = IntStream.range(0, 10_000)
                .mapToDouble(i -> 0.1)
                .sum();
        System.out.println("Сумма: " + sum);
    }

    // Задача F: Заполнение списка числами
    public static void taskF(List<Integer> list, int capacity) {
        list.addAll(IntStream.range(0, capacity)
                .boxed()
                .collect(Collectors.toList()));
    }

    // Задача G: Длины строк в множестве
    public static void taskG(Set<String> names) {
        Set<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Длины строк: " + lengths);
    }

    // Задача H: Разделение чисел на группы
    public static Map<Boolean, List<Integer>> taskH() {
        // Прямое использование TreeMap здесь невозможно, поэтому мы сначала используем обычную Map
        Map<Boolean, List<Integer>> result = IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 3 == 0));

        return new TreeMap<>(result);
    }
}








