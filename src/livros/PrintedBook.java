package livros;

public class PrintedBook extends Books {

    String size;
    double weigth;
    boolean hardcover;

    public PrintedBook() {
    }

    @Override
    public void showInfo() {
        System.out.println("Nome do Livro: " + this.getNameBook());
        System.out.println("Descrição: " + this.getDescription());
        System.out.println("Valor: " + moeda.format(this.getPrice()));
        System.out.println("ISBN(10): " + this.getIsbn10());
        System.out.println("ISBN(13): " + this.getIsbn13());
        System.out.println("Tamanho: " + this.getSize());
        System.out.println("Peso: " + this.getWeigth() + "g");
        if (this.hardcover == true) {
            System.out.println("Capa: Dura");
        } else {
            System.out.println("Capa: Brochura");
        }
        getAuthor().showAuthorInfo();
        System.out.println("---------------------------------------");
        System.out.println("");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

}
