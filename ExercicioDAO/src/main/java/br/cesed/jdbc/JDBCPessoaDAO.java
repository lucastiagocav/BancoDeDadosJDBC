package br.cesed.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cesed.connection.Conexao;
import br.cesed.dao.PessoaDAO;
import br.cesed.entidades.Pessoa;

public class JDBCPessoaDAO implements PessoaDAO{
	Connection c = Conexao.getInstance();
	PreparedStatement ps;
	
	public void cadastrar(Pessoa p) {
		try {
			c.createStatement();
			ps = c.prepareStatement("INSERT INTO Pessoa(nome,cpf) values (?,?)");
			ps.setString(1, p.getNome());
			ps.setString(2, p.getCpf());
			ps.execute();
			System.out.println("Cadastrou com sucesso! Confira no Banco de Dados!");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	public void excluirPorId(int id) {
		try {
			c.createStatement();
			ps = c.prepareStatement("REMOVE FROM Pessoa where id = ?;");
			ps.execute();
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	public void buscarTodos() {
		try {
			c.createStatement();
			ps = c.prepareStatement("SELECT * FROM Pessoa;");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

	public void buscarPorId(int id) {
		try {
			c.createStatement();
			ps = c.prepareStatement("SELECT FROM Pessoa where id = ?;");
			c.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}

}
