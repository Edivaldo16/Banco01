package Programa;

import utilitarios.Utils;

public class Conta {

	// Atributos
	private static int contadorDeContas = 1;

	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0.0;

	// Métodos Personalizados:
	
	//Retornar alguns dados do cliente
	public String toString() {
		return "\nNúmero da Conta: "+this.getNumeroConta() +
			   "\nNome: " + this.pessoa.getNome() +
			   "\nCPF: " + this.pessoa.getCpf() +
			   "\nE-mail: " + this.pessoa.getEmail() +
			   "\nSaldo: " + Utils.doubleToString(this.getSaldo()) + 
			   "\n";
	}
	
	public void depositar(Double valor) {
		if(valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Seu depósito de "+Utils.doubleToString(valor)+" foi realizado com sucesso!");
		}else {
			System.out.println("Impossível depositar valores negativos!");
		}
	}
	
	public void sacar(Double valor) {
		if(valor > 0 && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Seu saque de "+Utils.doubleToString(valor)+" foi realizado com sucesso!");
		}else {
			System.out.println("Impossível sacar valores maiores que o saldo disponível!");
		}
	}
	
	public void transferir(Conta contaParaDeposito, Double valor) {
		if(valor > 0 && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			contaParaDeposito.setSaldo(contaParaDeposito.getSaldo() + valor);
			System.out.println("Valor de " + Utils.doubleToString(valor)
			+ " depositado com sucesso na conta " + contaParaDeposito.getNumeroConta());
		}else {
			System.out.println("Impossível transferir. Verifique seu saldo e/ou se o valor digitado é negativo!");
		}
		
	}
	
	// Métodos Especiais:
	// Constructor
	public Conta(Pessoa pessoa) {
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}
	// Getters and Setters
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
