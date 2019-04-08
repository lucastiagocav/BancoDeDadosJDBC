package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import dao.ProfessorDAO;
import entidades.Professor;

public class JDBCProfessorDAO implements ProfessorDAO {
	Connection c = Conexao.getInstance();
	PreparedStatement ps;
	public void cadastrar(Professor p) {
		try {
			c.createStatement();
			ps = c.prepareStatement("INSERT INTO Professor (nome,matricula) values (?,?);");
			ps.setString(1, p.getNome());
			ps.setInt(2, p.getMatricula());
			ps.execute();
			System.out.println("Cadastrado com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void removerPorId(int id) {
		try {
			c.createStatement();
			ps = c.prepareStatement("REMOVER FROM Professor WHERE matricula = ?;");
			ps.execute();
			System.out.println("Cadastrado com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void listarTodos() {
		try {
			c.createStatement();
			ps = c.prepareStatement("SELECT * FROM Professor;");
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
