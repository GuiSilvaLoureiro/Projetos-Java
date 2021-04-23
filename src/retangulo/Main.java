package retangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Calculos cal = new Calculos();
		
		System.out.print("Entre com a altura do retangulo: ");
		cal.altura = scanner.nextDouble();
		
		System.out.print("Entre com a largura do retangulo: ");
		cal.largura = scanner.nextDouble();
		
		System.out.println(cal.toString());
		
		scanner.close();
	}

}
