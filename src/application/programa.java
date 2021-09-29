package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.conta;

public class programa {

	private static int opcao;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("ola bem vindo! ");
		System.out.println("Ao banco Caguei \n");
		System.out.print("informe o numero da conta: ");
		
		conta conta = new conta();
		conta.setnumeroConta(entrada.nextInt());
		System.out.println();
		
		System.out.print("Informe o nome do titular: ");
		conta.setnomeTitular(entrada.next());
		System.out.println();
		
		System.out.print("Pretende fazer um deposito inicial (Y/N): ");
		char depositoInicial = entrada.next().charAt(0);
		System.out.println();
		
		if(depositoInicial == 'y') {
		
			System.out.print("Digite o valor de Deposito: ");
			conta.depositoServ(entrada.nextDouble());
			System.out.println("Seu Saldo E: "+ conta.getsaldoConta());
			/*System.out.println("clique Qualquer para Continuar ");
			char teste = entrada.next().charAt(0);*/
			
		}
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println("entre com valor de deposito: ");
		conta.depositoServ(entrada.nextDouble());
		
		System.out.println("Dados Atualizados: \n"+ conta);
		
		System.out.println("entre com valor de saque: ");
		conta.sacarSaldo(entrada.nextDouble());
		
		System.out.println("Dados Atualizados: \n"+ conta);
		
		System.out.println("Obrigado "+ conta.getnomeTitular()+ "Volte sempre!");
		
		
		/*
		int opcao = 0;
		
		while(opcao != 4) {
			for (int i = 0;i < 100;i++) {
				System.out.println();
			}
			
			String nome = conta.getnomeTitular();
			
			System.out.println("Ola! "+ nome);
			System.out.println("Seu Saldo: "+ conta.getsaldoConta());
			System.out.println("Escolha uma opçao ");
			System.out.println("1. Deposito");
			System.out.println("2. Sacar");
			System.out.println("3. Alterar nome");
			System.out.println("4.Sair");
			System.out.println("Digite: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o valor de deposito: ");
				conta.depositoServ(entrada.nextDouble());
				System.out.println("Saldo: "+ conta.getsaldoConta());
			break;
			
			case 2:
				System.out.println("Valor a ser Sacado: ");
				conta.sacarSaldo(entrada.nextDouble());
				System.out.println("Saldo: "+ conta.getsaldoConta());
			break;
			
			case 3:
				System.out.println("Coloque Novo nome: ");
				conta.setnomeTitular(entrada.next());
				System.out.println("Seu novo  nome "+conta.getnomeTitular());
			break;
			
			case 4 :
				System.out.println("Obrigado volte sempre " + conta.getnomeTitular());
			break;
			
			default:
				System.out.println("opcao invalida!");
			}
			
			System.out.println("clique para continuar ");
			char c = entrada.next().charAt(0); 							
			
		}*/
		
		
		
		entrada.close();
		

	}

}
