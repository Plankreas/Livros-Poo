package livros;
 
public class Livros {
	private String nomeLivro;
	private String descricao;
	private double valor;
	private String isbn;
    
	Autor autor = new Autor();
        
        
        public Livros(){
            this.nomeLivro = "Desconhecido";
            this.descricao = "[...]";
            this.isbn = "000-00-00000-00-0";
            
        }
    
       
        
    
	public void mostrarInformacoes(){
	}
    
	public double alterarValor(double reajuste){
    	if (reajuste > 0.3){
        	System.out.println("[ERROR!]: Reajuste máximo de 30% \n [Reajuste não aplicado!]");
        	System.out.println("");
    	} else {
        	this.valor += this.valor * reajuste;
    	}
    	return this.valor;
	}

	public String getNomeLivro() {
    	return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
    	this.nomeLivro = nomeLivro;
	}

	public String getDescricao() {
    	return descricao;
	}

	public void setDescricao(String descricao) {
    	this.descricao = descricao;
	}

	public double getValor() {
    	return valor;
	}

	public void setValor(double valor) {
    	this.valor = valor;
	}

	public String getIsbn() {
    	return isbn;
	}

	public void setIsbn(String isbn) {
    	this.isbn = isbn;
	}

	public Autor getAutor() {
    	return autor;
	}

	public void setAutor(Autor autor) {
    	this.autor = autor;
	}
   
    
}
