package feb13exam.lambda;

import java.util.HashSet;
import java.util.Set;

public class IfElementExistInHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        int value = 3;
        boolean findElement = set.stream().anyMatch(num->num==value);
        System.out.println("if number exists::"+ findElement);
    }
}
