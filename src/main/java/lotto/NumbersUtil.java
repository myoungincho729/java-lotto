package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class NumbersUtil {
    public static int MIN_NUM = 1;
    public static int MAX_NUM = 45;
    public static int NUMBER_COUNT = 6;
    public static List<Integer> createSixUniqueNumbers() {
        return Randoms.pickUniqueNumbersInRange(MIN_NUM, MAX_NUM, NUMBER_COUNT);
    }
}
