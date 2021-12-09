package br.com.dio.model;

import java.util.Objects;

public class Gato {
	// declaro las variables
	private String nome;
	private String cor;
	private Integer idade;
	//inicializo las variables
	public Gato() { // testando unas cositas para mí
		nome = "Raúl Rojas";
		cor = "verde celeste";
		idade = 29;
		}
	//defino la función y sus parámetros
	//le paso los valores introducidos a las variables creadas
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	//Get&Set - nome
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Get&Set - cor
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	//Get&Set - idade
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
	
	
	
	/*public Gato (String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade;
		
	}*/

}
