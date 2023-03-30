package banco;

public class UsaConta {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		
		
		c1.setNomeDono("Matheus");
		c1.setNumConta(120422013);
		c1.setTipo("CC");
		c1.informacoes();
		c1.abrirConta();
		c1.depositar(100);
		c1.sacar(12);
		c1.mostrar();
		c1.fecharConta();

	}

}
