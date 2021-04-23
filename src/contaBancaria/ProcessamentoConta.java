package contaBancaria;

public class ProcessamentoConta 
{
	private int numConta;
	private String nome;
	private char contaInicial;
	private double primeiroDeposito;
	private double saldo;
	
	public ProcessamentoConta(int numConta, String nome, char contaInicial, double primeiroDeposito)
	{
		this.numConta = numConta;
		this.nome = nome;
		this.contaInicial = contaInicial;
		this.primeiroDeposito = primeiroDeposito;
	}
	
	public int getNumConta()
	{
		return numConta;
	}
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	public char getContaInicial()
	{
		return contaInicial;
	}
	public void setContaInicial(char contaInicial)
	{
		this.contaInicial = contaInicial;
	}
	
	public double getPrimeiroDeposito()
	{
		return primeiroDeposito;
	}
	
	public double decisão()
	{
		if(contaInicial=='y')
		{
			saldo = primeiroDeposito;
		}
		return saldo;
	}
	
	public double consultaSaldo()
	{
		return this.getSaldo();
	}
	
	public String status()
	{
		return "\nNumero da conta: "
				+numConta
				+"\nNome do titutar: "
				+nome
				+"\nPrimeira conta: "
				+contaInicial
				+"\nSaldo: "
				+this.saldo;
	}
}
