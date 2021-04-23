package aumentoDesalario;

public class Funcionarios 
{
	private Integer id;
	private String nome;
	private double salario;
	
	public Funcionarios()
	{
		
	}
	
	public Funcionarios(Integer id, String nome, double salario) 
	{
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public double getSalario() 
	{
		return salario;
	}
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	
	public double aumentoDeSalario(double porcentagemDeAumento)
	{
		return salario += salario * porcentagemDeAumento / 100;
	}
	
	public String toString()
	{
		return "Id: "+id
			  +" - Nome: "+nome
			  +" - Salário: "+String.format("%.2f", salario);
	}
}
