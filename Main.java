import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 11 find common elements
        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList(
                "USA", "Kyrgyzstan", "France", "Japan", "India"
        ));
        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList(
                "Germany", "France", "India", "China"
        ));

        ArrayList<String> common = new ArrayList<>();

        for (String c : countries1) {
            if (countries2.contains(c)) {
                common.add(c);
            }
        }
        System.out.println("11) common elements: " + common);


        // 12 remove even-length strings
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Aiana", "Azema", "Aybiike", "Feruza", "Ainaz"
        ));

        names.removeIf(name -> name.length() % 2 == 0);
        System.out.println("12) names with odd length: " + names);


        // 13 find smallest element
        ArrayList<String> songs = new ArrayList<>(Arrays.asList(
                "like jennie", "born to die", "ultraviolence", "truly"
        ));

        String shortest = songs.get(0);
        for (String song : songs) {
            if (song.length() < shortest.length()) {
                shortest = song;
            }
        }
        System.out.println("13) shortest song title: " + shortest);


        // 14 replace all vowels
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "orange"
        ));

        for (int i = 0; i < words.size(); i++) {
            String replaced = words.get(i).replaceAll("[aeiouAEIOU]", "*");
            words.set(i, replaced);
        }
        System.out.println("14) replaced vowels: " + words);


        // 15 partition arrayList (even & odd)
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7
        ));

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("15) even numbers: " + even);
        System.out.println("15) odd numbers: " + odd);


        // 16 rotate elements by 2 positions
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        ));

        Collections.rotate(days, 2);
        System.out.println("16) rotated days: " + days);


        // 17 remove null values
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Ali", null, "Sara", null, "John"
        ));

        students.removeIf(Objects::isNull);
        System.out.println("17) without null: " + students);


        // 18 find second largest string (by length)
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Avatar", "Titanic", "The Lord of the Rings", "Up"
        ));

        movies.sort(Comparator.comparingInt(String::length).reversed());

        String secondLongest = movies.get(1);
        System.out.println("18) second longest movie title: " + secondLongest);


        // 19 replace elements with lengths
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Kiwi", "Orange"
        ));

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }

        System.out.println("19) lengths of fruits: " + lengths);


        // 20 create nested arraylist
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>(Arrays.asList(
                "Ali", "John", "Sara"
        ));

        ArrayList<String> hr = new ArrayList<>(Arrays.asList(
                "Amina", "David"
        ));

        ArrayList<String> finance = new ArrayList<>(Arrays.asList(
                "Tom", "Emma", "Bob"
        ));

        departments.add(it);
        departments.add(hr);
        departments.add(finance);

        System.out.println("20) departments and employees:");

        for (ArrayList<String> dept : departments) {
            System.out.println(dept);
        }

    }
}
