package entity;

/**
 * Класс Book представляющий книгу.
 */
public class Book {
    /**
     *
     */
    private String id;
    private String title;
    private String author;
    private double price;

    /**
     * Создает новый экземпляр класса Book.
     *
     * @param id     идентификатор книги.
     * @param title  название книги.
     * @param author автор книги.
     * @param price  цена книги.
     */
    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Геттеры и сеттеры
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
