package encapsulamento;
/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		// abrindo MSN Messenger // criando uma nova instancia da classe MSNMessenger
		MSNMessenger msn = new MSNMessenger();

		// usando os métodos da classe MSN Messenger
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}