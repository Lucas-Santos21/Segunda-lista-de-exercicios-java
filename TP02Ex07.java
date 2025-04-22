// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 7: Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
// digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
// valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.

import java.util.Scanner;

public class TP02Ex07{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		float constante = 0;
		
		float[][] mat = new float[3][4];
		
		for(int i = 0; i < 3; i++){
			
			for(int j = 0; j < 4; j++){
				
				System.out.print("Digite o valor da posicao [" + (i + 1) + "][" + (j + 1) + "]: ");
				mat[i][j] = scan.nextFloat();
				
			}
			

		
		}
		
		System.out.println();
		
		System.out.println("Agora digite o valor da constante multiplicativa: ");
		constante = scan.nextFloat();
		
		System.out.println();
		
		for(int k = 0; k < 3; k++){
			
			for(int l = 0; l < 4; l++){
				
				mat[k][l] *= constante;
		
				
			}
			
		}
		
		for(int m = 0; m < 3; m++){
			
			for(int n = 0; n < 4; n++){
				
				System.out.print("Valor multiplicado pela constante da posicao [" + (m + 1) + "][" + (n + 1) + "]: " + mat[m][n]);
				System.out.println();					
			
			}
			
		}
		
	}
	
}