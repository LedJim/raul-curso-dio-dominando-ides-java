package desafio_dio_banco;

public class CuentaCorriente extends Conta{
	

	public CuentaCorriente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtracto() {
		System.out.println("==== Extracto de la Cuenta Corriente ====");
		super.imprimirInformacionesComunes();
		
	}

	

}
