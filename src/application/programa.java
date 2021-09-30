package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.conta;

public class programa {

	private static int opcao;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		conta conta;
		
		System.out.print("ola bem vindo! ");
		System.out.println("Ao banco Caguei \n");
		System.out.print("informe o numero da conta: ");
		
		
		int numeroConta = entrada.nextInt();
		System.out.println();
		
		System.out.print("Informe o nome do titular: ");
		String nomeTitular = entrada.next();
		System.out.println();
		
		
		System.out.print("Pretende fazer um deposito inicial (Y/N): ");
		char depositoInicial = entrada.next().charAt(0);
		System.out.println();
		
		if(depositoInicial == 'y') {
		
			System.out.print("Digite o valor de Deposito: "); 
			double depositoIni = entrada.nextDouble();
			conta = new conta(numeroConta, nomeTitular, depositoIni);
			
			
		}else {
			conta = new conta(numeroConta, nomeTitular);
		}
		
		int opcao = 0;
		while(opcao != 4) {
			
			System.out.println("\n \n \n \n \n ");
			System.out.println("Dados da conta: ");
			System.out.println(conta);
			System.out.println("esolha uma opçao");
			System.out.println("1.Deposito");
			System.out.println("2.saque");
			System.out.println("3.Alterar Nome");
			System.out.println("4.Sair");
			System.out.print("Opção: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
				
			case 1:				
				System.out.println("\n Valor de Deposito: ");
				conta.depositoServ(entrada.nextDouble());
				System.out.println("Dados Atualizados:");
				System.out.println(conta);
			break;
			
			case 2:
				System.out.println("\n Valor de Saque: ");
				conta.sacarSaldo(entrada.nextDouble());
				System.out.println("Dados Atualizados");
				System.out.println(conta);
			break;
			
			case 3:
				System.out.println("\n Digite o novo Nome:");
				conta.setnomeTitular(entrada.next());
				System.out.println("Dados Atualizados");
				System.out.println(conta);
			break;
			
			default:
				System.out.println("Opção Invalida!");				
			break;
			
			}//fim do switch
						
		}//fim do while
		
		for (int f = 0;f < 100 ;f++) {
			System.out.println();
		}
		
		System.out.println("Obrigado "+ conta.getnomeTitular()+ " Volte sempre!");
				
		
		entrada.close();
		

	}

	

}
