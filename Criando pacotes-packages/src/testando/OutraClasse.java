package testando;

public class OutraClasse {
    public static void main(String[] args) {
        MinhaClasse objetoTeste = new MinhaClasse();

        System.out.println(objetoTeste.numero1); // aqui eu consigo acessar o atributo numero1 dentro do objetoTeste pois a classe que o originou está nesse mesmo package
    }
    
}
