package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {   //inicio do código
		// 
			Scanner input = new Scanner(System.in);
			
			double num;
			double raiz, potencia;
			
			System.out.println("Digite um número: "); 
			
			//Declarar variavel:
			
			num = input.nextDouble();
			raiz = Math.sqrt(num);
			potencia = Math.pow(num,2);
			
					
			if(num % 2 == 0) {
				System.out.println(num + " é par e sua raiz é: " + raiz);     //
			} 
			else {
				System.out.println(num + " é impar e sua potência é: " + potencia);
			}
			
					
			
	}

}
