package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {   //inicio do c�digo
		// 
			Scanner input = new Scanner(System.in);
			
			double num;
			double raiz, potencia;
			
			System.out.println("Digite um n�mero: "); 
			
			//Declarar variavel:
			
			num = input.nextDouble();
			raiz = Math.sqrt(num);
			potencia = Math.pow(num,2);
			
					
			if(num % 2 == 0) {
				System.out.println(num + " � par e sua raiz �: " + raiz);     //
			} 
			else {
				System.out.println(num + " � impar e sua pot�ncia �: " + potencia);
			}
			
					
			
	}

}
