package vetores;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de produtos: ");
		int qtd = scanner.nextInt();
		
		Produtos[] produtos = new Produtos[qtd];
		
		//Utilizando vetor com vários objetos da classe Produtos
		System.out.println();
		for(int i=0;i<produtos.length;i++)
		{
			scanner.nextLine();
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Preço: ");
			double precoProduto = scanner.nextDouble();
			
			produtos[i] = new Produtos(nome, precoProduto);
		}
		
		double media=0;
		for(int i=0;i<produtos.length;i++)
		{
			media += produtos[i].getPrecoProduto(); 
		}
		media = media / qtd;
		
		System.out.printf("Media dos preços: %.2f",media);
		
		
		
		
		//Usando vetor com várias posições
		/*
		System.out.println();
		for(int i=0;i<qtd;i++)
		{
			System.out.print("Altura "+(i+1)+": ");
			vet[i] = scanner.nextDouble();
		}
		
		double media=0;
		for(int i=0;i<qtd;i++)
		{
			media += vet[i]; 
		}
		media = media / qtd;
		
		System.out.println();
		for(int i=0;i<qtd;i++)
		{
			System.out.print("Altura "+(i+1)+": "+vet[i]);
			System.out.println();
		}
		System.out.println("\nMedia das alturas: "+media);
		*/
		scanner.close();
	}

}
