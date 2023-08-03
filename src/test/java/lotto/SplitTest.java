package lotto;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitTest {
    @Test
    void splitTest() {
        String[] s = ",,,,,".split(",");
        Arrays.stream(s)
                .forEach(System.out::println);
        System.out.println(s.length);
    }

    @Test
    void joinTest(){
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<String> collect = numbers.stream()
                .map(num -> String.valueOf(num))
                .collect(Collectors.toList());
        String join = String.join(", ", collect);
        System.out.println(join);
    }
}
