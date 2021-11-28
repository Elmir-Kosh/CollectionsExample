package ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceElementsExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        System.out.println(arrayList);

        Collections.swap(arrayList, 1, 2);

        System.out.println(arrayList);
    }
}
