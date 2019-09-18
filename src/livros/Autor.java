package livros;

public class Autor {
	private String nomeAutor;
	private String emailAutor;
	private String cpf;
    
        public Autor(){
            this.nomeAutor = "Desconhecido";
            this.emailAutor = "Email indisponível";
            this.cpf = "000.000.000-00";
        }
        
        public boolean temAutor(){
            if (this.nomeAutor == null){
                return false;
            }
            return true;
        }
        
        
    
   public void mostrarInformacoesAutor(){
       if (temAutor() == true){
           System.out.println("Nome do Autor: " +this.nomeAutor);
           System.out.println("Email do Autor: " +this.emailAutor);
           System.out.println("CPF do Autor: " +this.cpf);
           System.out.println("");
       } else {
           System.out.println("Não há autor.");
       }
   }

	public String getNomeAutor() {
    	return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
    	this.nomeAutor = nomeAutor;
	}

	public String getEmailAutor() {
    	return emailAutor;
	}

	public void setEmailAutor(String emailAutor) {
    	this.emailAutor = emailAutor;
	}

	public String getCpf() {
    	return cpf;
	}

	public void setCpf(String cpf) {
    	this.cpf = cpf;
	}
}
