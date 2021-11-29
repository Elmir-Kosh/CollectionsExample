package LinkedList;

import java.util.*;

public class LinkedListExample {

        public static void print(LinkedList<String> linkedList) {
            System.out.println(linkedList);
            System.out.println("\n");
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        print(list);

        //перебор элементов
        for (String element : list){
            System.out.println(element);
        }
        System.out.println("\n");

        //iterator

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n");

        //reverse
        Iterator iteratorReverse = list.descendingIterator();
        while(iteratorReverse.hasNext()){
            System.out.println(iteratorReverse.next());
        }
        System.out.println("\n");

        //add element to position
        list.add(0, "zero");
        print(list);


        //add element to first and last position
        list.addFirst("minus");
        list.addLast("fourth");
        print(list);


        //add list to list
        LinkedList<String> listPart = new LinkedList<>();
        listPart.add("second and a quarter");
        listPart.add("second and a half");
        list.addAll(4, listPart);
        print(list);


        //get first and last element
        System.out.println("The first element is: " + list.getFirst());
        System.out.println("The first last is: " + list.getLast());
        System.out.println("\n");

        //remove element
        list.remove(4);
        print(list);


        //remove first and last elements
        list.remove(list.getFirst());
        list.remove(list.getLast());
        print(list);

        //remove all elements
        //list.removeAll(list);
        //print(list);

        //swap two elements
        Collections.swap(list, 0, 4);
        print(list);

        //shuffle elements
        Collections.shuffle(list);
        print(list);

        //compare to lists
        LinkedList<String> new_list = new LinkedList<>();
        new_list.add("fourth");
        new_list.add("fifth");

        list.addAll(listPart);
        list.addAll(new_list);
        print(list);

        //clone list
        listPart = (LinkedList<String>) new_list.clone();
        print(listPart);

        //show remove first element
        print(list);
        list.pop();
        print(list);

        //show first and last element without remove
        print(list);
        System.out.println("first element is: " + list.peek());
        System.out.println("last element is: " + list.peekLast() + "\n");

        //contain element
        System.out.println(list);
        System.out.println("list contain zero: " + list.contains("zero") + "\n");

        //from list to array
        List<String> arrayList = new ArrayList<String>(list);
        for (String str : arrayList) {
            System.out.println(str);
        }
        System.out.println("\n");
        //compare two lists
        System.out.println(list);
        System.out.println(new_list);

        LinkedList<String> c_list = new LinkedList<String>();
        for (String element : list)
            c_list.add(new_list.contains(element) ? "Yes" : "No");
        System.out.println(c_list);
        System.out.println("\n");

        //is list empty
        LinkedList<String> emptyList = new LinkedList<>();
        System.out.println(list);
        System.out.println(emptyList);
        System.out.println(list.isEmpty());
        System.out.println(emptyList.isEmpty() + "\n");

        //replace elements
        System.out.println(list);
        list.set(0, "ten");
        System.out.println(list);




    }




    }


