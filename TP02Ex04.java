// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 4: Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.

import java.util.Scanner;

public class TP02Ex04
{
	public static void main(String[] args)
	{
	int[][] matriz = new int [2][3];
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite 6 numeros para serem utilizados na matriz");
	for (int i = 0; i < 2; i++)
	{
		for(int j = 0; j < 3; j++)
		{
			System.out.println("[" + i + "][" + j + "]");
			matriz [i][j] = scanner.nextInt();
		}
	}
	
	System.out.println("Valores armazenados na matriz");
	for (int i = 0; i < 2; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			System.out.print(matriz[i][j] + "\t"); 
        }
            System.out.println(); 
    }
	}
}