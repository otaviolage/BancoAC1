import java.text.DecimalFormat;
import java.util.Scanner;

public class CaixaEletronico_OO {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		Conta conta = new Conta("123.456.789-00", 1020304);

		conta.setBanco(100);
		conta.setAgencia(3003);
		conta.setConta(1015582);

		boolean repeatTodaOperacao = true;

		while (repeatTodaOperacao == true) {

			System.out.println("==========================================");
			System.out.println("CAIXA ELETRÔNICO DO BANCO DO OTÁVIO");
			System.out.println("==========================================\n");
			
			System.out.print("Digite o seu CPF: ");
			String cpf = ler.next();

			while (!cpf.equals(conta.getCpf())) { // testa o cpf
				System.out.println("\nCPF INCORRETO");
				System.out.print("Digite o seu CPF novamente: ");
				cpf = ler.next();
			}

			System.out.print("Senha: ");
			int senha = ler.nextInt();

			for (int i = 1; i <= 2 && senha != conta.getSenha(); i++) {
				System.out.print("\nSENHA INCORRETA\nDigite novamente: ");
				senha = ler.nextInt();
				if (i == 2 && senha != conta.getSenha()) {
					System.out.println("\nCPF BLOQUEADO");
					System.out.println("Terceira tentativa incorreta");
					
					System.out.println("\nLigue no seu banco para desbloqueá-lo");
					System.out.println("        (15) 99999-9999");
					System.exit(1);
				}
			}

			// tela de boas vindas

			System.out.println("\n==========================================\n");
			System.out.println("Bem-vindo Cliente!");

			System.out.println("Banco: " + conta.getBanco());
			System.out.println("Ag: " + conta.getAgencia());
			System.out.println("Conta: " + conta.getConta());

			// final de boas vindas

			boolean repeatOperacoes = true;

			while (repeatOperacoes == true) {
				// menu:
				
				System.out.println("\n==========================================\n");
				
				System.out.println("Digite 1 para visualizar o saldo"); // getSaldo
				System.out.println("Digite 2 para depósitos"); // deposita
				System.out.println("Digite 3 para saques"); // saque
				System.out.println("Digite 4 para transferências"); // transferir
				System.out.println("Digite 5 para extrato"); // extrato
				System.out.println("Digite 0 para sair");
				System.out.print("Digite a operacao que deseja realizar: ");
				int operacao = ler.nextInt();

				System.out.println("\n==========================================\n");

				// final de menu

				// operacoes:
				switch (operacao) {
				case 1: // SALDO
					System.out.println("Seu saldo atual é: R$" + df.format(conta.getSaldo()));
					break;
				case 2: // DEPÓSITO
					System.out.print("Digite o valor que deseja depositar: ");
					double valorDeposito = ler.nextInt();
					conta.deposita(valorDeposito);
					break;
				case 3: // SAQUE
					System.out.print("Digite o valor deseja sacar: ");
					double valorSaque = ler.nextInt();
					conta.saque(valorSaque);
					break;
				case 4: // TRANSFERÊNCIA
					// double valor, Conta contaDestino, Conta agencia, Conta banco
					System.out.print("Digite o valor deseja transferir: ");
					double valorTransferencia = ler.nextDouble();
					System.out.print("Digite o CPF do destinatário: ");
					String cpfDestinatario = ler.next();
					Conta contaDestino = new Conta(cpfDestinatario);
					System.out.print("Digite o número da conta: ");
					int numeroContaDestino = ler.nextInt();
					contaDestino.setConta(numeroContaDestino);
					System.out.print("Agencia: ");
					int numeroAgenciaDestino = ler.nextInt();
					contaDestino.setAgencia(numeroAgenciaDestino);
					System.out.print("Número do Banco: ");
					int numeroBancoDestino = ler.nextInt();
					contaDestino.setBanco(numeroBancoDestino);
					conta.transferir(valorTransferencia, contaDestino.getConta(), contaDestino.getAgencia(),
							contaDestino.getBanco());
					break;
				case 5: // EXTRATO
					conta.extrato();
					break;
				case 0: // SAIR
					repeatOperacoes = false;
					break;
				default: // INCORRETO
					System.out.println("Comando incorreto, inicie novamente");
				} // fim de switch operacao

				// comando final:
				System.out.println("\n==========================================");
				System.out.println("Deseja realizar uma nova operação?");
				System.out.println("Digite [sim] para realizar");
				System.out.println("Digite [não] para reiniciar");
				System.out.println("Digite a senha de desligamento para finalizar");
				System.out.println("==========================================");
				System.out.print("- ");

				String comandoFinal = ler.next();
				switch (comandoFinal) {
				case "sim":
					break;
				case "não":
					repeatOperacoes = false;
					break;
				case "1234":
					;
					System.out.println("Máquina desligando...");
					System.exit(1);
					break;
				default:
					System.out.println("Comando incorreto, inicie novamente");
					break;
				} // fim de switch comandoFinal
			} // fim de while para repeatOperacoes
			
			System.out.println("\n==========================================\nAdeus....\n\n\n");
			
		} // fim de while para repeatTodaOperacao
	}// fim do main
}// fim da class
