// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 6: Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

import java.util.Scanner;

public class TP02Ex06
{    
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        String[][] nomes = new String[2][3];

        for (int i = 0; i < 2; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print("Digite o nome para posição [" + i + "][" + j + "]: ");
                nomes[i][j] = scanner.nextLine();
            }
        }

        System.out.println("Nomes armazenados na matriz:");
        for (int i = 0; i < 2; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print(nomes[i][j] + "\t");
            }
			System.out.println(); 
        }
	}
}