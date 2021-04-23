package notaALuno;

public class CalculoDasNotas 
{
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media()
	{
		return (nota1+nota2+nota3)/3;
	}
	
	public double pontosFaltantes()
	{
		return 20 - media();
	}
	
	public String decisao()
	{
		String status = "Aprovado";
		
		if(media() < 20)
		{
			status = "Reprovado";
		}
		
		return status;
	}
	
	public static void teste()
	{
		System.out.println("Olá");
	}
}
