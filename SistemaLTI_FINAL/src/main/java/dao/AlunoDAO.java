package dao;

import entidades.Aluno;

public interface AlunoDAO {
	void cadastrar(Aluno a);
	void removerPorMatricula(int matricula);
	void listarTodos();
	
}
