package br.com.dio;

import br.com.dio.model.Gato; // importar clase con CTRL+SHIFT + O 

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		System.out.println("Hola Mundo de nuevo Carajo");
		int a = 20;
		int b = 9;
		int edad = a+b;
		System.out.println(edad);
		*/

		Gato gato = new Gato();
		Livros libros = new Livros();
		
		System.out.println(gato);
		System.out.println(libros);
	}

}


class Livros{
	
	private String nome;
	private Integer npag;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNpag() {
		return npag;
	}

	public void setNpag(Integer npag) {
		this.npag = npag;
	}
	
	

}