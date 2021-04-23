package notaALuno;

import java.util.Scanner;
import estoque.Status;

public class Main {

	public static void main(String[] args) 
	{
		CalculoDasNotas nota = new CalculoDasNotas();
		Scanner scanner = new Scanner(System.in);
		Status status = new Status();
		/*
		System.out.print("Nome do aluno: ");
		nota.nome = scanner.nextLine();
		
		System.out.print("Nota 1 (Entre 0 e 30): ");
		nota.nota1 = scanner.nextDouble();
		System.out.print("Nota 2 (Entre 0 e 35): ");
		nota.nota2 = scanner.nextDouble();
		System.out.print("Nota 3 (Entre 0 e 35): ");
		nota.nota3 = scanner.nextDouble();
		
		System.out.println(nota.media());
		System.out.println(nota.decisao());
		*/
		
		//Status.teste();
		teste2();
		CalculoDasNotas.teste();
		
		scanner.close();
	}
	
	public static void teste2()
	{
		Status status = new Status();
//		status.teste();
	}
}
