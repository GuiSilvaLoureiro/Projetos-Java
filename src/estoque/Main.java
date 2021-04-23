package estoque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Quantidade: ");
		int quantidade= scanner.nextInt();
		System.out.print("Preço do produto: ");
		double precoProduto= scanner.nextDouble();
		
		Produtos produtos = new Produtos(nome, quantidade, precoProduto);
		
		//System.out.println(produtos.toString());
		
		System.out.print("\nEntre com a quantidade de produtos que será adicionado: ");
		quantidade = scanner.nextInt();
		produtos.addProdutos(quantidade);
		
		System.out.println(produtos.toString());
		
		System.out.print("\nEntre quantos produtos vao sair: ");
		quantidade = scanner.nextInt();
		produtos.removeProdutos(quantidade);
		
		System.out.println(produtos.toString());
		
		scanner.close();
	}

}
