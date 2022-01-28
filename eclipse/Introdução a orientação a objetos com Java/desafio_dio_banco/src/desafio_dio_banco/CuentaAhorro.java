package desafio_dio_banco;

public class CuentaAhorro extends Conta{
	
	public CuentaAhorro(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtracto() {
		System.out.println("==== Extracto de la Cuenta de Ahorro ====");
		super.imprimirInformacionesComunes();
		
	}
	
	
}
