package ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

    }
}
