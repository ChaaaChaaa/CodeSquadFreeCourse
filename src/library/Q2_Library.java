package library;

import java.util.ArrayList;

public class Q2_Library {
    public static void main(String[] args) {
        BookLists A_Library = new BookLists(new ArrayList<>());
        A_Library.storeBook();
        BookLists A1_Library = new BookLists(A_Library.bookList);
        BookLists B_Library = new BookLists(new ArrayList<>());
        B_Library.storeBook();

        A_Library.changeBookList(A_Library.bookList,"자전거 도둑","그 많던 싱아는 누가 다 먹었을까");
        B_Library.storeNewBook(B_Library.bookList,"사피엔스","유발 하라리");

        A_Library.bookList.stream().forEach(book -> System.out.print(book.bookName+","+book.author+" "));


        System.out.println();
        A1_Library.bookList.stream().forEach(book -> System.out.print(book.bookName+","+book.author+" "));
        System.out.println();
        B_Library.bookList.stream().forEach(book -> System.out.print(book.bookName+","+book.author+" "));

    }
}
