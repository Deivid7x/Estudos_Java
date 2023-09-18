package interfaces;

// A principal diferença de uma interface para uma classe, é que a classe que implementar uma interface, poderá também implementar outras interfaces ao mesmo tempo, criando assim uma "herança multipla". 

// Para isso, ao invés de ser uma classe, devemos declara-la como uma interface como vemos abaixo.Para herdar os métodos e caracteristicas dessa interface devemos usar a palavra "implements" (cheque o arquivo MultiFuncional)

public interface Impressora {
    // Uma interface funciona de forma parecida com uma classe abstract. Abaixo temos um método obrigatório que todos os filhos dessa classe devem implementar. Lembre-se de que deve ser uma classe sem corpo, sua lógica deve ser implementada na classe filho
    public void imprimir();
}
