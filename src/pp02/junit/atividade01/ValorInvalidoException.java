package pp02.junit.atividade01;

public class ValorInvalidoException extends Exception {

	public ValorInvalidoException(float nota1) {
		super("Valor inválido: " + nota1);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
