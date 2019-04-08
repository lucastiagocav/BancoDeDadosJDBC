package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import dao.ProjetoDAO;
import entidades.Projeto;

public class JDBCProjetoDAO implements ProjetoDAO {
	Connection c = Conexao.getInstance();
	PreparedStatement ps;
	
	public void cadastrar(Projeto projeto) {
		try {
			c.createStatement();
			ps = c.prepareStatement("INSERT INTO Projeto (responsavelProjeto,dataInicioProjeto, dataConclusaoProjeto, areaRelacionada, tituloProjeto, descricaoProjeto, equipe, tecnologia, link) values (?,?,?,?,?,?,?,?,?);");
			ps.setObject(1, projeto.getResponsavelProjeto());
			ps.setString(2, projeto.getDataInicioProjeto());
			ps.setString(3, projeto.getDataConclusaoProjeto());
			ps.setString(4, projeto.getAreaRelacionada());
			ps.setNString(5, projeto.getDescricaoProjeto());
			ps.setObject(6, projeto.getEquipe());
			ps.setObject(7, projeto.getTecnologias());
			ps.setObject(8, projeto.getLinks());
			ps.execute();
			System.out.println("Cadastrado com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void removerProjetoPorTitulo(String titulo) {
		try {
			c.createStatement();
			ps = c.prepareStatement("REMOVE FROM Projeto where titulo = ? ;");
			ps.execute();
			System.out.println("Removido com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void listarTodosProjetos() {
		try {
			c.createStatement();
			ps = c.prepareStatement("SELECT * FROM Projeto;");
			ps.execute();
			System.out.println("Listado com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
