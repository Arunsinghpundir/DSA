package DSA2.Queue;

public class Main {
    public static void main(String[] args) {
        queue a = new queue();
        a.add("book-1"); a.peek(); a.remove();
        a.add("book-2");
        a.add("book-3"); a.peek(); a.remove();
        a.add("book-4");
        a.add("book-5");

        a.print();

    }
}
