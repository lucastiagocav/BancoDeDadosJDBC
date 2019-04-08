package dao;

import entidades.Professor;

public interface ProfessorDAO {
	void cadastrar(Professor p);
	void removerPorId(int id);
	void listarTodos();
}
