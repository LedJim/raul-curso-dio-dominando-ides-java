package poo.model;

public class Persona {
	
	private static final int tama�oCPF = 11;
	private static final int tama�oCNPJ = 14;
	
	
	public enum ClasificacionPersona {FISICA, JURIDICA}
	
	public Integer codigo; // es el ID de mi persona/cliente
	public String nombre; 
	private String documento; //estaba PUBLIC pero lo vamos a colocar Private para ver la clase de Polimorfismo
	public ClasificacionPersona tipo;
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		if(documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento no puede ser Nulo o Vac�o");
		}
		
		if(documento.length() == tama�oCPF) {
			tipo = ClasificacionPersona.FISICA;
		}else if(documento.length() == tama�oCNPJ) {
			tipo = ClasificacionPersona.JURIDICA;
		}else {
			throw new RuntimeException("Documento inv�lido en Brasil");
		}
		
	}
	
	public void setDocumento(String documento, ClasificacionPersona tipo) {
		this.documento = documento; // adiciona UN DOCUMENTO
		this.tipo = tipo;
		
	}
}
