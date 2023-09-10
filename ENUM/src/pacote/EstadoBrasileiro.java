package pacote;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	// Abaixo temos os enums que funcionam como objetos, podendo, por exemplo, ter funções dentro deles.

	// Os enums são opções pré definidas de objetos que poderão ser usadas em outras partes da sua aplicação. O enum desse exemplo, poderia ser usado em um sistema de cadastro onde pede qual o estado da pessoa sendo cadastrada. poderiamos passar então esse enum com um dos valores abaixo (veja em SistemaIbge nesse mesmo package alguns exemplos)
	SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;
	
	private String sigla;
	private String nome;


	// Aqui definimos esse construtor como privado, pois a idéia não é permitir a criação de um objeto a partir da classe EstadoBrasileiro, e sim apenas usarmos os enums de dentro dela
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}


