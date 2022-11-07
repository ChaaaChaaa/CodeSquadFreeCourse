package library;

import java.util.List;
import java.util.Objects;

public class BookLists {
    List<BookInfo> bookList;

    BookLists(List<BookInfo> bookList) {
        this.bookList = bookList;
    }

    public void storeBook() {
        bookList.add(new BookInfo("조정래", "태백산맥"));
        bookList.add(new BookInfo("리처드 도킨즈", "이기적 유전자"));
        bookList.add(new BookInfo("박완서", "자전거 도둑"));
        bookList.add(new BookInfo("박경리", "토지"));
        bookList.add(new BookInfo("제레드 다이아몬드", "대변동"));
    }

    public List<BookInfo> changeBookList(List<BookInfo> bookList, String originalName, String changeName) {
        for (BookInfo bookInfo : bookList) {
            if (Objects.equals(bookInfo.bookName, originalName)) {
                bookInfo.bookName = changeName;
            }
        }
        return bookList;
    }

    public List<BookInfo> storeNewBook(List<BookInfo> bookList, String newBookName, String newBookAuthor) {
        bookList.add(new BookInfo(newBookAuthor, newBookName));
        return bookList;
    }
}
