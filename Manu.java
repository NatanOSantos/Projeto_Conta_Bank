package conta_Bancaria;

import java.util.Scanner;
import conta.util.Cores;
import conta_Bancaria.model.Conta;
import conta_Bancaria.model.ContaCorrente;
import conta_Bancaria.model.ContaPoupanca;

public class Manu {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}
}

class Menu {

	public static Scanner read = new Scanner(System.in);
	
	public void runMenu() {
		int op;
		
		Conta c1 = new Conta (1, 123, 1, "João pedro", 100000.0f);
		
		c1.visualizar();
		c1.sacar(2000000.0f);
		c1.visualizar();
		c1.depositar(5000.00f);
		c1.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, " Amanda ", 10000.00f, 2000.00f);
		cc1.visualizar();
		cc1.sacar(11000.00f);
		cc1.visualizar();
		
		ContaPoupanca cc2 = new ContaPoupanca (3,  456,  2 , " João ", 1000.00f, 200.00f, 6);
		cc2.visualizar();
		
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
				break;
			case 2:
				System.out.println("Listar todas as Contas ");
				break;
			case 3:
				System.out.println("Buscar Conta por Numero");
				break;
			case 4:
				System.out.println("Atualizar Dados da Conta");
				break;
			case 5:
				System.out.println("Apagar Conta");
				break;
			case 6:
				System.out.println("Sacar");
				break;
			case 7:
				System.out.println("Depositar");
				break;
			case 8:
				System.out.println("Transferir valores entre Contas");
				break;
			case 9:
				about();
				break;
			default:
				System.out.println("Opção Inválida");
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
