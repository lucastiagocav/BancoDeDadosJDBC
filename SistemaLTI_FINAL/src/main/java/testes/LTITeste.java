package testes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import entidades.Aluno;
import entidades.LTI;
import entidades.Link;
import entidades.Professor;
import entidades.Projeto;
import entidades.Tecnologia;
import entidades.TipoBuscaEnum;
import excecoes.BuscaInvalidaException;

public class LTITeste {

	private LTI lti;
	private Projeto projeto;
	private Aluno aluno;
	private Professor professor;
	
	
	@Before
	public void CriaLTI(){
		this.lti = new LTI();
	}
	
	@Before
	public void criaAlunoElegivel(){
		this.aluno = new Aluno();
		this.aluno.setAnoIngresso(2014);
		this.aluno.setSemestreIngresso(2);
	}
	
	@Before
	public void criaProjeto(){
		this.projeto = new Projeto();
	}
	
	@Before 
	public void criaProfessor(){
		this.professor = new Professor();
		professor.setNome("Jemão");
		
	}
	@Test
	public void cadastrarProjetoTest(){
		lti.cadastrarProjeto(projeto);
		assertEquals(1, lti.getProjetos().size());
	}
	
	@Test
	public void cadastrarResponsavelProjetoTest(){
		projeto.setResponsavelProjeto(professor);
		lti.cadastrarProjeto(projeto);
		Professor responsavel = new Professor();
		responsavel.setNome("Adriano");
		lti.cadastrarResponsavelProjeto(responsavel);
		String nomeProfessorResponsaval = lti.cadastrarResponsavelProjeto(responsavel).getResponsavelProjeto().getNome();
		assertEquals("Adriano", nomeProfessorResponsaval);

	}
	
	@Test
	public void cadastrarEquipeProjetoTest(){
		lti.cadastrarEquipeProjeto(aluno, projeto);
		assertEquals(1, projeto.getEquipe().size());
	}
	
	@Test
	public void cadastrarTecnologiaTest(){
		Tecnologia tecnologia = new Tecnologia();
		lti.cadastrarTecnologia(tecnologia, projeto);
		assertEquals(1, projeto.getTecnologias().size());
	}
	
	@Test
	public void cadastrarLinkTest(){
		Link link = new Link();
		lti.cadastrarLink(link, projeto);
		assertEquals(1, projeto.getLinks().size());
	}
	
	@Test(expected=BuscaInvalidaException.class)
	public void buscaProjetoResponsavelTest() throws BuscaInvalidaException{
		projeto.setResponsavelProjeto(professor);
		lti.cadastrarProjeto(projeto);
		lti.gerenciadorBuscaProjeto("Adriano", TipoBuscaEnum.NOME_RESPONSAVEL);
	}
	
	@Test
	public void buscaEquipeProjetoTest() throws BuscaInvalidaException{
		lti.cadastrarEquipeProjeto(aluno, projeto);
		lti.cadastrarProjeto(projeto);
		lti.buscaEquipeProjeto(projeto);
		assertEquals(1, projeto.getEquipe().size());
		
	}
	
	@Test
	public void buscaParticipacaoProjetoAlunoTest() throws BuscaInvalidaException{
		lti.cadastrarEquipeProjeto(aluno, projeto);
		lti.cadastrarProjeto(projeto);
		assertEquals(1, lti.buscaParticipacaoProjetoAluno(aluno).size());
	}
}


