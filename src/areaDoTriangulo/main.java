package areaDoTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triagulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Entre com as medidas do triagulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.calculoArea();
		double areaY = y.calculoArea();
		
		
		System.out.printf("Area do triangulo X: %.4f\n",areaX);
		System.out.printf("Area do triangulo Y: %.4f\n",areaY);
		
		if(areaX>areaY)
		{
			System.out.println("A maior area é do X");
		}
		else
		{
			System.out.println("A maior area é do Y");
		}
		scan.close();
	}

}
