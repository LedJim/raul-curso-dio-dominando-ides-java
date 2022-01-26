package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
	
	public static void main(String[] args) {
		
		Endereco enderecoEntrega = new Endereco();
		// dados do endereço
		
		Cliente clienteEntrega = new Cliente();
		// dados do cliente
		
		clienteEntrega.direcciones.add(enderecoEntrega);
		
		// Esto da error y es lo que estaba siendo explicado en el
		// Word
		
		clienteEntrega.AdicionarDireccion(enderecoEntrega);
		System.out.println("Colocamos el primer Objeto (direx) en la Lista");
		
	}

}
