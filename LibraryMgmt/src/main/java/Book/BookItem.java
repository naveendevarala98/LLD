package Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookItem extends book {

    String barCode;
    Date issueDate;
    Rack rack;


    public BookItem(String barCode, String title, int uuid, Rack rack){
        this.barCode=barCode;
        this.setTitle(title);
        this.setUuid(uuid);
        this.rack = rack;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "barCode='" + barCode + '\'' +
                "titel=" + getTitle() +
                "issue date="+getIssueDate()+
                '}';
    }
}
