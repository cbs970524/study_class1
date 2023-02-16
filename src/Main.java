public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java의 정석");
        book1.takeBook("Java의 정석");
        book1.writer = "남궁성";
        book1.returnBook("Java의 정석");
    }
}