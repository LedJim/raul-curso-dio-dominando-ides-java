package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente Raul = new Cliente();
		Raul.setNome("Raulito");
		
		Conta corriente = new CuentaCorriente(Raul);
		Conta ahorro = new CuentaCorriente(Raul);
		
		corriente.depositar(500);
		System.out.println("se depositó un dinerito ahí:");
		corriente.imprimirExtracto();
		corriente.transferir(300, ahorro);
		
		corriente.imprimirExtracto();
		ahorro.imprimirExtracto();
		

	}

}
