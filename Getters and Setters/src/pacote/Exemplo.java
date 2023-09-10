package pacote;

public class Exemplo {
    // Os atributos são definidos como privados, e para ter acesso a eles usamos o metodo get, e para modifica-lo usamos o método set
    private int numero;

    // Getter - depois de criar os atributos, se você digitar get, a IDE já vai sugerir a criação do método get para você
    public int getNumero() {
        return numero;
    }

    // Setter - de forma semelhante ao get, depois de criar o atributo e digitar set, a IDE já vai sugerir a criação do método set
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    
}
