package livros;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Register {

    public static ArrayList<Author> author = new ArrayList<>();
    public static ArrayList<Books> book = new ArrayList<>();
    public static ArrayList<EBook> eBook = new ArrayList<>();
    public static ArrayList<PrintedBook> printedBook = new ArrayList<>();

//================================ [ MAIN ] ================================
    public static void main(String[] args) {

        dateTime();
        presetBook();

        boolean exit = false;
        while (exit == false) {
            System.out.println("____________________________\n"
                    + "\n"
                    + "Δ====== [ MENU ] ======Δ \n"
                    + "| [1] Incluir          | \n"
                    + "| [2] Listar           | \n"
                    + "| [3] Reajustar preço  | \n"
                    + "| [4] Encerrar         | \n"
                    + "Δ======================Δ\n");

            Scanner m = new Scanner(System.in);
            String menuA = m.next();

            switch (menuA) {
                case "1":
                    menuInclude();
                    break;
                case "2":
                    menuList();
                    break;
                case "3":
                    changePrice();
                    break;
                case "4":
                    exit = true;
                    break;
            }
        }
    }

    public static void presetBook() {

        PrintedBook l1 = new PrintedBook();
        PrintedBook l2 = new PrintedBook();
        PrintedBook l3 = new PrintedBook();
        EBook l4 = new EBook();
        EBook l5 = new EBook();
        EBook l6 = new EBook();
        PrintedBook l7 = new PrintedBook();
        PrintedBook l8 = new PrintedBook();
        EBook l9 = new EBook();
        EBook l10 = new EBook();
        PrintedBook l11 = new PrintedBook();
        EBook l12 = new EBook();
        PrintedBook l13 = new PrintedBook();
        PrintedBook l14 = new PrintedBook();
        EBook l15 = new EBook();
        EBook l16 = new EBook();
        EBook l17 = new EBook();

        l1.setBookCode(1);
        l1.setNameBook("LOONAVERSE | VOL. I    | Vivid: The Pink Rabbit Tale");
        l1.setDescription("\n"
                + "\"Me deixe colorida, vermelho, laranja, amarelo, verde\n"
                + "Destaque algo\n"
                + "Mudanças surpreendentes\n"
                + "O dia todo eu estou rindo\n"
                + "A ponto do meu coração palpitar\"\n");
        l1.setPrice(32.50);
        l1.setIsbn10("0-8955-9725-X");
        l1.setSize("15,00 x 23,00 cm");
        l1.setWeigth(300);
        l1.setHardcover(true);
        l1.getAuthor().setCode(1);
        l1.getAuthor().setAuthorName("Jeon Hee Jin");
        l1.getAuthor().setAuthorEmail("heejin@orbit.com");
        l1.getAuthor().setCpf("363.798.657-48");
//----------------------------------------------------------------------------------------------
        l2.setBookCode(2);
        l2.setNameBook("LOONAVERSE | VOL. II   | Around You: The Yellow Cat Tale");
        l2.setDescription("\n"
                + "\"Ei, você conhece meu coração?\n"
                + "Ultimamente, me sinto uma criança todos os dias\n"
                + "Me escondendo enquanto olho para você\n"
                + "Você consegue ouvir minhas palavras?\n"
                + "Eu ainda não sou corajosa o suficiente\n"
                + "Então, eu só saio em silêncio novamente\"\n");
        l2.setPrice(32.50);
        l2.setIsbn13("978-4-2470-1164-7");
        l2.setSize("15,00 x 23,00 cm");
        l2.setWeigth(250);
        l2.setHardcover(true);
        l2.getAuthor().setCode(2);
        l2.getAuthor().setAuthorName("Kim Hyun Jin");
        l2.getAuthor().setAuthorEmail("hyunjin@orbit.com");
        l2.getAuthor().setCpf("727.577.587-56");
//----------------------------------------------------------------------------------------------
        l3.setBookCode(3);
        l3.setNameBook("LOONAVERSE | VOL. III  | Let Me In: The Green Bird Tale");
        l3.setDescription("\n"
                + "\"O vento sopra profundamente em meu coração\n"
                + "Levantando as pétalas de flores\n"
                + "Derreta meu coração\n"
                + "Que pode congelar novamente\"\n");
        l3.setPrice(32.50);
        l3.setIsbn10("0-8527-1021-6");
        l3.setSize("15,00 x 23,00 cm");
        l3.setWeigth(350);
        l3.setHardcover(true);
        l3.getAuthor().setCode(3);
        l3.getAuthor().setAuthorName("Jo Ha Seul");
        l3.getAuthor().setAuthorEmail("haseul@orbit.com");
        l3.getAuthor().setCpf("754.148.538-19");
//----------------------------------------------------------------------------------------------
        l4.setBookCode(4);
        l4.setNameBook("LOONAVERSE | VOL. IV   | Kiss Later: The Orange Frog Tale");
        l4.setDescription("\n"
                + "\"Toda manhã às 9 horas\n"
                + "Você aparece\n"
                + "Eu te vejo todo dia\n"
                + "Mas meu coração se agita\n"
                + "Tudo fica estranho sem razão\n"
                + "Eu ainda sou tímida, mas\n"
                + "Eu gosto de você também\"\n");
        l4.setPrice(55.00);
        l4.setIsbn13("978-9-7835-7309-3");
        l4.setFormat(".PDF");
        l4.setAudioBook(true);
        l4.setFileSize(862);
        l4.getAuthor().setCode(4);
        l4.getAuthor().setAuthorName("Im Yeo Jin");
        l4.getAuthor().setAuthorEmail("yeojin@orbit.com");
        l4.getAuthor().setCpf("944.046.425-98");
//----------------------------------------------------------------------------------------------
        l5.setBookCode(5);
        l5.setNameBook("LOONAVERSE | VOL. V    | Everyday I Love You: The Rose Deer Tale");
        l5.setDescription("\n"
                + "\"Devo ir secretamente até você e te beijar?\n"
                + "Devo segurar a sua mão e te contar?\n"
                + "Que eu gosto de você, porque eu gosto de você\n"
                + "Eu quero estar com você\"\n");
        l5.setPrice(55.00);
        l5.setIsbn10("0-2680-6187-4");
        l5.setFormat(".PDF");
        l5.setAudioBook(true);
        l5.setFileSize(862);
        l5.getAuthor().setCode(5);
        l5.getAuthor().setAuthorName("Wong Ka Vivi");
        l5.getAuthor().setAuthorEmail("vivi@orbit.com");
        l5.getAuthor().setCpf("148.982.026-40");
//----------------------------------------------------------------------------------------------
        l6.setBookCode(6);
        l6.setNameBook("LOONAVERSE | VOL. VI   | Eclipse: The Red Owl Tale");
        l6.setDescription("\n"
                + "\"Uma meia-noite calma, me envolva em seu abraço\n"
                + "Como neblina, se aproxima, silenciosamente\n"
                + "Irei florescer em sua mente\n"
                + "Mesmo que o tempo passe, não me solte\n"
                + "Você é o único que eu quero\"\n");
        l6.setPrice(55.00);
        l6.setIsbn13("978-4-6403-3726-9");
        l6.setFormat(".PDF");
        l6.setAudioBook(true);
        l6.setFileSize(862);
        l6.getAuthor().setCode(6);
        l6.getAuthor().setAuthorName("Kim Jeong Lip");
        l6.getAuthor().setAuthorEmail("kimlip@orbit.com");
        l6.getAuthor().setCpf("394.068.326-40");
//----------------------------------------------------------------------------------------------
        l7.setBookCode(7);
        l7.setNameBook("LOONAVERSE | VOL. VII  | Singing In The Rain: The Blue Betta Tale");
        l7.setDescription("\n"
                + "\"Pelo pecado engolindo todas as estrelas do céu\n"
                + "Você se espalhou no azul\n"
                + "Estamos em pé esta noite\n"
                + "E essa música está caindo agora \n"
                + "Cantando na chuva\"\n");
        l7.setPrice(32.50);
        l7.setIsbn10("0-1604-8488-X");
        l7.setSize("15,00 x 23,00 cm");
        l7.setWeigth(250);
        l7.setHardcover(true);
        l7.getAuthor().setCode(7);
        l7.getAuthor().setAuthorName("Jung Jin Soul");
        l7.getAuthor().setAuthorEmail("jinsoul@orbit.com");
        l7.getAuthor().setCpf("172.522.175-66");
//----------------------------------------------------------------------------------------------
        l8.setBookCode(8);
        l8.setNameBook("LOONAVERSE | VOL. VIII | Love Cherry Motion: The Purple Bat Tale");
        l8.setDescription("\n"
                + "\"Eu caí, movimento de amor da cereja\n"
                + "Num roxo sonho de uma noite de verão\n"
                + "Magia de amor da cereja\n"
                + "Sonhando de um paraíso com você\"\n");
        l8.setPrice(32.50);
        l8.setIsbn13("978-3-9660-1268-3");
        l8.setSize("15,00 x 23,00 cm");
        l8.setWeigth(250);
        l8.setHardcover(true);
        l8.getAuthor().setCode(8);
        l8.getAuthor().setAuthorName("Choerry Ye Rim");
        l8.getAuthor().setAuthorEmail("choerry@orbit.com");
        l8.getAuthor().setCpf("625.738.849-02");
//----------------------------------------------------------------------------------------------
        l9.setBookCode(9);
        l9.setNameBook("LOONAVERSE | VOL. VI   | New: The Burgundy Swan Tale");
        l9.setDescription("\n"
                + "\"Disposta a me aproximar do sol\n"
                + "Batendo as asas queimadas\n"
                + "Minhas miseráveis aparências\n"
                + "Só então aprendi meus novos dias\"\n");
        l9.setPrice(55.00);
        l9.setIsbn10("0-2657-8398-4");
        l9.setFormat(".PDF");
        l9.setAudioBook(true);
        l9.setFileSize(862);
        l9.getAuthor().setCode(9);
        l9.getAuthor().setAuthorName("Yves Soo Young");
        l9.getAuthor().setAuthorEmail("yves@orbit.com");
        l9.getAuthor().setCpf("884.625.871-15");
//----------------------------------------------------------------------------------------------
        l10.setBookCode(10);
        l10.setNameBook("LOONAVERSE | VOL. X    | Heart Attack: The Peach Penguin Tale");
        l10.setDescription("\n"
                + "\"As coisas que eu faço são por você\n"
                + "Como a Lua dá voltas na Terra\n"
                + "Nós vamos nos ver\n"
                + "Na trilha do amor\"\n");
        l10.setPrice(32.50);
        l10.setIsbn13("978-6-8037-0189-4");
        l10.setFormat(".PDF");
        l10.setAudioBook(true);
        l10.setFileSize(862);
        l10.getAuthor().setCode(10);
        l10.getAuthor().setAuthorName("Kim Ji Chuu");
        l10.getAuthor().setAuthorEmail("chuu@orbit.com");
        l10.getAuthor().setCpf("841.351.447-99");
//----------------------------------------------------------------------------------------------
        l11.setBookCode(11);
        l11.setNameBook("LOONAVERSE | VOL. XI   | One & Only: The Mint Butterfly Tale");
        l11.setDescription("\n"
                + "\"Eu não preciso de nenhum jardim do Éden\n"
                + "Pois o tempo em minhas mãos\n"
                + "Já me diz que estou no céu\"\n");
        l11.setPrice(32.50);
        l11.setIsbn10("0-3249-2426-7");
        l11.setSize("15,00 x 23,00 cm");
        l11.setWeigth(250);
        l11.setHardcover(true);
        l11.getAuthor().setCode(11);
        l11.getAuthor().setAuthorName("Park Go Won");
        l11.getAuthor().setAuthorEmail("gowon@orbit.com");
        l11.getAuthor().setCpf("363.367.813-13");
//----------------------------------------------------------------------------------------------
        l12.setBookCode(12);
        l12.setNameBook("LOONAVERSE | VOL. XII  | Egoist: The Silver Wolf Tale");
        l12.setDescription("\n"
                + "\"Todas as pétalas das flores que floresceram no meu coração caíram\n"
                + "Minhas lágrimas estão nas pontas dos meus dedos\n"
                + "Na beira da escuridão, indo para casa depois do pôr do Sol\n"
                + "Foi aí que vi o luar\"\n");
        l12.setPrice(32.50);
        l12.setIsbn13("978-4-1332-5108-9");
        l12.setFormat(".PDF");
        l12.setAudioBook(true);
        l12.setFileSize(862);
        l12.getAuthor().setCode(12);
        l12.getAuthor().setAuthorName("Son Olivia Hye Joo");
        l12.getAuthor().setAuthorEmail("oliviahye@orbit.com");
        l12.getAuthor().setCpf("732.232.719-53");
//----------------------------------------------------------------------------------------------
        l13.setBookCode(13);
        l13.setNameBook("LOONAVERSE | VOL. 1/3  | Love & Evil: Sonatine");
        l13.setDescription("\n"
                + "\"O segredo dos segredos será revelado\n"
                + "Dentro da escuridão, no final da estrada\n"
                + "Poderemos nos encontrar?\"\n");
        l13.setPrice(32.50);
        l13.setIsbn10("0-8486-6748-4");
        l13.setSize("15,00 x 23,00 cm");
        l13.setWeigth(250);
        l13.setHardcover(true);
        l13.getAuthor().setCode(13);
        l13.getAuthor().setAuthorName("1/3 Unit");
        l13.getAuthor().setAuthorEmail("onethird@orbit.com");
        l13.getAuthor().setCpf("917.617.434-49");
//----------------------------------------------------------------------------------------------
        l14.setBookCode(14);
        l14.setNameBook("LOONAVERSE | VOL. OEC  | Mix & Match: Sweet Crazy Love");
        l14.setDescription("\n"
                + "\"Meus sentimentos congelados estão acordando um por um\n"
                + "No meu coração cinza, depois que você se ergueu\n"
                + "Corri com curiosidade, e peguei sua mão sem saber\n"
                + "No momento que nos tocamos, eu fui tingida\"\n");
        l14.setPrice(32.50);
        l14.setIsbn13("978-4-1490-5316-5");
        l14.setSize("15,00 x 23,00 cm");
        l14.setWeigth(250);
        l14.setHardcover(true);
        l14.getAuthor().setCode(14);
        l14.getAuthor().setAuthorName("Odd Eye Circle");
        l14.getAuthor().setAuthorEmail("oecircle@orbit.com");
        l14.getAuthor().setCpf("782.315.057-33");
//----------------------------------------------------------------------------------------------
        l15.setBookCode(15);
        l15.setNameBook("LOONAVERSE | VOL. YYXY | Beauty And The Beat: Love4Eva");
        l15.setDescription("\n"
                + "\"Eu vou sonhar um pouco mais\n"
                + "Eu entendo esse amor\n"
                + "Por que você mexe tanto comigo?\n"
                + "Meu coração continua derrentendo mesmo assim\"\n");
        l15.setPrice(32.50);
        l15.setIsbn10("0-6845-0120-1");
        l15.setFormat(".PDF");
        l15.setAudioBook(true);
        l15.setFileSize(862);
        l15.getAuthor().setCode(15);
        l15.getAuthor().setAuthorName("Youth Youth by Young");
        l15.getAuthor().setAuthorEmail("yyxy@orbit.com");
        l15.getAuthor().setCpf("586.675.564-59");
//----------------------------------------------------------------------------------------------
        l16.setBookCode(16);
        l16.setNameBook("LOONAVERSE | VOL. ++ | Hi High");
        l16.setDescription("\n"
                + "\"Mande mais mensagens, me conte aquela doce historia\n"
                + "Assim eu vou mandar uma ou duas vezes ao dia\n"
                + "Estou sendo mais egoísta do que nunca\n"
                + "É você, sim\"\n");
        l16.setPrice(32.50);
        l16.setIsbn13("978-7-5840-4218-3");
        l16.setFormat(".PDF");
        l16.setAudioBook(true);
        l16.setFileSize(862);
        l16.getAuthor().setCode(16);
        l16.getAuthor().setAuthorName("LOONA");
        l16.getAuthor().setAuthorEmail("loona@orbit.com");
        l16.getAuthor().setCpf("575.267.137-00");
//----------------------------------------------------------------------------------------------
        l17.setBookCode(17);
        l17.setNameBook("LOONAVERSE | VOL. ×× | Butterfly Effect");
        l17.setDescription("\n"
                + "\"Você suspirará para mim? Você é o déjà-vu que me acorda\n"
                + "Agora, é você agora?\n"
                + "Eu posso senti-la chegando, uma miragem com asas\n"
                + "Como? É verdade agora?\"\n");
        l17.setPrice(32.50);
        l17.setIsbn10("0-5296-8144-7");
        l17.setFormat(".PDF");
        l17.setAudioBook(true);
        l17.setFileSize(862);
        l17.getAuthor().setCode(16);
        l17.getAuthor().setAuthorName("LOONA");
        l17.getAuthor().setAuthorEmail("loona@orbit.com");
        l17.getAuthor().setCpf("575.267.137-00");

        book.add(l1);
        book.add(l2);
        book.add(l3);
        book.add(l4);
        book.add(l5);
        book.add(l6);
        book.add(l7);
        book.add(l8);
        book.add(l9);
        book.add(l10);
        book.add(l11);
        book.add(l12);
        book.add(l13);
        book.add(l14);
        book.add(l15);
        book.add(l16);
        book.add(l17);

        author.add(l1.getAuthor());
        author.add(l2.getAuthor());
        author.add(l3.getAuthor());
        author.add(l4.getAuthor());
        author.add(l5.getAuthor());
        author.add(l6.getAuthor());
        author.add(l7.getAuthor());
        author.add(l8.getAuthor());
        author.add(l9.getAuthor());
        author.add(l10.getAuthor());
        author.add(l11.getAuthor());
        author.add(l12.getAuthor());
        author.add(l13.getAuthor());
        author.add(l14.getAuthor());
        author.add(l15.getAuthor());
        author.add(l16.getAuthor());
        author.add(l17.getAuthor());

    }
    
    

//================================ [ DATA/HORA ] ===============================
    public static void dateTime() {
        LocalDateTime date = LocalDateTime.now();
        String formatData = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss"));
        System.out.println(formatData);
    }
    
    

//================================= [ INCLUIR ] ================================
    private static void menuInclude() {
        System.out.println(
                "Δ== [ INCLUIR ] ==Δ \n"
                + "| [1] Livro       | \n"
                + "| [2] Autor       | \n"
                + "| [3] Cancelar    | \n"
                + "Δ=================Δ\n");

        Scanner m = new Scanner(System.in);
        String menuA = m.next();

        switch (menuA) {
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
    private static void includeBook() {
        System.out.println(
                "Δ== [ LIVRO ] ==Δ \n"
                + "| [1] Fisico    | \n"
                + "| [2] e-Book    | \n"
                + "Δ===============Δ\n");

        Scanner m = new Scanner(System.in);
        String menuA = m.next();

        Books books = new Books();
        books.setBookCode(book.size() + 1);

        int x = 1;

        switch (menuA) {
            case "1":
                PrintedBook bo = new PrintedBook();

                System.out.print("Nome do Livro: ");
                m = new Scanner(System.in);
                bo.setNameBook(m.nextLine());
                

                System.out.print("Descrição: ");
                m = new Scanner(System.in);
                bo.setDescription(m.nextLine());

                System.out.print("Preço: ");
                m = new Scanner(System.in);
                bo.setPrice(m.nextDouble());

                System.out.print("ISBN: ");
                m = new Scanner(System.in);
                String isbn = m.nextLine();
                if (isbn.length() == 17) {
                    System.out.print(isbn.length());
                    bo.setIsbn13(isbn);
                } else if (isbn.length() == 13) {
                    bo.setIsbn10(isbn);
                }

                System.out.print("Tamanho (Altura x Largura): ");
                m = new Scanner(System.in);
                bo.setSize(m.nextLine());

                System.out.print("Peso: ");
                m = new Scanner(System.in);
                bo.setWeigth(m.nextDouble());

                System.out.println("Capa Dura: \n"
                        + "| [1] Sim | \n"
                        + "| [2] Não | \n");
                m = new Scanner(System.in);
                x = m.nextInt();
                if (x == 1) {
                    bo.setHardcover(true);
                } else if (x == 2) {
                    bo.setHardcover(false);
                }
                
                while (x == 1) {
            System.out.println(
                    "Δ===== [ AUTOR ] =====Δ \n"
                    + "| [1] Listar          | \n"
                    + "| [2] Código de Autor | \n"
                    + "| [3] Novo Autor      | \n"
                    + "Δ=====================Δ\n");

            Scanner y = new Scanner(System.in);
            x = y.nextInt();

            if (x == 1) {
                authorList();
            }
            if (x == 2) {
                System.out.print("Digite o Código do Autor: ");
                m = new Scanner(System.in);
                x = m.nextInt();
                for (Author authors : author) {
                    if (authors.getCode() == x) {
                        bo.setAuthor(authors);
                        
                    } 
                }
            }
            if (x == 3) {
                includeAuthor();
            }
        }
                
                book.add(bo);
                
                break;

            case "2":
                EBook eb = new EBook();

                System.out.print("Nome do Livro: ");
                m = new Scanner(System.in);
                eb.setNameBook(m.nextLine());

                System.out.print("Descrição: ");
                m = new Scanner(System.in);
                eb.setDescription(m.nextLine());

                System.out.print("Preço: ");
                m = new Scanner(System.in);
                eb.setPrice(m.nextDouble());

                System.out.print("ISBN: ");
                m = new Scanner(System.in);
                eb.setIsbn10(m.nextLine());

                System.out.print("Formato de Arquivo: ");
                m = new Scanner(System.in);
                eb.setFormat(m.nextLine());

                System.out.println("AudioBook disponível: \n"
                        + "| [1] Sim | \n"
                        + "| [2] Não | \n");
                m = new Scanner(System.in);
                x = m.nextInt();
                if (x == 1) {
                    eb.setAudioBook(true);
                } else if (x == 2) {
                    eb.setAudioBook(false);
                }

                System.out.print("Tamanho do Arquivo: ");
                m = new Scanner(System.in);
                eb.setFileSize(m.nextDouble());
                
                
                while (x == 1) {
            System.out.println(
                    "Δ===== [ AUTOR ] =====Δ \n"
                    + "| [1] Listar          | \n"
                    + "| [2] Código de Autor | \n"
                    + "| [3] Novo Autor      | \n"
                    + "Δ=====================Δ\n");

            Scanner y = new Scanner(System.in);
            x = y.nextInt();

            if (x == 1) {
                authorList();
            }
            if (x == 2) {
                System.out.print("Digite o Código do Autor: ");
                m = new Scanner(System.in);
                x = m.nextInt();
                for (Author authors : author) {
                    if (authors.getCode() == x) {
                        eb.setAuthor(authors);
                        
                    } 
                }
            }
            if (x == 3) {
                includeAuthor();
            }
        }
                
                book.add(eb);
                
                break;
        }
    }

//______________________________________________________________________________
    private static void includeAuthor() {
        Author authors = new Author();

        authors.setCode(author.size() + 1);

        System.out.print("Nome do Autor: ");
        Scanner m = new Scanner(System.in);
        authors.setAuthorName(m.nextLine());

        System.out.print("Email: ");
        m = new Scanner(System.in);
        authors.setAuthorEmail(m.nextLine());

        System.out.print("CPF: ");
        m = new Scanner(System.in);
        authors.setCpf(m.nextLine());

        author.add(authors);
    }
    
    

//================================= [ LISTAR ] =================================
    private static void menuList() {
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

        switch (menuA) {
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
    private static void bookList() {
        if (book.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
        } else {
            for (Books b : book) {
                System.out.println(b.getBookCode() + " - " + b.getNameBook());
            }
        }
    }

//______________________________________________________________________________ 
    private static void authorList() {
        if (author.isEmpty()) {
            System.out.println("Não há autores cadastrados.");
        } else {
            for (Author a : author) {
                System.out.println(a.getCode() + " - " + a.getAuthorName());
            }
        }
    }

//______________________________________________________________________________
    private static void bookAuthorList() {
        if (book.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
        } else {
            for (Books b : book) {
                System.out.println(b.getBookCode() + " - Livro: " + b.getNameBook());
                System.out.println("Autor: " + b.getAuthor().getAuthorName());
                System.out.println("");
            }
        }
    }

//______________________________________________________________________________
    private static void showAllList() {
        if (book.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
        } else {
            for (Books b : book) {
                b.showInfo();
            }
        }
    }
    
    

//================================ [ REAJUSTAR ] ===============================
    public static void changePrice() {
        System.out.print("Digite o Código do Livro: ");
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();

        for (Books b : book) {
            if (b.getBookCode() == y) {
                System.out.print("Valor do reajuste (em %): ");
                x = new Scanner(System.in);
                double change = x.nextDouble() / 100;

                if (change > 0.3) {
                    System.out.println("________________________________ \n "
                            + "                                 \n "
                            + "[ERROR!]: Reajuste máximo de 30% \n "
                            + "====[Reajuste não aplicado!]==== \n "
                            + "________________________________");
                    System.out.println("");
                } else {
                    change = b.getPrice() + b.getPrice() * change;
                    b.setPrice(change);
                }
            }
        }
    }
}
