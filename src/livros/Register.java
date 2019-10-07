package livros;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Register {
    
    public static ArrayList<Author> author = new ArrayList<>();
    public static ArrayList<Books> book = new ArrayList<>();
    public static ArrayList<Ebook> eBook = new ArrayList<>();
    public static ArrayList<PrintBook> printBook = new ArrayList<>();

//================================ [ MAIN ] ================================
        
    public static void main(String[] args) {
        
        dateTime();
        
        PrintBook l1 = new PrintBook();
        Ebook l2 = new Ebook();
        PrintBook l3 = new PrintBook();
          
        l1.setBookCode(1);
        l1.setNameBook("Constelações de Altador | Vol. I");
        l1.setDescription("Descrição sobre as incontáveis constelações do céu de Altador");
        l1.setPrice(32.50);
        l1.setIsbn("2-04-469716-1");
        l1.setSize("15,88 x 23,50 cm");
        l1.setWeigth(300);
        l1.setHardcover(true);
        l1.getAuthor().setAuthorName("Desatu Yurble");
        l1.getAuthor().setAuthorEmail("DesaYurb@TNT.com");
        l1.getAuthor().setCpf("183.427.666-69");
        
        l2.setBookCode(2);
        l2.setNameBook("O assassinato de Bemnor");        
        l2.setDescription("Cobertura do caso de assassinato de Bemnor");
        l2.setPrice(55.00);
        l2.setIsbn("B00086U61Y");
        l2.setFormat(".PDF");
        l2.setAudioBook(true);    
        l2.setFileSize(862);
        l2.getAuthor().setAuthorName("Tennebie Jubjub");
        l2.getAuthor().setAuthorEmail("Tenneb@TNT.com");
        l2.getAuthor().setCpf("729.951.753-99");
        
        book.add(l1);
        book.add(l2);
        book.add(l3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
        boolean exit = false;
        while (exit == false){
        System.out.println("____________________________\n"
                        + "\n"
                        + "Δ=== [ MENU ] ===Δ \n"
                        + "| [1] Incluir    | \n"
                        + "| [2] Listar     | \n"
                        + "| [3] Reajustar  | \n"
                        + "| [4] Encerrar   | \n"
                        + "Δ================Δ\n");
            
        Scanner m = new Scanner(System.in);
        String menuA = m.next();
            
        switch (menuA){
            case "1":
                menuInclude();
                break;
            case "2":
                menuList();
                break;
            case "3":
                System.out.println("Reajustar");
                break;
            case "4":
                exit = true;
                break;
                }
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
           
            /*l1.showInfo();
            l2.showInfo();
            
            l1.changePrice(0.2);
            l1.showInfo();
            
            l2.changePrice(0.5);
            l2.showInfo();
            
            l3.showInfo();*/

    }

//================================ [ DATA/HORA ] ===============================

    public static void dateTime(){
        LocalDateTime date = LocalDateTime.now();
        String formatData = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss"));
        System.out.println(formatData);
    }
    
    
    
//================================= [ INCLUIR ] ================================
    
    private static void menuInclude(){
        System.out.println(
                      "Δ== [ INCLUIR ] ==Δ \n"
                    + "| [1] Livro       | \n"
                    + "| [2] Autor       | \n"
                    + "| [3] Cancelar    | \n"
                    + "Δ=================Δ\n");
            
            Scanner m = new Scanner(System.in);
            String menuA = m.next();
            
            switch (menuA){
                case "1":
                    includeBook();
                    break;
                case "2":
                    includeAuthor();
                    break;
                case "3": 
                    break;
            }
    }
    
//______________________________________________________________________________
    
    private static void includeBook(){
        System.out.println(
                      "Δ== [ LIVRO ] ==Δ \n"
                    + "| [1] Fisico    | \n"
                    + "| [2] e-Book    | \n"
                    + "| [3] Cancelar  | \n"
                    + "Δ===============Δ\n");
        
        Scanner m = new Scanner(System.in);
        String menuA = m.next();
        
        Books books = new Books();
        books.setBookCode(book.size() + 1);
        
        int x = 1;
        while (x == 1){
            System.out.println(
                      "Δ===== [ AUTOR ] =====Δ \n"
                    + "| [1] Listar          | \n"
                    + "| [2] Código de Autor | \n"
                    + "| [3] Novo Autor      | \n"
                    + "Δ=====================Δ\n");
            
            Scanner y = new Scanner(System.in);
            x = y.nextInt();
            
           if (x == 1){
               authorList();
           }
           if (x == 2){
               System.out.println("Código do Autor: ");
               m = new Scanner(System.in);
               x = m.nextInt();
               for (Author authors : author){
                   if (authors.getCode() == x){
                       books.setAuthor(authors);
                   }
               }
           }
           if (x == 3){
               includeAuthor();
           }
        }
        
        
        switch (menuA){
                case "1":
                    PrintBook bo = new PrintBook();
                    
                    System.out.println("Nome do Livro: ");
                    m = new Scanner(System.in);
                    bo.setNameBook(m.nextLine());
                    
                    System.out.println("Descrição: ");
                    m = new Scanner(System.in);
                    bo.setDescription(m.nextLine());
                    
                    System.out.println("Preço: ");
                    m = new Scanner(System.in);
                    bo.setPrice(m.nextDouble());
                    
                    System.out.println("ISBN: ");
                    m = new Scanner(System.in);
                    bo.setIsbn(m.nextLine());
                    
                    System.out.println("Tamanho (Altura x Largura): ");
                    m = new Scanner(System.in);
                    bo.setSize(m.nextLine());
                    
                    System.out.println("Peso: ");
                    m = new Scanner(System.in);
                    bo.setWeigth(m.nextDouble());
                    
                    System.out.println("Capa Dura: \n"
                    + "| [1] Sim | \n"
                    + "| [2] Não | \n");
                    m = new Scanner(System.in);
                    x = m.nextInt();
                    if (x == 1){
                        bo.setHardcover(true);
                    } else if (x == 2){
                        bo.setHardcover(false);
                    }
                    break;
                    
                case "2":
                    Ebook eb = new Ebook();
                    
                    System.out.println("Nome do Livro: ");
                    m = new Scanner(System.in);
                    eb.setNameBook(m.nextLine());
                    
                    System.out.println("Descrição: ");
                    m = new Scanner(System.in);
                    eb.setDescription(m.nextLine());
                    
                    System.out.println("Preço: ");
                    m = new Scanner(System.in);
                    eb.setPrice(m.nextDouble());
                    
                    System.out.println("ISBN: ");
                    m = new Scanner(System.in);
                    eb.setIsbn(m.nextLine());
                    
                    System.out.println("Formato de Arquivo: ");
                    m = new Scanner(System.in);
                    eb.setFormat(m.nextLine());
                    
                    System.out.println("AudioBook disponível: \n"
                    + "| [1] Sim | \n"
                    + "| [2] Não | \n");
                    m = new Scanner(System.in);
                    x = m.nextInt();
                    if (x == 1){
                        eb.setAudioBook(true);
                    } else if (x == 2){
                        eb.setAudioBook(false);
                    }
                    
                    System.out.println("Tamanho do Arquivo: ");
                    m = new Scanner(System.in);
                    eb.setFileSize(m.nextDouble());
                    
                    break;
                    
                case "3": 
                    break;
            }
        
        book.add(books);
    }
    
//______________________________________________________________________________
    
    private static void includeAuthor(){
        Author authors = new Author();
        
        authors.setCode(author.size() + 1);
        
        
        System.out.println("Nome do Autor: ");
        Scanner m = new Scanner(System.in);
        authors.setAuthorName(m.nextLine());
        
        System.out.println("Email: ");
        m = new Scanner(System.in);
        authors.setAuthorEmail(m.nextLine());
        
        System.out.println("CPF: ");
        m = new Scanner(System.in);
        authors.setCpf(m.nextLine());
        
        author.add(authors);
    }
    
    
    
    
//================================= [ LISTAR ] =================================
    
    private static void menuList(){
        System.out.println(
                      "Δ== [ LISTAR POR ] ==Δ \n"
                    + "| [1] Nome do Livro  | \n"
                    + "| [2] Nome do Autor  | \n"
                    + "| [3] Livro e Autor  | \n"
                    + "| [4] Mostrar tudo   | \n"
                    + "| [5] Cancelar       | \n"
                    + "Δ====================Δ\n");
            
            Scanner m = new Scanner(System.in);
            String menuA = m.next();
            
            switch (menuA){
                case "1":
                    System.out.println("Δ [Listando por Nome do Livro] Δ");
                    bookList();
                    break;
                case "2":
                    System.out.println("Δ [Listando por Nome do Autor] Δ");
                    authorList();
                    break;                    
                case "3":
                    System.out.println("Δ [Listando por Nome do Livro e Autor] Δ");
                    bookAuthorList();
                    break;
                case "4":
                    System.out.println("Δ [Mostrando tudo] Δ");
                    showAllList();
                    break;
                case "5": 
                    break;
            }
    }
    
//______________________________________________________________________________
    
    private static void bookList(){
        if (book.isEmpty()){
            System.out.println("Não há livros cadastrados.");
        } else {
            for (Books b : book){
                System.out.println(b.getBookCode() + " - " +b.getNameBook());
            }
        }
    }
    
//______________________________________________________________________________ 
    
    private static void authorList(){
        if (author.isEmpty()){
            System.out.println("Não há autores cadastrados.");
        } else {
            for (Author a : author){
                System.out.println(a.getCode() + " - " + a.getAuthorName());
            }
        }
    }
    
//______________________________________________________________________________
    
    private static void bookAuthorList(){
        if (book.isEmpty()){
            System.out.println("Não há livros cadastrados.");
        } else {
            for (Books b : book){
                System.out.println(b.getBookCode() + " - Livro: " +b.getNameBook());
                System.out.println("Autor: " +b.getAuthor().getAuthorName());
            }
        }
    }
    
//______________________________________________________________________________
    
    private static void showAllList(){
        if (book.isEmpty()){
            System.out.println("Não há livros cadastrados.");
        } else {
            for (Books b : book){
                b.showInfo();
            }
        }
    }
    
    
    

//================================ [ REAJUSTAR ] ===============================
        
    public static void changePrice(double reajuste){
        
        
        
        
        
        
        /*
    	if (reajuste > 0.3){
        	System.out.println("[ERROR!]: Reajuste máximo de 30% \n [Reajuste não aplicado!]");
        	System.out.println("");
    	} else {
        	this.price += this.price * reajuste;
    	}
    	return this.price;*/
    }
    
}
