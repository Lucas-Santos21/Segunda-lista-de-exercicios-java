// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 11: Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
// sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
// calcular e exibir determinante da matriz.

import java.util.Scanner;

public class TP02Ex11{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int m = 0;
		
		do{
			
			System.out.print("Digite a ordem da matriz: ");
			m = scan.nextInt();
		
			if(m > 10 || m <= 0){
				
				System.out.println("Digite um valor valido para a ordem (entre 1 e 10)");
				
			}
		
		}while(m > 10 || m <= 0);
		
		float[][] mat = new float[m][m];
		
		 for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Digite o valor da posicao [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = scan.nextFloat();
            }
        }

        float determinante = 0;

        if (m == 1) {
            determinante = mat[0][0];
        } else if (m == 2) {
            determinante = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
        } else {
            for (int j = 0; j < m; j++) {
                float[][] menor = new float[m - 1][m - 1];

                for (int i = 1; i < m; i++) {
                    int colMenor = 0;
                    for (int k = 0; k < m; k++) {
                        if (k != j) {
                            menor[i - 1][colMenor] = mat[i][k];
                            colMenor++;
                        }
                    }
                }

                float sinal = (j % 2 == 0) ? 1 : -1;

                float detMenor = 0;
                if (m - 1 == 2) {
                    detMenor = (menor[0][0] * menor[1][1]) - (menor[0][1] * menor[1][0]);
                } else {
                
                    detMenor = 0;
                }

                determinante += sinal * mat[0][j] * detMenor;
            }
        }

        System.out.println();
        System.out.println("Determinante: " + determinante);
		
	}
	
}