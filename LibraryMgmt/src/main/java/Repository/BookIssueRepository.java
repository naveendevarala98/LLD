package Repository;

import Book.BookItem;
import model.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookIssueRepository {

    private static Map<String, List<BookItem>> userBook = new HashMap<>();


    public static void mapBookuser(String member, BookItem bookItem){
        List<BookItem> bookList = userBook.getOrDefault(member,new ArrayList<>());
        bookList.add(bookItem);
        userBook.put(member, bookList);

        //remove book from libraru
        LibraryRepository.removeBook(bookItem);
    }

    public static List<BookItem> getBookAssociatedWithUser(String userId){
        return userBook.get(userId);
    }
}
