package feb13exam.lambda;

import java.util.*;
import java.util.stream.IntStream;

public class InsertELementInSpecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] = {"abc","def","ghi"};
        //coverting array to list
        List<String> list =new ArrayList<>( Arrays.asList(array));
        System.out.println(list);


        System.out.println("***************");
        System.out.println("enter a position you want to change");
        int n = sc.nextInt();

        OptionalInt i = IntStream.range(0, list.size()).filter(index->list.get(index).equals("def")).findFirst();
        System.out.println(i);
        if(i!=null&& !i.isEmpty()) {
            System.out.println(i.getAsInt());
            list.add(i.getAsInt(), "ccc");
            System.out.println(list);
        }
    }
}
