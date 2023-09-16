package abstraçãoEpolimorfismo;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	// As classes a seguir são as mesmas classes abstratas criadas na classe pai, porém, aqui elas estão com suas respectivas lógicas dentro dos seus blocos de código.
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}