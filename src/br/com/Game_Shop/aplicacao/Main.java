package br.com.Game_Shop.aplicacao;

import java.util.Date; 

import br.com.Game_Shop.dao.clientesDAO;
import br.com.Game_Shop.model.Clientes;

public class Main {

	public static void main(String[] args) {
		
		clientesDAO clientesDao = new clientesDAO();
		
		Clientes clientes = new Clientes();
		clientes.setCpf("843.436.960-57");
		clientes.setNome("jao de teste");
		clientes.setEmail("bewek62956@zamaneta.com");
		clientesDao.save(clientes);
		
		
		//Atualizar o informacoes do cliente 
//		Clientes c1 = new Clientes();
//		c1.setNome("Kleber Banban");
//		c1.setEmail("733.414.780-43");
//		c1.setEmail("nokoy55033@soebing.com");
//		c1.setId(6);//Número da Chave primária
//		
//		clientesDao.update(c1);
		
		//Deletar o contato pelo ID
//		clientesDao.deleteByID(1);
//		clientesDao.deleteByID(6);
		
		//Visualização dos registros do banco de dados TODOS os registros
		for(Clientes c : clientesDao.getCliente()) {
			System.out.println("Clientes: "+c.getNome());
		}

	}

}
