package br.com.generation.condicionais;

import java.util.Scanner;

public class Exercicio02 { 

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int aux, num1, num2, num3;
		
			
			System.out.println("Digite o 1° valor: ");
			
			num1 = ler.nextInt();
			
			System.out.println("Digite o 2° valor: ");
			
			num2 = ler.nextInt();
			
			System.out.println("Digite o 3° valor: ");
			
			num3 = ler.nextInt();
			
		//o primeiro numero é maior que o segundo? vamos troca-los
			
			if (num1>num2) { //se num1 > num2, então vou trocar os valores: aux = num1; num2 = num3; = num3 = aux
				aux = num1;
				num2 = num3;
				num3 = aux;		
			}
			
			// o segundo numero é maior que o terceiro? vamos troca-los
			if (num2>num3 ) {
				aux = num2;
				num2 = num3;
				num3 = aux; 
			}
			
			// depois da segunda troca o n°1 continua sendo maior que o 2°?
			
			if (num1>num2) {
			aux = num1;
			num1 = num2;
			num2 = aux; }
					
			//agora o resultado:
			
			System.out.println("A ordem crescente dos números é: ");
			System.out.println(num1 +" " + num2 + " " + " " + num3);
			
			System.out.println("\n");
}
}				
	

			



