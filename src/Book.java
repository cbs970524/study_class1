public class Book {
    String title;
    String writer;
    int printedDay;
    int page;
    static int bookCount = 0;
    int bookId;

    {
        bookId = ++bookCount;
    }

    Book(String title){
        this.title = title;
    }
    Book(String title, String writer){
        this.title = title;
        this.writer = writer;
    }


    String takeBook(String title){
        System.out.println(title + "을 대여합니다.");
        return title;
    }
    String returnBook(String title){
        System.out.println(title + "을 반납합니다.");
        return title;
    }
}

