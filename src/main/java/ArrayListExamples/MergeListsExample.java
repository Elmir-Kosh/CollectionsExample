package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class MergeListsExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Hello");
        arrayList.add("Hey");

        List<String> arraySecondList = new ArrayList<>();
        arraySecondList.add("Привет");
        arraySecondList.add("Здравствуйте");
        arraySecondList.add("Хей");

        List<String> MergeList = new ArrayList<>();
        MergeList.addAll(arrayList);
        MergeList.addAll(arraySecondList);

        System.out.println(MergeList);
    }
}
