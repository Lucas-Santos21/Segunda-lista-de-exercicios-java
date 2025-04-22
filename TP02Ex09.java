// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 9: Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
// sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
// elementos, calcular e exibir a matriz transposta.

import java.util.Scanner;

public class TP02Ex09{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int m = 0;
		int n = 0;
		
		do{
		
		System.out.print("Digite o numero de linhas da matriz: ");
		m = scan.nextInt();
		System.out.print("Digite o numero de colunas da matriz: ");
		n = scan.nextInt();
		
		if(m > 10 || m <= 0){
			
			System.out.println("Digite um numero de linhas valido(entre 1 e 10)");
			
		}else if(n > 10 || n <= 0){
			
			System.out.println("Digite um numero de colunas valido(entre 1 e 10)");
			
		}
		
		} while (m > 10 || m <= 0 || n > 10 || n <=0);
		
		float[][] mat = new float[m][n];
		float[][] transposta = new float[n][m];
		
		for(int i = 0; i < m; i++){
			
			for(int j = 0; j < n; j++){
				
				System.out.print("Digite o valor da posicao [" + (i+1) + "][" + (j+1) + "] na matriz: ");
				mat[i][j] = scan.nextFloat();
				
			}
			
		}
		
		System.out.println();
		
		System.out.println("Matriz: ");
		
		System.out.println();
		
		for(int aa = 0; aa < m; aa++){
			
			for(int bb = 0; bb < n; bb++){
				
				System.out.print(mat[aa][bb] + "\t");
				
			}
			
			System.out.println();
		}
		
		for(int jj = 0; jj < n; jj++){
			
			for (int ii = 0; ii < m; ii++){
				
				transposta[jj][ii] = mat[ii][jj];
				
			}
			
		}
		
		System.out.println();
		
		System.out.println("Matriz transposta: ");
		
		System.out.println();
		
		for(int a = 0; a < n; a++){
			
			for(int b = 0; b < m; b++){
				
				System.out.print(transposta[a][b] + "\t");
				
			}
			
			System.out.println();
		}
		
	}
	
}














