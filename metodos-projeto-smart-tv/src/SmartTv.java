// Criando uma classe: o public indica que a classe poderá ser acessada em qualquer parte do seu código, class indicaa criação da classe, e logo depois vem o nome da classe que você quer criar (lembre de usar o padrão para nomear as classes, assim: UmaNovaClasse)
public class SmartTv {

    boolean ligada = false;
    int volume = 25;
    int canal = 5;


    // os métodos são criados com o padrão de nomes camelCase
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        // aumenta o volume em 1
        volume++;
    }

    public void diminuirVolume(){
        // diminui o volume em 1
        volume--;
    }

    public void mudarCanal(int numeroDoCanal){
        canal = numeroDoCanal;
    }
    
}
