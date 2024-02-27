import Book.BookItem;
import Book.Rack;
import Repository.BookIssueRepository;
import Repository.UserRespository;
import model.Member;
import service.BookIssueService;
import service.LibraryService;
import service.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryApplication {

    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
        BookIssueService bookIssueService = new BookIssueService();
        UserService userService = new UserService();


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

            System.out.println("Books in rack A "+libraryService.fetchBooks("A"));


            libraryService.removeCopyBooks(bookItemCopy);

        System.out.println("Fetch all books before assign "+libraryService.fetchBooks(""));


        Member m1 = new Member("user1","pwd1");
        userService.adduser(m1);

        System.out.println(UserRespository.fetchUser());

        bookItem.setIssueDate(new Date());
        bookIssueService.issueBook(m1.getUserId(),bookItem);

        System.out.println(BookIssueRepository.getBookAssociatedWithUser(m1.getUserId()));

        System.out.println("Fetch all books after assign "+libraryService.fetchBooks(""));










        //   System.out.println(libraryService.fetchBooks());
    }
}
