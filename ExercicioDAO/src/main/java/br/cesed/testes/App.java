package br.cesed.testes;

import br.cesed.entidades.Pessoa;
import br.cesed.jdbc.JDBCPessoaDAO;

public class App {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setCpf("84433362515");
		p.setNome("Vera Medeiros");
		JDBCPessoaDAO jdbc = new JDBCPessoaDAO();
		jdbc.cadastrar(p);
	}

}
