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
public class LivroFisico extends Livros {
    String tamanho;
    double peso;
    boolean capaDura;
    
    public LivroFisico(){
    }

    
    @Override
    public void mostrarInformacoes(){
    	System.out.println("Nome do Livro: " +this.getNomeLivro());
    	System.out.println("Descrição: " +this.getDescricao());
    	System.out.println("Valor: " +this.getValor());
    	System.out.println("ISBN: " +this.getIsbn());
        System.out.println("Tamanho: " +this.getTamanho());
        System.out.println("Peso: " +this.getPeso() +"g");
        if (this.capaDura == true){
            System.out.println("Capa: Dura");
        } else {
            System.out.println("Capa: Brochura");
        }        
        getAutor().mostrarInformacoesAutor();
        System.out.println("=======================================");
        System.out.println("");
	}
    
        
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    
}
