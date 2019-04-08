package br.cesed.dao;

import br.cesed.entidades.Endereco;

public interface EnderecoDAO {
	void cadastrar(Endereco end);
	void excluirPorChaveEstrangeira(int busca);
	void listarTodos();
}
