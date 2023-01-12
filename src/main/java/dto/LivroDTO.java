package dto;

public class LivroDTO {
    int id;
    public String nome;
    public String genero;

    public LivroDTO(int id, String nome, String genero){
        this.id = id;
        this.nome = nome;
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

    
}
