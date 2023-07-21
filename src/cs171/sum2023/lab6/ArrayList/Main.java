package cs171.sum2023.lab6.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("!");
        System.out.println(arrayList);
        System.out.println("Size is " + arrayList.size());
        System.out.println("arrayList [0]: "+ arrayList.get(0));
        System.out.println("arrayList [1]: "+ arrayList.get(1));
        System.out.println("arrayList [2]: "+ arrayList.get(2));
        System.out.println("When we use get, element is not removed");
        System.out.println(arrayList);
        System.out.println("removing " + arrayList.get(1));
//        arrayList.remove(1);
        System.out.println("remove returns the value: "+ arrayList.remove(1));
        System.out.println(arrayList);
        System.out.println("Size is " + arrayList.size());
        arrayList.add(2, "new world");
        //arrayList.add(4, "world"); // compile error
        System.out.println(arrayList);
        arrayList.set(1, "WORLD");
        System.out.println(arrayList);
        arrayList.add(2, "another world");
        System.out.println(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(arrayList);
        System.out.println("arrayList2: " + arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        //arrayList3.addAll(arrayList); //compile error

        arrayList.clear();
        System.out.println(arrayList);

    }
}
