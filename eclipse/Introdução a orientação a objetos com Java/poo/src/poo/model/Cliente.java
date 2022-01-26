package poo.model;

import java.util.ArrayList;
import java.util.List;

// La Herença de Cliente dentro de Persona queda así:
public class Cliente extends Persona{
	// llevar esto para la clase Persona para demostrar la Herença
	/*public Integer codigo; // es el ID de mi cliente
	public String nombre; 
	public String cpf; // String porque puede comenzar con 0 etc etc
	*/

	public String numTarjeta; // Esto está en la Herencia para demostrar el ejemplo
	private List<Endereco> direcciones;
	// Aquí yo no consigo identificar Cuál es el Tipo
	// de mi Dirección-Endereço (particular, trabajo, etc)
	// por lo que voy a agregar un "tipoDireccion" en la 
	//clase Endereco para que esa clasificación esté
	// PRESENTE
	
	
	// Introdução a orientação a objetos com Java
	// Video 6 - Imokementando encapsulamento na classe
	
	// vamos a hacer un Setter
	
	/*public void setDirecciones(List<Endereco> direcciones) {
		this.direcciones = direcciones;
	}*/
	
	public void AdicionarDireccion(Endereco dir) {
		if (dir == null) {
			throw new NullPointerException("Estamos todos locos y vacíos");
		}
		
		if(dir.codpostal == null) {
			throw new NullPointerException("CEP está vacío");
		}
		
		getDirecciones().add(dir);
		
	}
	
	private List<Endereco> getDirecciones() {
		if(direcciones == null) {
			direcciones = new ArrayList<Endereco>();
		}
		return direcciones;
	}
	
}
