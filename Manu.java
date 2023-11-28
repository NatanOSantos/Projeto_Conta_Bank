package conta_Bancaria;

import java.util.Scanner;

import conta.util.Cores;
import conta_Bancaria.controller.ContaController;
import conta_Bancaria.model.ContaCorrente;

public class Manu {

	public static void main(String[] args) {
		ContaController contas = new ContaController();
		Menu menu = new Menu(contas);
		menu.runMenu();
	
		var cc1 = new ContaCorrente(1, 3, 7 , "natan" , 10, 10);
		contas.cadastrar(cc1);
	}
}

class Menu {

	public static Scanner read = new Scanner(System.in);
	private ContaController contas;

	public Menu(ContaController contas) {
		this.contas = contas;
	}
	
	public void runMenu() {
		int op;
		
		do {
			System.out.print(Cores.TEXT_YELLOW);
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("                    NOSBank                   ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("          1 - Criar Conta                           ");
			System.out.println("          2 - Listar todas as Contas                ");
			System.out.println("          3 - Buscar Conta por Numero               ");
			System.out.println("          4 - Atualizar Dados                       ");
			System.out.println("          5 - Apagar Conta                          ");
			System.out.println("          6 - Sacar                                 ");
			System.out.println("          7 - Depositar                             ");
			System.out.println("          8 - Transferir valores                    ");
			System.out.println("          9 - Sair                                  ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.print("digite o numero referente a opção desejada: ");
			op = read.nextInt();
			
			switch(op) {
			case 1:
			    System.out.println("Criar Conta");
			    System.out.println("Digite o número da conta:");
			    int numero = read.nextInt();
			    System.out.println("Digite o número da agência:");
			    int agencia = read.nextInt();
			    System.out.println("Digite o tipo da conta:");
			    int tipo = read.nextInt();
			    System.out.println("Digite o nome do titular da conta:");
			    String titular = read.next();
			    System.out.println("Digite o saldo inicial da conta:");
			    float saldo = read.nextFloat();
			    System.out.println("Digite o limite da conta:");
			    float limite = read.nextFloat();
			    ContaCorrente novaConta = new ContaCorrente(numero, agencia, tipo, titular, saldo, limite);
			    contas.cadastrar(novaConta);
			    System.out.println("Conta criada com sucesso!");
			    break;
			
			case 2:
			    System.out.println("Listar todas as Contas");
			    contas.listarTodas();
			    break;

			case 3:
			    System.out.println("Buscar Conta por Numero");
			    System.out.println("Digite o número da conta:");
			    int numeroBusca = read.nextInt();
			    contas.procurarPorNumero(numeroBusca);
			    break;

			case 4:
			    System.out.println("Atualizar Dados da Conta");
			    System.out.println("Digite o número da conta que deseja atualizar:");
			    int numeroAtualizacao = read.nextInt();
			    System.out.println("Digite o novo número da agência:");
			    int agenciaAtualizacao = read.nextInt();
			    System.out.println("Digite o novo tipo da conta:");
			    int tipoAtualizacao = read.nextInt();
			    System.out.println("Digite o novo nome do titular da conta:");
			    String titularAtualizacao = read.next();
			    System.out.println("Digite o novo saldo da conta:");
			    float saldoAtualizacao = read.nextFloat();
			    System.out.println("Digite o novo limite da conta:");
			    float limiteAtualizacao = read.nextFloat();
			    ContaCorrente contaAtualizada = new ContaCorrente(numeroAtualizacao, agenciaAtualizacao, tipoAtualizacao, titularAtualizacao, saldoAtualizacao, limiteAtualizacao);
			    contas.atualizar(contaAtualizada);
			    System.out.println("Dados da conta atualizados com sucesso!");
			    break;

			case 5:
			    System.out.println("Apagar Conta");
			    System.out.println("Digite o número da conta que deseja apagar:");
			    int numeroDeletar = read.nextInt();
			    contas.deletar(numeroDeletar);
			    break;


			case 6:
			    System.out.println("Sacar");
			    System.out.println("Digite o número da conta:");
			    int numeroSacar = read.nextInt();
			    System.out.println("Digite o valor do saque:");
			    float valorSacar = read.nextFloat();
			    contas.sacar(numeroSacar, valorSacar);
			    break;

			case 7:
			    System.out.println("Depositar");
			    System.out.println("Digite o número da conta:");
			    int numeroDeposito = read.nextInt();
			    System.out.println("Digite o valor do depósito:");
			    float valorDeposito = read.nextFloat();
			    contas.depositar(numeroDeposito, valorDeposito);
			    break;

			case 8:
			    System.out.println("Transferir valores entre Contas");
			    System.out.println("Digite o número da sua conta:");
			    int numeroOrigem = read.nextInt();
			    System.out.println("Digite o número da conta para a qual deseja transferir:");
			    int numeroDestino = read.nextInt();
			    System.out.println("Digite o valor da transferência:");
			    float valorTransferencia = read.nextFloat();
			    contas.transferir(numeroOrigem, numeroDestino, valorTransferencia);
			    break;
			case 9:
			    about();
			    break;


			}
			
		} while(op!=9);
	}

	public void about() {
		System.out.println("\n---------------------NOSBank-------------------------");
		System.out.println("****************************************************");
		System.out.println("Desenvolvedor  : Natan Oliveira Santos              ");
		System.out.println("****************************************************");
	}
}
