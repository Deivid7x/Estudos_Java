package testando.springTeste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApplication.class, args);
		System.out.println("Olá, está funcionando?");
	}

}
