package jdbc;

import java.util.List;

import dao.LTIDAO;
import entidades.Aluno;
import entidades.Link;
import entidades.Professor;
import entidades.Projeto;
import entidades.Tecnologia;
import entidades.TipoBuscaEnum;
import excecoes.BuscaInvalidaException;

public class JDBCLTIDAO implements LTIDAO{

	public void cadastrarProjeto(Projeto projeto) {
		// TODO Auto-generated method stub
		
	}

	public Projeto cadastrarResponsavelProjeto(Professor responsavel) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verificaElegibilidadeResponsavel(Professor responsavel) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cadastrarEquipeProjeto(Aluno aluno, Projeto projeto) {
		// TODO Auto-generated method stub
		
	}

	public void cadastrarTecnologia(Tecnologia tecnologia, Projeto projeto) {
		// TODO Auto-generated method stub
		
	}

	public void cadastrarLink(Link link, Projeto projeto) {
		// TODO Auto-generated method stub
		
	}

	public boolean verificaElegibilidadeAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	public Projeto gerenciadorBuscaProjeto(String argumentoBusca, TipoBuscaEnum tipoBusca)
			throws BuscaInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto buscaProjetoResponsavel(String argumentoBusca) throws BuscaInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto buscaProjetoData(String argumentoBusca) throws BuscaInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto buscaProjetoTitulo(String argumentoBusca) throws BuscaInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Aluno> buscaEquipeProjeto(Projeto projetoPesquisa) throws BuscaInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Projeto> buscaParticipacaoProjetoAluno(Aluno aluno) throws BuscaInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

}
