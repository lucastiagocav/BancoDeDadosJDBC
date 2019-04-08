package dao;

import java.util.List;

import entidades.Aluno;
import entidades.Link;
import entidades.Professor;
import entidades.Projeto;
import entidades.Tecnologia;
import entidades.TipoBuscaEnum;
import excecoes.BuscaInvalidaException;

public interface LTIDAO {
	void cadastrarProjeto(Projeto projeto);

	Projeto cadastrarResponsavelProjeto(Professor responsavel);

	boolean verificaElegibilidadeResponsavel(Professor responsavel);

	void cadastrarEquipeProjeto(Aluno aluno, Projeto projeto);

	void cadastrarTecnologia(Tecnologia tecnologia, Projeto projeto);

	void cadastrarLink(Link link, Projeto projeto);

	boolean verificaElegibilidadeAluno(Aluno aluno);

	Projeto gerenciadorBuscaProjeto(String argumentoBusca, TipoBuscaEnum tipoBusca) throws BuscaInvalidaException;

	Projeto buscaProjetoResponsavel(String argumentoBusca) throws BuscaInvalidaException;

	Projeto buscaProjetoData(String argumentoBusca) throws BuscaInvalidaException;

	Projeto buscaProjetoTitulo(String argumentoBusca) throws BuscaInvalidaException;

	List<Aluno> buscaEquipeProjeto(Projeto projetoPesquisa) throws BuscaInvalidaException;

	List<Projeto> buscaParticipacaoProjetoAluno(Aluno aluno) throws BuscaInvalidaException;

}
