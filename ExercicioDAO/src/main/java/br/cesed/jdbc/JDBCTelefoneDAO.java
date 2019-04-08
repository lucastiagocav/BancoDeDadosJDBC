package br.cesed.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cesed.connection.Conexao;
import br.cesed.dao.TelefoneDAO;
import br.cesed.entidades.Telefone;

public class JDBCTelefoneDAO implements TelefoneDAO{
	Connection c = Conexao.getInstance();
	PreparedStatement ps;
	
	public void cadastrar(Telefone t) {
		try {
			c.createStatement();
			ps = c.prepareStatement("INSERT INTO Telefone (numero, tipo) values (?,?) ;");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	public void removerPorChaveEstrangeira(int busca) {
		try {
			c.createStatement();
			ps = c.prepareStatement("REMOVE FROM Telefone where id = ? ;");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	public void listarTodos() {
		try {
			c.createStatement();
			ps = c.prepareStatement("SELECT * FROM Telefone;");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
}
