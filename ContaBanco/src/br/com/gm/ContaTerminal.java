package br.com.gm;

import java.util.Scanner;

public class ContaTerminal {
	
	String numero;
	String agencia;
	String nomeCliente;
	double saldo = 237.48;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ContaTerminal conta = new ContaTerminal();
		
		System.out.println("Por favor, digite o número da Conta !");
		
		String numero = scanner.nextLine();
		
		System.out.println("Por favor, digite o nome do Cliente !");
		
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o número da Agência !");
		
		String agencia = scanner.nextLine();
		
		System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
		+agencia+", conta "+numero+" e seu saldo "+conta.saldo+" já está disponível para saque.");
		
		scanner.close();
	}

}
