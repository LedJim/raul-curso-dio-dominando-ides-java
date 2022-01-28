package desafio_dio_banco;

public interface iConta {
	
	 void sacar(double valor);
		
	 void depositar(double valor);
	
	 void transferir(double valor, Conta contaDestinataria);
	 
	 void imprimirExtracto();
		


}
