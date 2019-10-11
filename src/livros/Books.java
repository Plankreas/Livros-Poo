package livros;

import java.text.NumberFormat;
import java.util.Locale;

public class Books {

    private String nameBook;
    private String description;
    private double price;
    private String isbn10;
    private String isbn13;
    private int bookCode;

    Locale ptBR = new Locale("pt", "BR");
    NumberFormat moeda = NumberFormat.getCurrencyInstance(ptBR);

    Author author = new Author();

    public Books() {
        this.nameBook = "Desconhecido";
        this.description = "[...]";
        this.isbn10 = "0-0000-0000-0";
        this.isbn13 = "000-00-00000-00-0";
    }

    public void showInfo() {
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

}
