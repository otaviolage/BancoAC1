import java.text.DecimalFormat;

public class Conta {

	DecimalFormat df = new DecimalFormat("#,###.00");

	private String cpf;
	private int banco;
	private int agencia;
	private int conta;
	private int senha;
	private double saldo = 1000;
	private int tamanhoExtrato = 1;
	private String[] extrato = new String[10];
	
	public Conta(String cpf, int senha) { // conta do usuário do caixa
		this.cpf = cpf;
		this.senha = senha;
	}
	public Conta(String cpf) { // contas para transferências
		this.cpf = cpf;
	}
	
	//getters & setters
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} // fim de getters & setters

	public void deposita(double valor) {
		this.saldo += valor;
		tamanhoExtrato++;
		extrato[tamanhoExtrato] = ((tamanhoExtrato - 1) +".depósito: " + valor);
	}
	
	public boolean saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			tamanhoExtrato++;
			extrato[tamanhoExtrato] = (tamanhoExtrato - 1) +".saque: -" + valor;
			return true;
		} else {
			System.out.println("\n==========================================");
			System.out.println("SALDO INSUFICIENTE");
			System.out.println("operação não realizada");
			System.out.println("==========================================\n");
			return false;
		}
	}
	
	public boolean transferir(double valor, int conta, int agencia, int banco) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			tamanhoExtrato++;
			extrato[tamanhoExtrato] = (tamanhoExtrato - 1) + ".transferência: -" + valor;
			
			System.out.println("\n==========================================\n");
			System.out.println("Comprovante: ");
			System.out.println("Banco: " + banco);
			System.out.println("Ag: " + agencia);
			System.out.println("Conta: " + conta);
			System.out.println("Valor Transferido: R$" + df.format(valor));
			System.out.println("\n==========================================\n");
			
			return true;
		} else {
			System.out.println("\n==========================================");
			System.out.println("SALDO INSUFICIENTE");
			System.out.println("operação não realizada");
			System.out.println("==========================================");
			return false;
		}
	}
	
	public void extrato() {
		System.out.println("\n==========================================\n");
		System.out.println("Extrato da conta " + this.conta + ":\n");
		extrato[1] = "Saldo inicial: R$ 1.000,00";
		for (int i = 1; i <= tamanhoExtrato; i++) {
			System.out.println(extrato[i]);
		}
		System.out.println("Saldo atual: R$" + df.format(saldo));
	}

}
