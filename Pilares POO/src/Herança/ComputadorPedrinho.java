package Herança;

public class ComputadorPedrinho {
	public static void main(String[] args) {

		// Criando uma instancia da classe MSNMessenger
		MSNMessenger msn = new MSNMessenger();

		// Como a classe MSNMessenger extends (herda) da classe ServicoMensagemInstantanea, podemos usar os métodos presentes dentro da classe ServicoMensagemInstantanea
		msn.enviarMensagem();
		msn.receberMensagem();
		
		
		// Criando uma instancia da classe FacebookMessenger
		FacebookMessenger fbm = new FacebookMessenger();

		// Como a classe FacebookMessenger extends (herda) da classe ServicoMensagemInstantanea, podemos usar os métodos presentes dentro da classe ServicoMensagemInstantanea
		fbm.enviarMensagem();
		fbm.receberMensagem();


		// Criando uma instancia da classe Telegram
		Telegram tlg = new Telegram();

		// Como a classe Telegram extends (herda) da classe ServicoMensagemInstantanea, podemos usar os métodos presentes dentro da classe ServicoMensagemInstantanea
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
