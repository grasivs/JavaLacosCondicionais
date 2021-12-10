package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercicio01 { //Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in); //input de dados
		
		int a, b, c;       //declarei as variaveis
		
		System.out.println("Digite o 1° número: ");
		
		a = ler.nextInt();
		
		System.out.println("Digite o 2° número: ");
		
		b = ler.nextInt();
		
		System.out.println("Digite o 3° número: ");
		
		c = ler.nextInt();
		
		if ((a>=b)&&(a>=c)) {  //se a > entao a
			
			System.out.println("O maior número é: " + a);
			
		} else if ((b>=a)&&(b>=c)) { //senao se   --> se nao for a entao --> b
			
			System.out.println("O maior número é: " + b);
		}
		
		else { //senao   --> se nao é b --> c
			
			System.out.println("O maior número é: " + c);
		}
		
		
	}

}
