package vetores;

public class Produtos 
{
	private String nome;
	private double precoProduto;
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public double getPrecoProduto() 
	{
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) 
	{
		this.precoProduto = precoProduto;
	}
	
	public Produtos(String nome, double precoProduto) 
	{
		this.nome = nome;
		this.precoProduto = precoProduto;
	}
	
	
}
