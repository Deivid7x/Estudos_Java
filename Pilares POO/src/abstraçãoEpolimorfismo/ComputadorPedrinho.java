package abstraçãoEpolimorfismo;

// A abstração é simplificar a representação de objetos através de código e definir quais os métodos são obrigatórios para as classes filhas da classe abstrata

// O polimorfismo é o ato de usar um mesmo comando (método/função) e obter resultados diferentes dependendo da instancia que estamos trabalhando. 

// Nos final dos exemplos abaixo, veremos que o mesmo comando "enviarMensagem()" e "receberMensagem();" exibem resultados diferentes dependendo de qual classe estamos instanciando.

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;

		
		// Note que o código abaixo está errado pois uma classe abstrata NÃO PODE criar um objeto SEM usar uma das classes filhas na sua declaração.
		ServicoMensagemInstantanea testando = new ServicoMensagemInstantanea() {
			
		};

		// A forma correta seria uma das seguintes:

		// Novo objeto MSNMessenger do tipo ServicoMensagemInstantanea
		ServicoMensagemInstantanea msn = new MSNMessenger();

		// Novo objeto FacebookMessenger do tipo ServicoMensagemInstantanea
		ServicoMensagemInstantanea face = new FacebookMessenger();

		// Novo objeto Telegram do tipo ServicoMensagemInstantanea
		ServicoMensagemInstantanea teleg = new Telegram();
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
