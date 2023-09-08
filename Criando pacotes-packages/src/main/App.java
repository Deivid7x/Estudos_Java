package main;

import testando.MinhaClasse;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MinhaClasse classe = new MinhaClasse();

        System.out.println(classe.numero1); // aqui eu não tenho acesso ao atributo numero1 pois a classe MinhaClasse está em outro package. para acessar o parametro de uma classe que está em outro package, eu dentro que declarar esse parametro como publico (public) dentro da classe original
    }
}
