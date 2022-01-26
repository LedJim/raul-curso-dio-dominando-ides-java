package poo;

import java.util.ArrayList;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaTarjeta {
	public static void main(String[] args) {
		
		Endereco direx = new Endereco();
		direx.codpostal = "85812002";
		Cliente client = new Cliente();
		client.numTarjeta = "2000000000";
		//client.AdicionarDireccion(direx); ya está en el Try & Catch
	//vamos a trabajar la parte de la Herencia aqui
		
	/*	
		if(client.direcciones == null) {
			client.direcciones = new ArrayList<Endereco>();
		}*/
		
		try {
			client.AdicionarDireccion(direx); 
			System.out.println("Colocamos el primer Objeto (direx) en la Lista");
		}catch(Exception e){
			System.err.println("Hubo un Error al Adicionar la Dirección: " + e.getMessage());
		}
		
		// client.direcciones.add(direx);
		//client.getDirecciones().add(direx);
	
		
	}
	


}
