package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import excecoes.BuscaInvalidaException;

public class LTI {

	private List<Projeto> projetos = new ArrayList<Projeto>();
	private Calendar calendar = Calendar.getInstance();

	public void cadastrarProjeto(Projeto projeto) {
		this.projetos.add(projeto);
	}

	public Projeto cadastrarResponsavelProjeto(Professor responsavel) {
		Projeto projeto = new Projeto();
		if (verificaElegibilidadeResponsavel(responsavel)) {
			projeto.setResponsavelProjeto(responsavel);
		}
		return projeto;
	}

	private boolean verificaElegibilidadeResponsavel(Professor responsavel) {
		boolean responsavelElegivel = false;
		for (Projeto projeto : projetos) {
			if (!projeto.getResponsavelProjeto().equals(responsavel)) {
				responsavelElegivel = true;
			}
		}
		return responsavelElegivel;
	}

	public void cadastrarEquipeProjeto(Aluno aluno, Projeto projeto) {
		if (verificaElegibilidadeAluno(aluno)) {
			projeto.getEquipe().add(aluno);
		}
	}

	public void cadastrarTecnologia(Tecnologia tecnologia, Projeto projeto) {
		projeto.getTecnologias().add(tecnologia);
	}

	public void cadastrarLink(Link link, Projeto projeto) {
		projeto.getLinks().add(link);
	}

	private boolean verificaElegibilidadeAluno(Aluno aluno) {
		boolean alunoElegivel = false;
		int anoReferencia = getAnoReferencia();
		int semestreReferencia = getSemestreReferencia();
		if ((aluno.getAnoIngresso() == anoReferencia) && (aluno.getSemestreIngresso() == semestreReferencia)) {
			alunoElegivel = true;
		}
		return alunoElegivel;
	}
	
	private int getAnoReferencia(){
		int year = calendar.get(Calendar.YEAR);
		int anoReferencia = (year - 2);
		return anoReferencia;
	}
	
	private int getSemestreReferencia(){
		int month = calendar.get(Calendar.MONTH) + 1;
		if (month > 6){
			return 1;
		}
		return 2;
	}
	
	public Projeto gerenciadorBuscaProjeto(String argumentoBusca, TipoBuscaEnum tipoBusca) throws BuscaInvalidaException {
		if (tipoBusca == TipoBuscaEnum.NOME_RESPONSAVEL){
			return buscaProjetoResponsavel(argumentoBusca);
		}
		if (tipoBusca == TipoBuscaEnum.DATA_INICIO_PROJETO){
			return buscaProjetoData(argumentoBusca);
		}
		if (tipoBusca == TipoBuscaEnum.TITULO_PROJETO){
			return buscaProjetoTitulo(argumentoBusca);
		}
		return null;	
	}

	private Projeto buscaProjetoResponsavel(String argumentoBusca) throws BuscaInvalidaException {
		Projeto projetoRetorno = new Projeto();
		for (Projeto projeto : projetos) {
			String nomeResponsavel = projeto.getResponsavelProjeto().getNome();
			if (nomeResponsavel.equalsIgnoreCase(argumentoBusca)) {
				projetoRetorno = projeto;
			} else {
				throw new BuscaInvalidaException("Não foram encontrados Resultados para os parâmetros informados.");
			}
		}
		return projetoRetorno;
	}

	private Projeto buscaProjetoData(String argumentoBusca) throws BuscaInvalidaException {
		Projeto projetoRetorno = new Projeto();
		for (Projeto projeto : projetos) {
			String dataInicioProjeto = projeto.getDataInicioProjeto();
			if (dataInicioProjeto.equalsIgnoreCase(argumentoBusca)) {
				projetoRetorno = projeto;
			} else {
				throw new BuscaInvalidaException("Não foram encontrados Resultados para os parâmetros informados.");
			}
		}
		return projetoRetorno;
	}

	private Projeto buscaProjetoTitulo(String argumentoBusca) throws BuscaInvalidaException {
		Projeto projetoRetorno = new Projeto();
		for (Projeto projeto : projetos) {
			String tituloProjeto = projeto.getTituloProjeto();
			if (tituloProjeto.equalsIgnoreCase(argumentoBusca)) {
				projetoRetorno = projeto;
			} else {
				throw new BuscaInvalidaException("Não foram encontrados Resultados para os parâmetros informados.");
			}
		}
		return projetoRetorno;
	}

	public List<Aluno> buscaEquipeProjeto(Projeto projetoPesquisa) throws BuscaInvalidaException {
		List<Aluno> equipeRetorno = new ArrayList<Aluno>();
		for (Projeto projeto : projetos) {
			if (projeto.equals(projetoPesquisa)) {
				equipeRetorno = projeto.getEquipe();
			} else {
				throw new BuscaInvalidaException("Não foram encontrados Resultados para os parâmetros informados.");
			}
		}
		return equipeRetorno;
	}

	public List<Projeto> buscaParticipacaoProjetoAluno(Aluno aluno) throws BuscaInvalidaException {
		List<Projeto> projetosRetorno = new ArrayList<Projeto>();
		for (Projeto projeto : projetos) {
			for (int i = 0; i < projeto.getEquipe().size(); i++) {
				if (projeto.getEquipe().get(i).equals(aluno)){
					projetosRetorno.add(projeto);
				}else{
					throw new BuscaInvalidaException("Não foram encontrados Resultados para os parâmetros informados.");
				}
			}
		}
		return projetosRetorno;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

}
