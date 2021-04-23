package aumentoDesalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		List <Funcionarios> funcionarios = new ArrayList<>();
		
		System.out.print("Quantidade de novos funcionarios: ");
		int quantidadeFuncionario = scanner.nextInt();
		
		for(int i=0; i<quantidadeFuncionario;i++)
		{
			System.out.println();
			System.out.println("Funcionário "+(i+1)+":");
			
			System.out.print("Id do funcionário: ");
			int id = scanner.nextInt();
			
			System.out.print("Nome do funcionário: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			System.out.print("Salário: ");
			double salario = scanner.nextDouble();
			
			Funcionarios func = new Funcionarios(id, nome, salario);
			
			funcionarios.add(func);
		}
		
		System.out.print("\nEntre com o Id do funcionario que receberá aumento: ");
		int idAumento = scanner.nextInt();
		
		Integer pos = posicaoIdNaLista(funcionarios, idAumento);
		
		if(pos == null)
		{
			System.out.println("Esse id não existe.");
		}
		else
		{
			System.out.print("\nPorcentagem do aumento: ");
			double porcentagemDoAumento = scanner.nextDouble();
			
			funcionarios.get(pos).aumentoDeSalario(porcentagemDoAumento);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		
		for(Funcionarios x : funcionarios)
		{
			System.out.println(x);
		}
		
		scanner.close();
	}
	
	public static Integer posicaoIdNaLista(List<Funcionarios> funcionarios, int id)
	{
		for(int i=0; i<funcionarios.size();i++)
		{
			if(funcionarios.get(i).getId()==id)
			{
				return i;
			}
		}
		return null;
	}

}
