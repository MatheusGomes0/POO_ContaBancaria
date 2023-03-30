package banco;

import javax.swing.JOptionPane;

public class ContaBancaria {
	//atributos
	public int numConta;
	protected String tipo;
	private String nomeDono;
	private double saldo;
	private boolean status;

	//metodo construtor = valor padrao para todos os objetos 
	public ContaBancaria() {
		this.setStatus(false);
		this.setSaldo(0);
	}
	//metodos 
	public void abrirConta() {
		this.setStatus(true);
		if(this.getTipo() == "CC") {
			System.out.println("Sua conta corrente foi aberta com sucesso");
			this.setSaldo(50); //quando abrir em conta corrente a pessoa ganha 50
		} else {
			System.out.println("Sua conta poupança foi aberta com sucesso");
			this.setSaldo(150); // quando abrir em poupança a pessoa ganha 150
		}
	}

	public void fecharConta() {
		if(this.getSaldo() == 0) {
			this.setStatus(false);
			System.out.println("Sua conta foi fechada");
		} else if (this.getSaldo()>0) {
			System.out.println("Voce ainda possui dinheiro na conta, saque primeiro para fechar");
		} else {
			System.out.println("Sua conta esta com saldo negativo, ela não pode ser fechada");
		}
	}

	//outra forma de ser feito sem a entrada gráfica
	public void depositar(float num) {
		if(this.isStatus() == true) {
			setSaldo(this.saldo += num);
		} else {
			System.out.println("Sua conta esta fechada");
		}
	}

	/*public void depositar() {
		if(this.status == true) {
			float num = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que deseja depositar?"));
			this.saldo += num;
		} else {
			System.out.println("Sua conta esta fechada");
		}
	}*/

	public void sacar(float num) {
		if(this.isStatus() == true) {
			if(this.getSaldo()>0) {
				setSaldo(this.saldo -= num);
			} else {
				System.out.println("Sua conta não possui dinheiro para sacar");
			}
		} else if(this.isStatus() == false) {
			System.out.println("Sua conta está fechada");
		}
	}
	/*public void sacar() {
		if(this.status == true) {
			if(this.saldo>0) {
				float num = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que deseja sacar?"));
				this.saldo -= num;
			} else {
				System.out.println("Sua conta não possui dinheiro para sacar");
			}
		} else {
			System.out.println("Sua conta está fechada");
		}
	}*/

	public void pagarMensal() {
		if(this.getTipo() == "CC") {
			this.setSaldo(saldo -= 12);
		} else {
			this.setSaldo(saldo -= 20);
		}
	}

	//metodos especiais
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}


	//metodo para mostrar p resultado
	public void mostrar() {
		System.out.println("O saldo da sua conta é: " + this.getSaldo());
		System.out.println("Sua conta está aberta? " + this.isStatus());
	}
	public void informacoes() {
		System.out.println("Informações sobre sua conta");
		System.out.println("O número da sua conta é: " + this.getNumConta());
		System.out.println("O tipo da sua conta é: " + this.getTipo());
		System.out.println("Seu nome é: " + this.getNomeDono());
	}

}
