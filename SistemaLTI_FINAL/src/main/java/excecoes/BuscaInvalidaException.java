package excecoes;

public class BuscaInvalidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BuscaInvalidaException(String mensagem){
		super(mensagem);
	}
}
