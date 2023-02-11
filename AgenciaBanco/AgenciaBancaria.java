package Programa;

import java.util.ArrayList;
import java.util.Scanner;

import utilitarios.Utils;

public class AgenciaBancaria {

	static Scanner caixaEletronico = new Scanner(System.in);
	static ArrayList<Conta> contasBancarias;

	public static void main(String[] args) {
		contasBancarias = new ArrayList<Conta>();
		menu(); // Opções disponíveis caixa eletrônico
	}

	public static void menu() {
		System.out.println("-------------------------------------");
		System.out.println("|----Bem vindos ao Banco Fuctura----|");
		System.out.println("|-----------------------------------|");
		System.out.println("|-----Escolha uma das operações-----|");
		System.out.println("|-----------------------------------|");
		System.out.println("|       Opção 1 - Criar Conta       |");
		System.out.println("|       Opção 2 - Depositar         |");
		System.out.println("|       Opção 3 - Sacar             |");
		System.out.println("|       Opção 4 - Transferir        |");
		System.out.println("|       Opção 5 - Listar            |");
		System.out.println("|       Opção 6 - Sair              |");
		System.out.println("-------------------------------------");

		int menu = caixaEletronico.nextInt();
		switch (menu) {
		case 1:
			criarConta();
			break;
		case 2:
			depositar();
			break;
		case 3:
			sacar();
			break;
		case 4:
			transferir();
			break;
		case 5:
			listarContas();
			break;
		case 6:
			// Não foi implementado pelo cara do vídeo
			// Talvez devido o system.exit();
			// sair();
			System.out.println("Obrigado por usar os serviços da nossa agência!");
			System.exit(0);
		default:
			System.out.println("Opção inválida!");
			menu();
			break;

		}

	}

	public static void criarConta() {

		System.out.println("\nNome: ");
		// Pode ser "caixaEletronico.next()" ou "caixaEletronico.nextLine()"
		String nome = caixaEletronico.next();

		System.out.println("\nCPF: ");
		// Pode ser "caixaEletronico.next()" ou "caixaEletronico.nextLine()"
		String cpf = caixaEletronico.next();

		System.out.println("\nE-mail: ");
		// Pode ser "caixaEletronico.next()" ou "caixaEletronico.nextLine()"
		String email = caixaEletronico.next();

		Pessoa pessoa = new Pessoa(nome, cpf, email);

		Conta conta = new Conta(pessoa);

		contasBancarias.add(conta);
		System.out.println("Sua conta foi criada com sucesso!");
		menu();

	}

	private static Conta encontrarConta(int numeroConta) {
		Conta conta = null;
		if (contasBancarias.size() > 0) {
			for (Conta c : contasBancarias) {
				if (c.getNumeroConta() == numeroConta) {
					conta = c;
				}

			}
		}
		return conta;
	}

	public static void depositar() {
		System.out.println("Número da conta: ");
		int numConta = caixaEletronico.nextInt();

		Conta conta = encontrarConta(numConta);

		if (conta != null) {
			System.out.println("Qual valor deseja depositar: ");
			Double valorDeposito = caixaEletronico.nextDouble();
			conta.depositar(valorDeposito);

		} else {
			System.out.println("A conta " + numConta + " não foi encontrada!");
		}
		menu();
	}

	public static void sacar() {
		System.out.println("Número da conta: ");
		int numConta = caixaEletronico.nextInt();

		Conta conta = encontrarConta(numConta);
		if (conta != null) {
			System.out.println("Qual valor deseja sacar: ");
			Double valorSaque = caixaEletronico.nextDouble();
			conta.sacar(valorSaque);

		} else {
			System.out.println("A conta " + numConta + " não foi encontrada!");
		}
		menu();

	}

	public static void transferir() {
		System.out.println("Número da conta remetente: ");
		int numContaRe = caixaEletronico.nextInt();

		Conta contaRe = encontrarConta(numContaRe);

		if (contaRe != null) {
			System.out.println("Digite a conta do destinatário: ");
			int numContaDe = caixaEletronico.nextInt();

			Conta contaDe = encontrarConta(numContaDe);
			if (contaDe != null) {
				System.out.println("Qual valor deseja transferir: ");
				Double valorTransferencia = caixaEletronico.nextDouble();
				contaRe.transferir(contaDe, valorTransferencia);
			} else {
				System.out.println("A conta Destinatário " + numContaDe + " não foi encontrada!");
			}
		} else {
			System.out.println("A conta Remetente " + numContaRe + " não foi encontrada!");
		}
		menu();

	}

	public static void listarContas() {
		if (contasBancarias.size() > 0) {
			for (Conta conta : contasBancarias) {
				System.out.println(conta);
			}
		} else {
			System.out.println("Não há contas cadastradas!");
		}
		menu();
	}

}
