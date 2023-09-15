package encapsulamento;

// Encapsulamento é o pilar que diz que sempre que possivel, devemos chamar os métodos dentro de outros métodos da classe para que o objeto final tenha que executar menos ações para atingir um objetivo. ex:

// No exemplo abaixo, chamaremos os métodos "validarConectadoInternet" e "salvarHistóricoMensagem" dentro do método enviarMensagem, assim, quando você instanciar essa classe e usar o método enviarMensagem, você estará executando 3 ações em uma unica chamada, ao invés de chamar cada um dos métodos isoladamente


public class MSNMessenger {
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		
		System.out.println("Enviando mensagem");
		
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
		
		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	// ENCAPSULAMENTO
	//métodos privados, visíveis somente na classe. Serão usados dentro de algum método publico
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}