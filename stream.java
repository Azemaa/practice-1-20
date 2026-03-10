import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String group;
    double gpa;

    public Student(String name, String group, double gpa) {
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }

    public String toString() {
        return name + " (" + group + ", GPA: " + gpa + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        // list of strings
        List<String> strings = List.of("apple", "banana", "cherry", "avocado");

        // convert to uppercase
        List<String> upper = strings.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("uppercase: " + upper);

        // count strings starting with 'a'
        long countA = strings.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.println("start with 'a': " + countA);

        // concatenate into comma-separated string
        String joined = strings.stream()
                .collect(Collectors.joining(", "));
        System.out.println("joined: " + joined);


        // list of numbers
        List<Integer> numbers = List.of(5, 2, 9, 1, 2, 4, 6);

        // sort descending
        List<Integer> sorted = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("sorted descending: " + sorted);

        // max and Min
        int max = numbers.stream().max(Integer::compareTo).get();
        int min = numbers.stream().min(Integer::compareTo).get();
        System.out.println("max: " + max + " min: " + min);

        // remove duplicates
        List<Integer> unique = numbers.stream()
                .distinct()
                .toList();
        System.out.println("unique numbers: " + unique);

        // filter even numbers
        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("even numbers: " + even);


        // list of students
        List<Student> students = List.of(
                new Student("Azema", "COMFCI-25", 3.9),
                new Student("Aida", "COMSE-25", 3.2),
                new Student("Bek", "COMSE-24", 3.7),
                new Student("Dana", "COMFCI-24", 3.6),
                new Student("Aiana", "COMSE-23", 4.0)
        );

        // group students by group
        Map<String, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.group));
        System.out.println("grouped by group: " + grouped);

        // average GPA
        double avgGpa = students.stream()
                .mapToDouble(s -> s.gpa)
                .average()
                .orElse(0);
        System.out.println("average GPA: " + avgGpa);

        // first 3 students with GPA > 3.5
        List<Student> top3 = students.stream()
                .filter(s -> s.gpa > 3.5)
                .limit(3)
                .toList();
        System.out.println("first 3 with GPA > 3.5: " + top3);

        // count students with GPA > 3.5
        long countHighGpa = students.stream()
                .filter(s -> s.gpa > 3.5)
                .count();
        System.out.println("students with GPA > 3.5: " + countHighGpa);
    }
}