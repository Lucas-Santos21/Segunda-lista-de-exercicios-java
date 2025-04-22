import java.util.Scanner;

public class TP02Ex08 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] matrizOriginal = new int[3][4];
		int[][] matrizMultiplicada = new int[3][4];

		System.out.println("Digite 12 valores inteiros para preencher a matriz 3x4:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Valor para posição [" + i + "][" + j + "]: ");
				matrizOriginal[i][j] = scanner.nextInt();
			}
		}

		System.out.print("Digite a constante multiplicativa: ");
		int constante = scanner.nextInt();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matrizMultiplicada[i][j] = matrizOriginal[i][j] * constante;
			}
		}

		System.out.println("\nMatriz Original:");
		exibirMatriz(matrizOriginal);

		System.out.println("\nMatriz Multiplicada:");
		exibirMatriz(matrizMultiplicada);

		scanner.close();
    }

	public static void exibirMatriz(int[][] matriz) {
		for (int[] linha : matriz) {
			for (int valor : linha) {
				System.out.printf("%5d", valor);
			}
			System.out.println();
		}
	}
}// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 8: Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
// digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
// valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
// correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
// colunas.