public class Usuário {
    // Sempre crie um metodo main. o public significa que esse metodo podera ser usado por todas as partes do seu projeto, e void significa que esse metodo não retornará nada

    public static void main(String[] args) {
        // Instanciando uma classe:

        // "tipo"(que no caso é o nome da classe) + nome para o objeto = new + nome da classe
        SmartTv minhSmartTv = new SmartTv();

        System.out.println("Minha TV está ligada? " + minhSmartTv.ligada);
        System.out.println("O volume da minha TV está em: " + minhSmartTv.volume);


        // Depois de criar uma instancia de uma classe, você poderá acessar os módulos dela, assim:
        minhSmartTv.ligar();

        System.out.println("Agora minha TV está ligada? " + minhSmartTv.ligada);

        minhSmartTv.aumentarVolume();
        minhSmartTv.aumentarVolume();
        minhSmartTv.diminuirVolume();

        System.out.println("Vomule da minha TV: " + minhSmartTv.volume);

        System.out.println("A TV está no canal: " + minhSmartTv.canal);

        minhSmartTv.mudarCanal(4);

        System.out.println("Agora a TV está no canal: " + minhSmartTv.canal);

    }

}
