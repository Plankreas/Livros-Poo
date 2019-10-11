package livros;

public class EBook extends Books {

    private String format;
    private boolean audioBook;
    private double fileSize;

    public EBook() {
    }

    @Override
    public void showInfo() {
        System.out.println("Nome do Livro: " + this.getNameBook());
        System.out.println("Descrição: " + this.getDescription());
        System.out.println("Valor: " + moeda.format(this.getPrice()));
        System.out.println("ISBN(10): " + this.getIsbn10());
        System.out.println("ISBN(13): " + this.getIsbn13());
        System.out.println("Formato: " + this.getFormat());
        System.out.println("Tamanho do arquivo: " + this.getFileSize() + "Kb");
        if (this.audioBook == true) {
            System.out.println("AudioBook: Disponível");
        } else {
            System.out.println("AudioBook: Indisponível");
        }
        getAuthor().showAuthorInfo();
        System.out.println("---------------------------------------");
        System.out.println("");
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isAudioBook() {
        return audioBook;
    }

    public void setAudioBook(boolean audioBook) {
        this.audioBook = audioBook;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

}
