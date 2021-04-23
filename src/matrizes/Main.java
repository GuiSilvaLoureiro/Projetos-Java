package matrizes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantidade de linhas: ");
		int linhas = scanner.nextInt();
		
		System.out.print("Quantidade de colunas: ");
		int colunas = scanner.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		for(int i=0;i<linhas;i++)
		{
			for(int k=0;k<colunas;k++)
			{
				System.out.print("Posição "+(i+1)+"x"+(k+1)+": ");
				int num = scanner.nextInt();
				
				matriz[i][k] = num;
			}
		}
		
		System.out.println();
		for(int i=0;i<linhas;i++)
		{
			for(int k=0;k<colunas;k++)
			{
				System.out.print(" "+matriz[i][k]);
			}
			System.out.println();
		}
		
		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
		
		System.out.println();
		System.out.print("Numero a ser pesquisado: ");
		int num = scanner.nextInt();
		
		
		
		System.out.println();
		for(int i=0;i<linhas;i++)
		{
			for(int k=0;k<colunas;k++)
			{
				if(matriz[i][k]==num)
				{
					System.out.println("\nPosição: linha "+(i+1)+", coluna "+(k+1)+":");
					if(k > 0)
					{
						System.out.print("\nNa esquerda: "+matriz[i][k-1]);
					}
					if(i > 0)
					{
						System.out.print("\nEm cima: "+matriz[i-1][k]);
					}
					if(k < matriz[i].length - 1)
					{
						System.out.print("\nDireita: "+matriz[i][k+1]);
					}
					if(i < matriz.length-1)
					{
						System.out.print("\nEmbaixo: "+matriz[i+1][k]);
					}
				}
			}
		}
		
		//Programa que le um Int que são os lados da matriz
		/*
		System.out.print("Tamanho da lateral da matriz: ");
		int lateral = scanner.nextInt();
		
		int contador=0;
		
		int[][] matriz = new int[lateral][lateral];
		
		for(int i=0;i<lateral;i++)
		{
			for(int k=0;k<lateral;k++)
			{
				System.out.print("Posição "+(i+1)+"x"+(k+1)+": ");
				int num = scanner.nextInt();
				
				matriz[i][k] = num;
				
				if(num<0) 
				{
					contador += 1;
				}
			}
		}
		
		System.out.println();
		
		for(int i=0;i<lateral;i++)
		{
			for(int k=0;k<lateral;k++)
			{
				System.out.print(" "+matriz[i][k]);
			}
			System.out.println();
		}
		
		System.out.print("Diagonal principal: ");
		for(int i=0;i<lateral;i++)
		{
			for(int k=0;k<lateral;k++)
			{
				if(i==k)
				{
					System.out.print(matriz[i][k]+", ");
				}
			}
		}
		
		System.out.print("\nQuantidade de numeros negativos: "+contador);
		*/
		scanner.close();
	}

}
