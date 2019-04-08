package br.cesed.dao;

import br.cesed.entidades.Pessoa;

public interface PessoaDAO {
	void cadastrar(Pessoa p);
	void excluirPorId(int id);
	void buscarTodos();
	void buscarPorId(int id);
}
