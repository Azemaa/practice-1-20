import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1 unique integers
        System.out.println("1 unique integers:");
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6};
        HashSet<Integer> uniqueNums = new HashSet<>();
        for (int n : nums) uniqueNums.add(n);
        System.out.println(uniqueNums);


        // 2 check membership
        System.out.println("2 check membership:");
        HashSet<String> users = new HashSet<>();
        users.add("Adi");
        users.add("Azema");
        users.add("Aida");
        System.out.println(isAllowed(users, "Azema"));
        System.out.println(isAllowed(users, "Aiana"));


        // 3 set size and emptiness
        System.out.println("3 set size and emptiness:");
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        System.out.println("size: " + numbers.size());
        numbers.clear();
        System.out.println("is empty: " + numbers.isEmpty());


        // 4 remove elements
        System.out.println("4 remove elements:");
        HashSet<String> names = new HashSet<>();
        names.add("Aiana");
        names.add("Diana");
        names.add("Amina");
        names.add("Mirana");
        names.add("Ailin");
        boolean removed = names.remove("Amina");
        System.out.println("removed: " + removed);
        System.out.println(names);


        // 5 bulk add
        System.out.println("5 bulk add:");
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        set1.addAll(set2);
        System.out.println(set1);


        // 6 bulk remove
        System.out.println("6 bulk remove:");
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(3, 4));
        setA.removeAll(setB);
        System.out.println(setA);


        // 7 retain common
        System.out.println("7 retain common:");
        HashSet<Integer> setX = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setY = new HashSet<>(Arrays.asList(3, 4, 5));
        setX.retainAll(setY);
        System.out.println(setX);


        // 8 contains all
        System.out.println("8 contains all:");
        HashSet<Integer> setC = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setD = new HashSet<>(Arrays.asList(2, 3));
        if (setC.containsAll(setD)) {
            System.out.println("setC contains all elements of setD");
        } else {
            System.out.println("setC does NOT contain all elements of setD");
        }


        // 9 deduplicate words
        System.out.println("9 deduplicate words:");
        String sentence = "azema is pretty and azema is smart";
        String[] words = sentence.split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);


        // 10 case-insensitive unique words
        System.out.println("10 case-insensitive unique words:");
        String[] wordList = {"Strawberry", "strawberry", "APPLE", "Banana", "BANANA"};
        HashSet<String> normalized = new HashSet<>();
        for (String w : wordList) {
            normalized.add(w.toLowerCase());
        }
        System.out.println(normalized);
    }

    // method for task 2
    public static boolean isAllowed(HashSet<String> set, String name) {
        return set.contains(name);
    }
}
