package Repository;

import Book.BookItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryRepository {

    private static Map<Integer, BookItem> bookIdMap = new HashMap<>();

    private static Map<Integer, Integer> rackBookMap = new HashMap<>();
    public static void addBook(BookItem bookItem, int rackNo){
         bookIdMap.put(bookItem.getUuid(),bookItem);

         rackBookMap.put(bookItem.getUuid(),rackNo);
    }

    public  static List<BookItem> fetchBookMap(int rackNo){
        List<BookItem> ans = new ArrayList<>();
        if(rackNo>=0) {
            for (int key : rackBookMap.keySet()) {
                if (rackBookMap.get(key) == rackNo) {
                    ans.add(bookIdMap.get(key));
                }
            }
        }else{
            for (int key : rackBookMap.keySet()) {
                    ans.add(bookIdMap.get(key));
            }
        }
        return ans;
    }
}
