package br.com.totvs.juridico;
import dto.LivroDTO;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinTask;

public class LivrariaApplication {
    
    ArrayList<LivroDTO> listLivros = new ArrayList<LivroDTO>();
    public static void main(String[] args) {
        new LivrariaApplication();
    }
  
    public LivrariaApplication() {
        this.initLivros();
        this.criarUmNovoLivro("Arquitetura Limpa", "Tecnologia");
        this.criarUmNovoLivro("Harry Potter e a Camara secreta", "Fantasia");
        this.criarUmNovoLivro("WildCards", "Esportes");
        this.criarUmNovoLivro("O Trono do Sol", "Fantasia");
    }

    public void initLivros() {
        
        this.listLivros.add(new LivroDTO(0, "Código Limpo", "Tecnologia") );
        this.listLivros.add(new LivroDTO(1, "Senhor do Anéis", "Fantasia"));
        this.listLivros.add(new LivroDTO(2, "WildCards", "Fantasia"));
        this.listLivros.add(new LivroDTO(3, "Harry Potter e o Prisioneiro de Azkaban", "Fantasia"));
        this.listLivros.add(new LivroDTO(4, "Javascript de alto desempenho", "Tecnologia"));
        this.listLivros.add(new LivroDTO(5, "O poder da ação", "Administração"));
    }

    LivroDTO livroDTO = new LivroDTO();

    public void criarUmNovoLivro(String nome, String genero){
        
        for(int index = 0; index < this.listLivros.size();) {
            
        if (buscarLivro(nome, genero) == 0) {
            LivroDTO novoLivro = new LivroDTO(this.listLivros.size(), nome, genero);
            
            this.listLivros.add(novoLivro);
            System.out.println(novoLivro.equals(genero));
        } else {
            
                
            

        }
    }
}

    public int buscarLivro(String nomeLivro, String genero) {

        int indiceLivro = -1;
        for(int i = -1; i < this.listLivros.size(); i++); {
            livroDTO.id
        }

        //tentei fazer uma comparação de string para compara nome e genero
        
        return indiceLivro;
    }


    public String listarLivrosFantasia() {
        String livrosDeFantasia;
        return listarLivrosFantasia();
        /**
         * Retorne uma String contendo todos os Livros que são de fantasia.
         */
        
    }

}
