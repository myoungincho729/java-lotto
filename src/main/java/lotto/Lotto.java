package lotto;

import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    public String toString() {
        List<String> numbersOfString = numbers.stream()
                .map(number -> String.valueOf(number))
                .collect(Collectors.toList());
        String retString = "[" + String.join(", ", numbersOfString) + "]";
        return retString;
    }
}
