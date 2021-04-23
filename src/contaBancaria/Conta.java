package contaBancaria;

public class Conta 
{
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome)
	{
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double depositoInicial)
	{
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumero() 
	{ 
		return numero; 
	}

	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDeposito)
	{
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaque)
	{
		saldo -= valorSaque + 5;
	}
	
	public String toString()
	{
		return "\nNumero da conta: "+numero
			  +"\nNome do titular: "+nome
			  +"\nSaldo: "+String.format("%.2f", saldo);
	}
}
