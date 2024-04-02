
public class Main {

	public static void main(String[] args) {
		
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");
		
		Conta cc = new ContaCorrente(gabriel);
		
		Conta Poupanca = new ContaPoupanca(gabriel);
		
		cc.depositar(150);
		cc.transferir(100, Poupanca);
		
		cc.imprimirExtrato();
		Poupanca.imprimirExtrato();

	}

}
