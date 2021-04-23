import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com tres numero: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int maior = max(a,b,c);
		
		showResult(maior);
		
		scan.close();
	}
	
	public static int max(int x, int y, int z)
	{
		int aux;
		if(x > y && x > z)
		{
			aux = x;
		}
		else if(y > z)
		{
			aux = y;
		}
		else
		{
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value)
	{
		System.out.println("Maior = "+value);
	}
	

}
