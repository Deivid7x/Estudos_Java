package interfaces;

public class Fabrica {
    public static void main(String[] args) {

        // Ao criarmos uma instancia com o tipo Multifuncional, temos acesso a todos os métodos dentro da classe Multifuncional
        MultiFuncional multi = new MultiFuncional();

        multi.digitalizar();
        multi.scannear();
        multi.imprimir();

        // Por outro lado, ao instanciarmos com um dos tipos das interfaces, o novo objeto só terá acesso aos métodos que estão descritos na interface

        Scanner multi2 = new MultiFuncional();

        // A Ação seguir funciona pois o método scannear está dentro da interface Scanner
        multi2.scannear();
        // Ad ações a seguir não funcionam pois o método imprimir/digitalizar não estão dentro da interface Scanner
        multi2.imprimir();
        multi2.digitalizar();
    }
}
