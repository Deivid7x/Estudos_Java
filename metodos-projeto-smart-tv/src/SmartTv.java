public class SmartTv {

    boolean ligada = false;
    int volume = 25;
    int canal = 5;

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
