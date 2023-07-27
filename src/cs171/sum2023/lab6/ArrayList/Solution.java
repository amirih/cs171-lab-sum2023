package cs171.sum2023.lab6.ArrayList;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i =0; i<10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        for (int j = 0; j<10; j++){
            arrayList.add(0, arrayList.remove(j));
        }
        System.out.println(arrayList);
    }
}
