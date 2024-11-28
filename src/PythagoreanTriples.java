import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;

public class PythagoreanTriples {
    public static void main(String[] args) {
        int limit = 1000;

        List<int[]> triples = IntStream.range(1, limit)
                .boxed()
                .flatMap(a -> IntStream.range(a + 1, limit)
                        .boxed()
                        .flatMap(b -> IntStream.range(b + 1, limit)
                                .filter(c -> a * a + b * b == c * c)
                                .mapToObj(c -> new int[]{a, b, c})))
                .collect(Collectors.toList());


        triples.forEach(triple ->
                System.out.println("[" + triple[0] + ", " + triple[1] + ", " + triple[2] + "]"));
    }
}
