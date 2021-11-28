package ArrayListExamples;

import javax.naming.event.ObjectChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(12345);
        arrayList.add("Hi");
        arrayList.add(1234);
        arrayList.add("Black");
        arrayList.add(12);
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println(arrayList);
    }
}
