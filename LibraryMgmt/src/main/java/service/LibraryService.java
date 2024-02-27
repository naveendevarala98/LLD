package service;

import Book.BookItem;
import Repository.LibraryRepository;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class LibraryService {

    public void addBookItem(BookItem bookItem){
        if(bookItem != null){
            LibraryRepository.addBook(bookItem);
        }
    }

    public List<BookItem> fetchBooks(String rackLoaction){
        return LibraryRepository.fetchBookMap(rackLoaction);
    }

    public void removeCopyBooks(BookItem bookItem){
         LibraryRepository.removeBook(bookItem);
    }
}
