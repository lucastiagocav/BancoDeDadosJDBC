package dao;

import entidades.Projeto;

public interface ProjetoDAO {
	
	void cadastrar(Projeto projeto);
	void removerProjetoPorTitulo(String titulo);
	void listarTodosProjetos();
}
