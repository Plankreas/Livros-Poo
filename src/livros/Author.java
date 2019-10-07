package livros;

public class Author {
	private String authorName;
	private String authorEmail;
	private String cpf;
        private int code;
    
        public Author(){
            this.authorName = "Desconhecido";
            this.authorEmail = "Email indisponível";
            this.cpf = "000.000.000-00";
        }
        
        public boolean haveAuthor(){
            if (this.authorName == null){
                return false;
            }
            return true;
        }
        
        
    
   public void showAuthorInfo(){
       if (haveAuthor() == true){
           System.out.println("Nome do Autor: " +this.authorName);
           System.out.println("Email do Autor: " +this.authorEmail);
           System.out.println("CPF do Autor: " +this.cpf);
           System.out.println("");
       } else {
           System.out.println("Não há autor.");
       }
   }

	public String getAuthorName() {
    	return authorName;
	}

	public void setAuthorName(String authorName) {
    	this.authorName = authorName;
	}

	public String getAuthorEmail() {
    	return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
    	this.authorEmail = authorEmail;
	}

	public String getCpf() {
    	return cpf;
	}

	public void setCpf(String cpf) {
    	this.cpf = cpf;
	}
        
        public int getCode() {
        return code;
        }

        public void setCode(int code) {
        this.code = code;
        }
}
