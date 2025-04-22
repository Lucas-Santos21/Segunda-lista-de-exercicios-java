// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 5: Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.

import java.util.Scanner;

public class TP02Ex05{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		
		double[][] mat = new double[3][2];
		
		for(int i = 0; i < 3; i++){
			
			for(int j = 0; j< 2; j++){
				
				System.out.println("Digite o valor para a posicao [" + i + "]["+ j + "]: ");
				mat[i][j] = scan.nextDouble();
				
			}
			
		}
		
		for(int i = 0; i < 3; i++){
			
			for(int j = 0; j < 2; j++){
				
			System.out.println("Valor pertente a posicao [" + i + "]["+ j + "]: " + mat[i][j]);
				
			}
			
		}
		
	}
	
}