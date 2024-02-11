package service;

import Book.BookItem;
import Repository.LibraryRepository;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class LibraryService {
    int rackSize;
    TreeSet<Integer> ts;
    public LibraryService(int rackSize){
        this.rackSize=rackSize;
        ts  = new TreeSet<>();
        for (int i=1;i<=rackSize;i++){
            ts.add(i);
        }
    }
    public void addBookItem(BookItem bookItem){
        int rack = ts.pollFirst();
        if(bookItem != null){
            LibraryRepository.addBook(bookItem, rack);
        }

        System.out.println(ts.size());
    }


    public List<BookItem> fetchBooks(int rackNo){
        return LibraryRepository.fetchBookMap(rackNo);
    }
}
