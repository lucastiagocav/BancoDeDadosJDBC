package entidades;

public enum TipoBuscaEnum {
	
	NOME_RESPONSAVEL(1), DATA_INICIO_PROJETO(2), TITULO_PROJETO(3);
	
	private final int valor;
	
	TipoBuscaEnum(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}

}
