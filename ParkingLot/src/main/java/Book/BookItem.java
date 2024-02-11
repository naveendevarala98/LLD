package Book;

import java.util.ArrayList;
import java.util.List;

public class BookItem extends book {

    String barCode;

    List<BookItem> bookItems;

    public BookItem(String barCode, String title, int uuid){
        this.barCode=barCode;
        this.setTitle(title);
        this.setUuid(uuid);
        this.bookItems = new ArrayList<>();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void addCopy(BookItem bookItem){
        this.bookItems.add(bookItem);
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "barCode='" + barCode + '\'' +
                "titel=" + getTitle() +
                '}';
    }
}
