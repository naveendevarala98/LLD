package model;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;

public class Member extends Account{

    Date createdDate;

    public Member(String userId, String password){
        super(userId, password);
        this.createdDate = new Date();
    }

    public Date getCreatedDate() {
        return createdDate;
    }


}
