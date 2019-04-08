package br.cesed.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cesed.connection.Conexao;
import br.cesed.dao.EnderecoDAO;
import br.cesed.entidades.Endereco;
public class JDBCEnderecoDAO implements EnderecoDAO {
	Connection c = Conexao.getInstance();
	PreparedStatement ps;

	public void cadastrar(Endereco end) {
		try {
			c.createStatement();
			ps = c.prepareStatement("INSERT INTO Endereco(rua,numero,bairro,cidade,estado) values (?,?,?,?,?);");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	public void excluirPorChaveEstrangeira(int busca) {
		try {
			c.createStatement();
			ps = c.prepareStatement("REMOVE FROM Telefone where id = ?;");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	public void listarTodos() {
		try {
			c.createStatement();
			ps = c.prepareStatement("SELECT * FROM Endereco;");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

}
