package br.com.generation.condicionais;

import java.util.Scanner;
															//APRIMORARRRR!!!!!
public class Exercicio03 {

	public static void main(String[] args) {
		// 
		
		Scanner input = new Scanner(System.in); //inserção de dado pelo usuário
		
		int idade;
		
		System.out.println("Digite sua idade:");
		
		idade = input.nextInt();      //receber o valor que o usuario digitou
		
		if (idade >=10 && idade <=14) {        //se
			
			System.out.println("Infantil");
		} 
		else if	(idade >=15 && idade <=17)	{								//se nao se
			
			System.out.println("Juvenil");
			
		} else if (idade >=18 && idade <=25) {
			
			System.out.println("Adulto");
		}
		
		
		input.close(); //fechar o variavel do Scanner

	}
}


