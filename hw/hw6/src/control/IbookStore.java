package control;

import entity.Book;

import java.util.List;

/**
 * Интерфейс IbookStore определяет методы для управления книгами в колекции.
 */
public interface IbookStore {
    /**
     * Метод добавления книги.
     *
     * @param book экземпляр для добавления.
     */
    void  addBook(Book book);

    /**
     * Метод удаления книги.
     *
     * @param book экземпляр удаления.
     */
    void removeBook(Book book);

    /**
     * Метод получения всех книг из коллекции.
     *
     * @return список всех книг.
     */
    List<Book> getAllBooks();
}
