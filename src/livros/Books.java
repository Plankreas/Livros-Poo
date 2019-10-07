package livros;
 
import java.text.NumberFormat;
import java.util.Locale;

public class Books {
	private String nameBook;
	private String description;
	private double price;
	private String isbn;
        private int bookCode;
        
    Locale ptBR = new Locale("pt", "BR");    
    NumberFormat moeda = NumberFormat.getCurrencyInstance(ptBR);
    
    Author author = new Author();
    
    public Books(){
        this.nameBook = "Desconhecido";
        this.description = "[...]";
        this.isbn = "000-00-00000-00-0";
    }
    
    
    public void showInfo(){
	}
        //============================== [ ???? ] ==============================

         /*
         NumberFormat numero = NumberFormat.getNumberInstance(ptBR);
         DateFormat data = DateFormat.getDateInstance(DateFormat.FULL, ptBR);
         DateFormat tempo = DateFormat.getTimeInstance(DateFormat.MEDIUM, ptBR);*/
         
         
         
         
         
        
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

	public String getIsbn() {
    	return isbn;
	}

	public void setIsbn(String isbn) {
    	this.isbn = isbn;
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
