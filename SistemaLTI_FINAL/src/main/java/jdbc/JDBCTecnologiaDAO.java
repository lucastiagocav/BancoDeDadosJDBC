package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import dao.TecnologiaDAO;
import entidades.Tecnologia;

public class JDBCTecnologiaDAO implements TecnologiaDAO{
	Connection c = Conexao.getInstance();
	PreparedStatement ps;
	public void cadastrar(Tecnologia t) {
		try {
			c.createStatement();
			ps = c.prepareStatement("INSERT INTO Tecnologia (nome, tipo, link) values (?,?,?);");
			ps.setString(1, t.getNome());
			ps.setString(2, t.getTipo());
			ps.setObject(3, t.getLink());
			ps.execute();
			System.out.println("Cadastrado com Sucesso! Confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removerPorNome(String nome) {
		try {
			c.createStatement();
			ps = c.prepareStatement("REMOVE FROM Tecnologia where nome = ?");
			ps.execute();
			System.out.println("Removido com sucesso, confira o Banco de Dados!");
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void listarTodasAsTecnologias() {
		try {
			c.createStatement();
			ps = c.prepareStatement("SELECT * FROM Tecnologia");
			System.out.println("Listado com Sucesso, confira o Banco de Dados! ");
			ps.execute();
			ps.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
