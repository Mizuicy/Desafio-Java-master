package dto;

public class LivroDTO {
    public int id;
    public String nome;
    public String genero;

    public LivroDTO(){

    }

    public LivroDTO(int id, String nome, String genero){
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        
    } 

    public void setId(int id) {
        this.id = id;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getId(int id) {
        this.id = id;
        return id;
    }

    public String getNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getGenero(String genero) {
        this.genero = genero;
        return genero;
    }

    //método imprimir nome e genero dos livros.

    public String imprimir(){
        return "Nome" + nome + "Genero " + genero;
    }
    
}
