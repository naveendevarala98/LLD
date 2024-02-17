package service;

import Repository.BookIssueRepository;
import Repository.UserRespository;
import model.Member;

public class UserService {

    public void adduser(Member member){
        UserRespository.addUser(member);
    }
}
