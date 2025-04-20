// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 1: Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
// Caso contrário solicitar novamente apenas o segundo valor.

import java.util.Scanner;

public class TP02Ex01{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		double valor1;
		double valor2;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = scan.nextDouble();
		
		do{
			
			System.out.println("Digite o segundo valor: ");
			valor2 = scan.nextDouble();
			
			if(valor2 <= valor1){
				
				System.out.println("O segundo valor deve ser maior que o primeiro");
				System.out.println();
			}
			
		} while(valor2 <= valor1);
			
		System.out.println("O valor 1 e: " +valor1 + " e o valor 2 e: " + valor2);
		
	}
	
}