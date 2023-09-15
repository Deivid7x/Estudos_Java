package Herança;

// O pilar da HERANÇA diz respeito a classes que são criadas "herdando" caracteristicas e métodos da sua classe pai. Dessa forma, você não precisa reescrever códigos. 

// A classe desse arquivo será a classe pai nesse exemplo. Para ver como outras classes herdam (extends) dessa classe, cheque as classes FacebookMessenger, MSNMessenger e Telegram

public class ServicoMensagemInstantanea {
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
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
