package desafio_dio_banco;

import java.util.List;

public class Banco {
	
	private String nome;
	// una composição
	private List<Conta> cuentas; // un banco es "compuesto por una Lista de Banco"
	// estructura
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Conta> cuentas) {
		this.cuentas = cuentas;
	}

	
}
