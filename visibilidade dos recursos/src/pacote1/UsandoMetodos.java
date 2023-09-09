package pacote1;

public class UsandoMetodos {
    public static void main(String[] args) {
        ClasseBase instanciandoBase = new ClasseBase();
        // Eu consigo usar o metodo1 pois ele foi definido como defaut (sem nenhuma palavra chave), ou seja, está acessivel para outras classes no mesmo package
        instanciandoBase.metodo1();

        // Eu consigo usar o metodo2 pois ele foi definido como publico, ou seja, está disponivel para qualquer classe do nosso programa
        instanciandoBase.metodo2();

        // Eu NÃO consigo acessar o metodo3 pois ele foi definido como privado, ou seja, só pode ser acessado por sua classe base
        instanciandoBase.metodo3();
        
    }

    void teste(){
        System.out.println("teste");
    }
}
