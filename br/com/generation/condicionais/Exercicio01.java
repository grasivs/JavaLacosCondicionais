package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercicio01 { //Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in); //input de dados
		
		int a, b, c;       //declarei as variaveis
		
		System.out.println("Digite o 1� n�mero: ");
		
		a = ler.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		
		b = ler.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		
		c = ler.nextInt();
		
		if ((a>=b)&&(a>=c)) {  //se a > entao a
			
			System.out.println("O maior n�mero �: " + a);
			
		} else if ((b>=a)&&(b>=c)) { //senao se   --> se nao for a entao --> b
			
			System.out.println("O maior n�mero �: " + b);
		}
		
		else { //senao   --> se nao � b --> c
			
			System.out.println("O maior n�mero �: " + c);
		}
		
		
	}

}
