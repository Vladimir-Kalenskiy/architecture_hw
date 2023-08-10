package boundary;

import entity.Book;
import control.BookStore;
import control.IbookStore;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IbookStore bookStore = new BookStore();

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin", 34.99);
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", 29.99);
        bookStore.addBook(book1);
        bookStore.addBook(book2);

        // Получаем список всех книг в магазине
        List<Book> books = bookStore.getAllBooks();
        for (Book book : books) {
            System.out.println("Книга: " + book.getTitle() +
                    ", Автор: " + book.getAuthor() +
                    ", Цена: $" + book.getPrice());
        }
    }
}
