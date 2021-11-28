package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class ContainsExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Hello");
        arrayList.add("Greetings");
        System.out.println(arrayList.contains("Hi"));
    }
}
