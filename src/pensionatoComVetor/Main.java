package pensionatoComVetor;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		Quartos[] quartos = new Quartos[10];
		
		System.out.println("Quantidade de hospedes: ");
		int quantidadeHospedes = scanner.nextInt();
		
		for(int i=1; i<=quantidadeHospedes;i++)
		{
			System.out.println();
			System.out.println("Hospedagem #"+i+":");
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("E-mail: ");
			String email = scanner.nextLine();
			System.out.print("Numero do quarto: ");
			int numeroQuarto = scanner.nextInt();
			
			quartos[numeroQuarto] = new Quartos(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i=0;i<10;i++)
		{
			if(quartos[i] != null)
			{
				System.out.println(i+": "+quartos[i]);
			}
		}
		
		scanner.close();
	}
}
