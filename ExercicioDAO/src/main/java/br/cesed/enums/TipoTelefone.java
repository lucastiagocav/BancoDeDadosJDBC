package br.cesed.enums;

public enum TipoTelefone {
	FIXO("fixo"), CELULAR("celular");

	public String tipoTel;

	TipoTelefone(String tipo) {
		tipoTel = tipo;
	}
}
