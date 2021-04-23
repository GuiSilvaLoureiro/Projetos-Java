package Listas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		List <String> list = new ArrayList<>();
		
		//Adicionando elementos da lista
		list.add("Gui");
		list.add("Nath");
		list.add("Pri");
		list.add("Gu");
		list.add("Norton");
		list.add("Bob");
		list.add("Anna");
		list.add("Nicolas");
		//Adicionando elemento na lista na posição que voce quer, no caso posição 2
		list.add(2, "Marcos");
		
		//For que faz looping referente ao vetor/arraylist que voce quer
		for(String x : list)
		{
			System.out.println(x);
		}
		System.out.println("----------------------");
		
		//Remove o item no endereço 2
		list.remove(2);
		
		
		//Remoção com predicado. Se lê: remover na String x tal que x na posição 0 seja igual a G
		list.removeIf(x -> x.charAt(0) == 'G');
		
		for(String x : list)
		{
			System.out.println(x);
		}
		
		//Indice na qual a "Pri" se encontra
		System.out.println("Endereço da Pri: "+(list.indexOf("Pri")+1));
		
		System.out.println("----------------------");
		
		//Aqui voce cria um filtro baseado no predicado (x -> x.charAt(0) == 'N') para exibir os nome que começam com a letra N
		List <String> resultado = list.stream().filter(x -> x.charAt(0) == 'N').collect(Collectors.toList());
		
		for(String x : resultado)
		{
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		
		//Aqui voce exibe o primeiro nome que começa com a letra N. Se n existir vai retornar nulo
		String nome = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);
		System.out.println(nome);
		
	}

}
