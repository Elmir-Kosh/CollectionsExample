package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class CopyExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Hello");
        arrayList.add("Ola");

        List<String> arrayCopyList = new ArrayList<>();
        arrayCopyList.addAll(arrayList);

        System.out.println("Original ArrayList is: " + arrayList);
        System.out.println("Copy is: " + arrayCopyList);
    }
}
