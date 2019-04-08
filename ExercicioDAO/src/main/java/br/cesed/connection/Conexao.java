package br.cesed.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection getInstance;
	// Usarei o Padr�o de Projeto Singleton para cria��o de uma �nica instancia.
	private Conexao() {
		
	}
	
	public static Connection getInstance() {
		if(getInstance == null) {
			try {
				Class.forName("org.postgresql.Driver");
				getInstance = DriverManager.getConnection("jdbc:postgresql://localhost/exemplodao", "postgres", "111206");
			} catch (SQLException e) {
				System.out.println("Erro SQL " + e);
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("Erro Driver " + e);
				e.printStackTrace();
			}
		}
		
		return getInstance;
	}

}
