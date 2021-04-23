package retangulo;

public class Calculos 
{
	public double altura;
	public double largura;
	
	public double area()
	{
		return altura*largura;
	}
	
	public double perimetro()
	{
		return 2*altura+2*largura;
	}
	
	public double diagonal()
	{
		return Math.sqrt(altura*altura+largura*largura);
	}
	
	public String toString()
	{
		return "\nArea: "
				+String.format("%.2f", area())
				+"\nPerimetro: "
				+String.format("%.2f", perimetro())
				+"\nDiagonal: "
				+String.format("%.2f", diagonal());
	}
}
