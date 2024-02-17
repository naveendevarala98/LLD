package service;

import Book.BookItem;
import Repository.BookIssueRepository;

public class BookIssueService {

    public void issueBook(String user, BookItem bookItem){
        BookIssueRepository.mapBookuser(user,bookItem);
    }
}
