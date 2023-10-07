package testando.springteste2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Note que para utilizar o a classe calculadora usando o spring, ao invés de instanciar um objeto, iremos tratar a classe calculadora como um componente, usando o @Component tanto na classe calculadora quanto na classe que irá usar a calculadora, nesse caso o MyApp. 


@Component
public class MyApp implements CommandLineRunner{
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: " + calculadora.somar(2,7));
    }
    
}
