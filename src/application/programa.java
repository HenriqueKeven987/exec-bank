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
			
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println("entre com valor de deposito: ");
		conta.depositoServ(entrada.nextDouble());
		
		System.out.println("Dados Atualizados: \n"+ conta);
		
		System.out.println("entre com valor de saque: ");
		conta.sacarSaldo(entrada.nextDouble());
		
		System.out.println("Dados Atualizados: \n"+ conta);
		
		System.out.println("Obrigado "+ conta.getnomeTitular()+ "Volte sempre!");
				
		
		entrada.close();
		

	}

	

}
