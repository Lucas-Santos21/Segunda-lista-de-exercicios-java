// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 2: Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
// erro, se necessário. Após a digitação, exibir:
// a. O maior valor;
// b. A soma dos valores;
// c. A média aritmética dos valores.

import java.util.Scanner;

public class TP02Ex02
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int [] valores = new int [10];
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		
		int i = 0;
		while (i < 10)
		{
			System.out.print("Digite um valor positivo: ");
			int valor = scanner.nextInt();
			
			if (valor > 0)
			{
				valores[i] = valor;
				soma += valor;
				if (valor > maior) 
				{
					maior = valor;
				}
				i++;
			}
			else
			{
			System.out.println("O valor deve ser positivo, por favor, insira novemente apenas com valores positivos");
			}
			
		}
		double media = soma / 10.0;
		
		System.out.println ("Maior valor: " + maior);
		System.out.println ("Soma dos valores: " + soma);
		System.out.println ("Media dos valores: " + media);       
		
		scanner.close();
    }
}