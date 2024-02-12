import Book.BookItem;
import Book.Rack;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryApplication {

    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
        Rack rack = new Rack();
        rack.setNumber(1);
        rack.setLocation("A");

        Rack rack1 = new Rack();
        rack1.setNumber(2);
        rack1.setLocation("B");

        BookItem bookItem = new BookItem("bar1","title1",123, rack);

        Rack rack2 = new Rack();
        rack2.setNumber(2);
        rack2.setLocation("A");
        BookItem bookItemCopy = new BookItem("bar2","title1",123, rack2);
    //    bookItem.addCopy(new BookItem("bar1a","title1",123-1));

        BookItem bookItem2 = new BookItem("bar3","title3",456,rack1);
     //   BookItem bookItem3 = new BookItem("bar2","title2",456);


        libraryService.addBookItem(bookItem);
        libraryService.addBookItem(bookItem2);
        libraryService.addBookItem(bookItemCopy);

            System.out.println(libraryService.fetchBooks("A"));


            libraryService.removeCopyBooks(bookItemCopy);

        System.out.println(libraryService.fetchBooks("A"));





        //   System.out.println(libraryService.fetchBooks());
    }
}
