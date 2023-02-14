package feb13exam.lambda;

import java.util.ArrayList;
import java.util.List;

public class CheckElement {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(3);
        n.add(4);
        int value = 8;
        boolean findElement = n.stream().anyMatch(num->num==value);
        System.out.println("if the element exists or not::"+findElement);


    }
}
