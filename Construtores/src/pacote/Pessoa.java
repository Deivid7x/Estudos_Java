package pacote;

public class Pessoa {
    private String nome;
    private String sobrenome;

    // Construtor - Construtores são métodos criados com o mesmo nome da classe, para que torne obrigatoria a declaração de alguns valores ao se instanciar essa classe.
    
    // No exemplo a baixo, estamos colocando nome e sobrenome como parametros obrigatórios quando o usuarios for criar uma nova instancia da classe pessoa. 
    
    // Você não precisar passar todos os atributos dentro dos construtores, apenas aqueles que forem realmente necessarios para a criação desse objeto.
    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Pegar nome
    public String getNome() {
        return nome;
    }

    // Pegar sobrenome
    public String getSobrenome() {
        return sobrenome;
    }

    // Mudar o nome pré definido
    public void setNome(String nome) {
        this.nome = nome;
    }
}
