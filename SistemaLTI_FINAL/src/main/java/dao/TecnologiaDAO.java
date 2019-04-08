package dao;

import entidades.Tecnologia;

public interface TecnologiaDAO {
	void cadastrar(Tecnologia t);
	void removerPorNome(String nome);
	void listarTodasAsTecnologias();
	

}
