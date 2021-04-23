package contaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Conta conta;

		System.out.print("Entre com o numero da conta: ");
		int numConta = scanner.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		scanner.nextLine();
		String nome = scanner.nextLine();
		
		System.out.print("É um depósito inicial? (y/n)");
		char contaInicial = scanner.next().charAt(0);
		
		if(contaInicial == 'y')
		{
			System.out.print("Entre com o valor do deposito inicial: ");
			double primeiroDeposito = scanner.nextDouble();
			conta = new Conta(numConta, nome, primeiroDeposito);
		}
		else
		{
			conta = new Conta(numConta, nome);
		}
		
		System.out.println();
		System.out.println(conta.toString());

		scanner.close();
	}

}
