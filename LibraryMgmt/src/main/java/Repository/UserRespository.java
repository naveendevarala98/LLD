package Repository;

import Book.BookItem;
import model.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class UserRespository {


    private static List<Member> user = new ArrayList<>();

    public static void addUser(Member member){
        user.add(member);
    }

    public static List<Member> fetchUser(){
        return user;
    }
}
