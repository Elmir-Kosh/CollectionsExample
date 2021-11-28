package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class AddElementByIndexExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(123);
        arrayList.add(1234);
        System.out.println(arrayList);
        arrayList.add(0, 1);
        System.out.println(arrayList);
    }
}
