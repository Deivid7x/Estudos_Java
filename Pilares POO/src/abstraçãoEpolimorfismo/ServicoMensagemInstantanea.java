package abstraçãoEpolimorfismo;

// Uma classe abstrata pode conter métodos abstratos que exigem que os filhos implementem suas lógicas
public abstract class ServicoMensagemInstantanea {
	
    //Métodos que todos os filhos deverão implementar. Note que os métodos abstratos não possuem corpo na sua classe de origem. O corpo e a lógica dentro de um método abstrato deve ser implementado dentro da classe filho
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	
	//somente os filhos tem acesso a este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}