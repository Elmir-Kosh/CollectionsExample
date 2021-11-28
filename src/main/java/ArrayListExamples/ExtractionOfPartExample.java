package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class ExtractionOfPartExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(124135);
        arrayList.add(32124);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        List<Integer> sublist = arrayList.subList(1,3);
        arrayList.removeAll(sublist);
        System.out.println(arrayList);
    }
}
