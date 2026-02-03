import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1 merge unique elements
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList("Harry Potter", "The Little Prince", "Dune"));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList("Dune", "A Game of Thrones", "The Little Prince"));

        Set<String> mergedBooks = new HashSet<>();
        mergedBooks.addAll(books1);
        mergedBooks.addAll(books2);

        System.out.println("1) merged unique books: " + mergedBooks);


        // 2 find maximum element
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Avatar", "Housemaid", "Titanic"
        ));

        String longest = movies.get(0);
        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }
        System.out.println("2) longest movie title: " + longest);


        // 3 count occurrences
        ArrayList<String> foods = new ArrayList<>(Arrays.asList(
                "Pizza", "Burger", "Pizza", "Pasta", "Pizza"
        ));

        int count = 0;
        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }
        System.out.println("3) pizza appears: " + count + " times");


        // 4 remove all matching elements
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Orange", "Banana"
        ));

        fruits.removeIf(fruit -> fruit.equals("Banana"));
        System.out.println("4) fruits without Banana: " + fruits);


        // 5 replace all elements
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "red", "blue", "green"
        ));

        Collections.fill(colors, "black");
        System.out.println("5) colors replaced: " + colors);


        // 6 check sublist presence
        ArrayList<String> sports = new ArrayList<>(Arrays.asList(
                "football", "basketball", "tennis", "hockey"
        ));
        ArrayList<String> subSports = new ArrayList<>(Arrays.asList(
                "football", "tennis"
        ));

        boolean contains = sports.containsAll(subSports);
        System.out.println("6) contains sublist: " + contains);


        // 7 find index of element
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList(
                "Rose", "Lily", "Tulip", "Rose", "Lilac"
        ));

        int firstIndex = flowers.indexOf("Rose");
        int lastIndex = flowers.lastIndexOf("Rose");

        System.out.println("7) first index: " + firstIndex + ", last index: " + lastIndex);


        // 8 remove duplicates
        ArrayList<String> animals = new ArrayList<>(Arrays.asList(
                "cat", "dog", "cat", "horse"
        ));

        Set<String> uniqueAnimals = new LinkedHashSet<>(animals);
        animals.clear();
        animals.addAll(uniqueAnimals);

        System.out.println("8) unique animals: " + animals);


        // 9 convert arrayList to array
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "Paris", "London", "Tokyo", "Bishkek"
        ));

        String[] cityArray = cities.toArray(new String[0]);
        System.out.println("9) array: " + Arrays.toString(cityArray));


        // 10. Convert Array to ArrayList
        Integer[] numbers = {1, 2, 3, 4};

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("10) arrayList: " + numberList);
    }
}
