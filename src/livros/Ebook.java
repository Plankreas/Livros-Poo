/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

/**
 *
 * @author edupl
 */
public class Ebook extends Livros{
    private String formato;
    private boolean audioBookDisp;
    private double tamanhoArquivo;
    
    public Ebook(){
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Livro: " +this.getNomeLivro());
    	System.out.println("Descrição: " +this.getDescricao());
    	System.out.println("Valor: " +this.getValor());
    	System.out.println("ISBN: " +this.getIsbn());
        System.out.println("Formato: " +this.getFormato());
        System.out.println("Tamanho do arquivo: " +this.getTamanhoArquivo() +"Kb");
        if (this.audioBookDisp == true){
            System.out.println("AudioBook: Disponível");
        } else {
            System.out.println("AudioBook: Indisponível");
        }
        getAutor().mostrarInformacoesAutor();
        System.out.println("=======================================");
        System.out.println("");
    }

    
    
    
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isAudioBookDisp() {
        return audioBookDisp;
    }

    public void setAudioBookDisp(boolean audioBookDisp) {
        this.audioBookDisp = audioBookDisp;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    
    
}
