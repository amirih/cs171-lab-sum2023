package cs171.sum2023.lab9.ClearList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueList {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicates = new ArrayList<String>();
        listWithDuplicates.add("a");
        listWithDuplicates.add("b");
        listWithDuplicates.add("a");
        listWithDuplicates.add("c");
        listWithDuplicates.add("b");
        listWithDuplicates.add("d");
        listWithDuplicates.add("A");
        listWithDuplicates.add("B");
        listWithDuplicates.add("A");
        listWithDuplicates.add("C");
        listWithDuplicates.add("B");
        listWithDuplicates.add("D");

        List<String> listWithoutDuplicates1 = listWithDuplicates.stream().distinct().collect(Collectors.toList());
        List<String> listWithoutDuplicates2 = clearListCaseSensitive(listWithDuplicates);
        List<String> listWithoutDuplicates3 = clearListCaseSensitive(listWithDuplicates);
        System.out.println(listWithDuplicates);  // Output:
        System.out.println(listWithoutDuplicates1);  // Outputs:
        System.out.println(listWithoutDuplicates2);  // Outputs:
        System.out.println(listWithoutDuplicates3);  // Outputs:
    }

    private static List<String> clearListCaseSensitive(ArrayList<String> listWithDuplicates) {
        List<String> listWithoutDuplicates = new ArrayList<>();

        return listWithoutDuplicates;

    }

    private static List<String> clearListCaseInSensitive(ArrayList<String> listWithDuplicates) {
        List<String> listWithoutDuplicates = new ArrayList<>();

        return listWithoutDuplicates;

    }

    private static List<String> clearListCaseInsensitive(ArrayList<String> listWithDuplicates) {
        List<String> listWithoutDuplicates = new ArrayList<>();


        return listWithoutDuplicates;

    }
}
