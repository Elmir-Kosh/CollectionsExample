package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveByIndexExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(456);
        arrayList.add(123);
        arrayList.add(1234);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
