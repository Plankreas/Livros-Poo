
package livros;

public class CadastroLivros {
    
	public static void main(String[] args) {
    	
            LivroFisico l1 = new LivroFisico();
            Ebook l2 = new Ebook();
            LivroFisico l3 = new LivroFisico();
            
            l1.setNomeLivro("Constelações de Altador | Vol. I");
            l1.setDescricao("Descrição sobre as incontáveis constelações do céu de Altador");
            l1.setValor(32.50);
            l1.setIsbn("2-04-469716-1");
            l1.setTamanho("15,88 x 23,50 cm");
            l1.setPeso(300);
            l1.setCapaDura(true);
            l1.getAutor().setNomeAutor("Desatu Yurble");
            l1.getAutor().setEmailAutor("DesaYurb@TNT.com");
            l1.getAutor().setCpf("183.427.666-69");
            
            l2.setNomeLivro("O assassinato de Bemnor");
            l2.setDescricao("Cobertura do caso de assassinato de Bemnor");
            l2.setValor(55.00);
            l2.setAmazon(true);
            l2.setIsbn("B00086U61Y");
            l2.setFormato(".PDF");
            l2.setAudioBookDisp(true);
            l2.setTamanhoArquivo(862);
            l2.getAutor().setNomeAutor("Tennebie Jubjub");
            l2.getAutor().setEmailAutor("Tenneb@TNT.com");
            l2.getAutor().setCpf("729.951.753-99");
            
            
            
            
            
            
            l1.mostrarInformacoes();
            l2.mostrarInformacoes();
            
            l1.alterarValor(0.2);
            l1.mostrarInformacoes();
            
            l2.alterarValor(0.5);
            l2.mostrarInformacoes();
            
            l3.mostrarInformacoes();
	}
}
