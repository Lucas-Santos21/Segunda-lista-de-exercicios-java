// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 10: Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
// sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
// calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
// colunas).

import java.util.Scanner;

public class TP02Ex10 
{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ordem;
		do {
            System.out.print("Digite a ordem da matriz (até 10): ");
            ordem = scanner.nextInt();
		} while (ordem <= 0 || ordem > 10);

		double[][] matriz = new double[ordem][ordem];
		double[][] identidade = new double[ordem][ordem];

		System.out.println("Digite os elementos da matriz:");
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.print("matriz[" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextDouble();
			}
		}

		for (int i = 0; i < ordem; i++) {
			identidade[i][i] = 1.0;
		}

		for (int i = 0; i < ordem; i++) {
			double pivo = matriz[i][i];

			if (pivo == 0) {
				System.out.println("Matriz não invertível (pivô zero na linha " + i + ")");
				return;
			}

			for (int j = 0; j < ordem; j++) {
				matriz[i][j] /= pivo;
				identidade[i][j] /= pivo;
			}

			for (int k = 0; k < ordem; k++) {
				if (k != i) {
					double fator = matriz[k][i];
					for (int j = 0; j < ordem; j++) {
						matriz[k][j] -= fator * matriz[i][j];
						identidade[k][j] -= fator * identidade[i][j];
					}
				}
			}
		}

		System.out.println("\nMatriz Inversa:");
		imprimirMatriz(identidade);

		scanner.close();
	}

	public static void imprimirMatriz(double[][] matriz) {
		for (double[] linha : matriz) {
			for (double valor : linha) {
				System.out.printf("%8.3f ", valor);
			}
			System.out.println();
		}
	}	
}