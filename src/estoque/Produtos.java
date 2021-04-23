package estoque;

public class Produtos 
{
	private String nome;
	private int quantidade;
	private double precoProduto;
	
	public Produtos(String nome, int quantidade, double precoProduto)
	{
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoProduto = precoProduto;
	}
	
	//O encapsulamento serve para proteger os atributos
	//Por exemplo nome e pre�o do produto podem ser inseridos pelo usu�rio, mas a quantidade s� deve ser alterada via m�todo.
	//Encapsulamento do atributo nome
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
	
	public int getQuantidade()
	{
		return quantidade;
	}
	
	public double valorTotalEstoque()
	{
		return precoProduto * quantidade;
	}
	
	public void addProdutos(int quantidade)
	{
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade)
	{
		this.quantidade -= quantidade;
	}
	
	public String toString()
	{
		return "\nNome: "
				+nome
				+"\nPre�o do produto: R$ "
				+ String.format("%.2f",precoProduto)
				+"\nQuantidade: "
				+quantidade
				+"\nValor do estoque: "
				+String.format("%.2f",valorTotalEstoque());
	}
}
