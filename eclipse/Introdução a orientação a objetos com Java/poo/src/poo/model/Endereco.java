package poo.model;

public class Endereco {
	
	public enum TipoDireccion {
		RESIDENCIAL, 
		COMERCIAL, 
		TRABAJO}
	
	public String direccion;
	public String numero;
	public String complemento;
	public String barrio;
	public String ciudad;
	public String estado;
	public String codpostal;
	public TipoDireccion tipoD;

}
