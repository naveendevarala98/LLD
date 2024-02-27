package Repository;

import Book.BookItem;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryRepository {

    private static Map<Integer, BookItem> bookIdMap = new HashMap<>();

    private static List<BookItem> rackBookMap = new ArrayList<>();
    public static void addBook(BookItem bookItem){
        long a = rackBookMap.stream()
                .filter(r -> checkRack(r,bookItem)).count();
        if(a==0) {
            rackBookMap.add(bookItem);
        }else{
            System.out.println("alredy present in rack" +bookItem);
        }
    }

    private static boolean checkRack(BookItem bookItem, BookItem originalB){
        if(bookItem.getRack().getNumber() == originalB.getRack().getNumber()
                && bookItem.getRack().getLocation().equals(originalB.getRack().getLocation())){
            return true;
        }
        return false;
    }

    public  static List<BookItem> fetchBookMap(String rackLocation){
        if(!rackLocation.isEmpty())
      return rackBookMap.stream().filter(r->r.getRack().getLocation().equals(rackLocation)).collect(Collectors.toList());
        else
            return rackBookMap;
    }


    public static void removeBook(BookItem bookItem){

        rackBookMap.remove(bookItem);
    }
}
