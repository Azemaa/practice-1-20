import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1 basic offer / peek / poll
        System.out.println("1 basic offer / peek / poll:");
        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        System.out.println("peek: " + q1.peek());
        while (!q1.isEmpty()) {
            System.out.print(q1.poll() + " ");
        }
        System.out.println("\n");


        // 2 stack behavior
        System.out.println("2 stack behavior:");
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n");


        // 3 add first / last
        System.out.println("3 add first / last:");
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.addFirst(1);
        d1.addLast(2);
        d1.addFirst(0);
        d1.addLast(3);
        for (int x : d1) System.out.print(x + " ");
        System.out.println("\n");


        // 4 offer first / last return value
        System.out.println("4 offer first / last return value:");
        ArrayDeque<Integer> d2 = new ArrayDeque<>();
        System.out.println(d2.offerFirst(5));
        System.out.println(d2.offerLast(10));
        System.out.println(d2 + "\n");


        // 5 peek variants
        System.out.println("5 peek variants:");
        ArrayDeque<Integer> d3 = new ArrayDeque<>();
        d3.add(1);
        d3.add(2);
        d3.add(3);
        System.out.println("peek(): " + d3.peek());
        System.out.println("peekFirst(): " + d3.peekFirst());
        System.out.println("peekLast(): " + d3.peekLast());
        d3.clear();
        System.out.println("peek empty: " + d3.peek());
        System.out.println();


        // 6 poll variants
        System.out.println("6 poll variants:");
        ArrayDeque<Integer> d4 = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
        while (!d4.isEmpty()) {
            System.out.print(d4.pollFirst() + " ");
        }
        System.out.println("\n");


        // 7 remove first / last occurrence
        System.out.println("7 remove first / last occurrence:");
        ArrayDeque<String> d5 = new ArrayDeque<>(Arrays.asList("a","b","c","b","a"));
        d5.removeFirstOccurrence("b");
        System.out.println(d5);
        d5.removeLastOccurrence("a");
        System.out.println(d5 + "\n");


        // 8 isEmpty & size
        System.out.println("8 isEmpty & size:");
        ArrayDeque<Integer> d6 = new ArrayDeque<>();
        d6.add(1);
        System.out.println("size: " + d6.size() + " isEmpty: " + d6.isEmpty());
        d6.remove();
        System.out.println("size: " + d6.size() + " isEmpty: " + d6.isEmpty());
        System.out.println();


        // 9 clear deque
        System.out.println("9 clear deque:");
        ArrayDeque<Integer> d7 = new ArrayDeque<>();
        d7.add(10);
        d7.add(20);
        d7.clear();
        System.out.println("peek(): " + d7.peek());
        System.out.println("isEmpty(): " + d7.isEmpty());
        System.out.println();


        // 10 palindrome check
        System.out.println("10 palindrome check:");
        String word = "level";
        System.out.println(word + " -> " + isPalindrome(word));
        System.out.println();


        // 11 task scheduler
        System.out.println("11 task scheduler:");
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask("homework", false);
        scheduler.addTask("exam", true);
        scheduler.addTask("practice", false);

        scheduler.processTask();
        scheduler.processTask();
        scheduler.processTask();
    }


    static boolean isPalindrome(String s) {
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()) dq.addLast(c);

        while (dq.size() > 1) {
            if (dq.pollFirst() != dq.pollLast()) return false;
        }
        return true;
    }
}


class TaskScheduler {

    ArrayDeque<String> tasks = new ArrayDeque<>();

    public void addTask(String task, boolean highPriority) {
        if (highPriority) {
            tasks.addFirst(task);
        } else {
            tasks.addLast(task);
        }
        System.out.println("added: " + task);
    }

    public void processTask() {
        if (tasks.isEmpty()) {
            System.out.println("no tasks to process.");
        } else {
            System.out.println("processed: " + tasks.pollFirst());
        }
    }
}
