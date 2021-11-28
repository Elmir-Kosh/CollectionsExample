package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveExample {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("Hi");
        arrayList.add(1234);
        arrayList.add(12345);
        System.out.println(arrayList);
        arrayList.remove("Hi");
        System.out.println(arrayList);
    }
}
