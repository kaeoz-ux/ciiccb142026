
public class Tasksheet11 {

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", 2020, 599.99);
        Book book2 = new Book("Python Basics", "John Smith", 2022, 399.50);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:");
        System.out.println(book1.toString());
        System.out.println();

        System.out.println("Book 2:");
        System.out.println(book2.toString());
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3.toString());
    }
}
