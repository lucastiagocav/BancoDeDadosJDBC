package br.cesed.dao;

import br.cesed.entidades.Telefone;

public interface TelefoneDAO {
	void cadastrar(Telefone t);
	void removerPorChaveEstrangeira(int busca);
	void listarTodos();
}
