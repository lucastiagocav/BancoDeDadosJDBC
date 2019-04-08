package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection getInstance;
	//Singleton
	private Conexao() {
		
	}
	
	public static Connection getInstance() {
		if(getInstance == null) {
			try {
				Class.forName("org.postgresql.Driver");
				getInstance = DriverManager.getConnection("jdbc:postgresql://localhost/ltibd","postgres","111206");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return getInstance;
	}

}
