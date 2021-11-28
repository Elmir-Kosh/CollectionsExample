package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class CompareExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Hello");
        arrayList.add("Hey");

        List<String> arraySecondList = new ArrayList<>();
        arraySecondList.add("Hello");
        arraySecondList.add("Hey");
        arraySecondList.add("Hi");

        System.out.println(arrayList.containsAll(arraySecondList));
    }
}
