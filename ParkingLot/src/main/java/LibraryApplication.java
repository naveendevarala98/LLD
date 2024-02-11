import Book.BookItem;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryApplication {

    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService(2);

        BookItem bookItem = new BookItem("bar1","title1",123);
    //    bookItem.addCopy(new BookItem("bar1a","title1",123-1));

        BookItem bookItem2 = new BookItem("bar2","title2",456);
        BookItem bookItem3 = new BookItem("bar2","title2",456);


        libraryService.addBookItem(bookItem);
        libraryService.addBookItem(bookItem2);
        libraryService.addBookItem(bookItem3);

            System.out.println(libraryService.fetchBooks(2));


     //   System.out.println(libraryService.fetchBooks());
    }
}
