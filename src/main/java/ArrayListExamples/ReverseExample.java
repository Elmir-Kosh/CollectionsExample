package ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
