package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.conta;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ola bem vindo!");
		System.out.println("Ao banco caguei");
		System.out.println("informe o numero da conta: ");
		
		conta conta = new conta();
		conta.setnumeroConta(entrada.nextInt());
		
		System.out.println("Informe o nome do titular: ");
		conta.setnomeTitular(entrada.next());
		
		System.out.println("Pretende fazer um deposito inicial (Y/N): ");
		char depositoInicial = entrada.next().charAt(0);
		
		if(depositoInicial == 'y') {
		
			System.out.println("Digite o valor de Deposito: ");
			conta.depositoServ(entrada.nextDouble());
			System.out.println("Seu Saldo E: "+ conta.getsaldoConta());
			
			
		}
		
		do {
			for (int i = 0;i < 100;i++) {
				System.out.println();
			}
			
			String nome = conta.getnomeTitular();
			
			System.out.println("Ola! "+ nome);
			System.out.println("Escolha uma opçao ");
			System.out.println("1. Ver Saldo ");
			System.out.println("2. Deposito");
			System.out.println("3. Sacar");
			System.out.println("4. Alterar nome");
			System.out.println("5.Sair");
			int opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Saldo: "+ conta.getsaldoConta());
			break;
			
			case 2:
				System.out.println("Digite o valor de deposito: ");
				conta.depositoServ(entrada.nextDouble());
				System.out.println("Saldo: "+ conta.getsaldoConta());
			break;
			
			case 3:
				System.out.println("Valor a ser Sacado: ");
				conta.sacarSaldo(entrada.nextDouble());
				System.out.println("Saldo: "+ conta.getsaldoConta());
			break;
			
			case 4:
				System.out.println("Coloque Novo nome: ");
				conta.setnomeTitular(entrada.next());
				System.out.println("Seu novo  nome "+ conta.getnomeTitular());
			break;
			
			default:
				System.out.println("opcao invalida!");
			}
			
			
			
		}while(opcao != 5);
		
		
		
		entrada.close();
		

	}

}
