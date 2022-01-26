package poo.model;

import java.util.ArrayList;
import java.util.List;

// La Heren�a de Cliente dentro de Persona queda as�:
public class Cliente extends Persona{
	// llevar esto para la clase Persona para demostrar la Heren�a
	/*public Integer codigo; // es el ID de mi cliente
	public String nombre; 
	public String cpf; // String porque puede comenzar con 0 etc etc
	*/

	public String numTarjeta; // Esto est� en la Herencia para demostrar el ejemplo
	private List<Endereco> direcciones;
	// Aqu� yo no consigo identificar Cu�l es el Tipo
	// de mi Direcci�n-Endere�o (particular, trabajo, etc)
	// por lo que voy a agregar un "tipoDireccion" en la 
	//clase Endereco para que esa clasificaci�n est�
	// PRESENTE
	
	
	// Introdu��o a orienta��o a objetos com Java
	// Video 6 - Imokementando encapsulamento na classe
	
	// vamos a hacer un Setter
	
	/*public void setDirecciones(List<Endereco> direcciones) {
		this.direcciones = direcciones;
	}*/
	
	public void AdicionarDireccion(Endereco dir) {
		if (dir == null) {
			throw new NullPointerException("Estamos todos locos y vac�os");
		}
		
		if(dir.codpostal == null) {
			throw new NullPointerException("CEP est� vac�o");
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
