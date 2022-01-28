package desafio_dio_banco;

public class Conta implements iConta{
	
	private static final int AGENCIA_PATRON = 1; // constante, estática y final
	
	private static int SECUENCIAL = 1;
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	// toda Cuenta tiene que tener un cliente para ser creada
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PATRON;
		this.numero = SECUENCIAL++; // como si fuera una llave primaria en un banco de datos
		this.cliente = cliente; // relacionar la cuenta a aquel cliente
	}
	// el cliente es parte de la Cuenta.

	
	
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor; // saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo = saldo + valor; // saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestinataria) {
		// TODO Auto-generated method stub
		this.sacar(valor); //acción 1
		contaDestinataria.depositar(valor); // acción dos 
	}
	
	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	public void transferir() {
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprimirInformacionesComunes() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Número: %d", numero));
		System.out.println(String.format("Saldo: %2f", saldo));
		
	}



	@Override
	public void imprimirExtracto() {
		// TODO Auto-generated method stub
		
	}
	
	
}
