package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import dao.AlunoDAO;
import entidades.Aluno;

public class JDBCAlunoDAO implements AlunoDAO {
	Connection c = Conexao.getInstance();
	PreparedStatement ps;

	public void cadastrar(Aluno a) {
		try {
			c.createStatement();
			ps = c.prepareStatement("INSERT INTO Aluno (nome,matricula,anoIngresso,semestreIngresso) values (?,?,?,?);");
			ps.setString(1, a.getNome());
			ps.setInt(2, a.getMatricula());
			ps.setInt(3, a.getAnoIngresso());
			ps.setInt(4, a.getSemestreIngresso());
			ps.execute();
			System.out.println("Cadastrado com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removerPorMatricula(int matricula) {
		try {
			c.createStatement();
			ps = c.prepareStatement("REMOVE FROM Aluno where matricula = ?;");
			ps.execute();
			System.out.println("Removido com Sucesso! Confira o Banco de Dados!");
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
			ps = c.prepareStatement("SELECT * FROM Aluno;");
			ps.execute();
			System.out.println("Listado com sucesso com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
