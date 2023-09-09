package pacote1;

public class ClasseBase {
    // aqui criarei exemplos dos tipos possiveis de visualização no java

    // defaut
    // O método defaut (sem nenhuma palavra antes do void) indica que esse método pode ser acessado apenas por classes que estejam nesse mesmo package
    void metodo1() {
        System.out.println("defaut");
    }

    // public
    // usando a palavra public, esse método estará disponivel em qualquer package do projeto
    public void metodo2() {
        System.out.println("public");
    }

    // Private
    // o modo privado indica que esse metodo só podera ser usado dentro dessa classe
    private void metodo3() {
        System.out.println("private");
    }
}
