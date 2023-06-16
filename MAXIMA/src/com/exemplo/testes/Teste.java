package com.exemplo.testes;

import java.util.List;

import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {
		
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		
		Cliente cliente = new Cliente();
		cliente.setNome("");
		cliente.setIdade(0);
		
	}

}

// andrade/adriano caso queiram testar o código segue abaixo

//para remover do banco de dados
//		Cliente cliente = repositorioCliente.obterPorId(id do cliente);
//		repositorioCliente.remover(cliente);

//para atualizar
//		Cliente cliente = repositorioCliente.obterPorId(6);
//		cliente.setNome("andrade");
//		repositorioCliente.salvar(cliente);

