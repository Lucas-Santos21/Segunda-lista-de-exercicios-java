// Lucas da Silva Santos CB3030598
// Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 3: Entrar via teclado com 'N' valores quaisquer. O valor 'N'(que representa a quantidade de
// números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
// satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
// digitação dos 1N1 valores, exibir:

// a. O maior valor;
// b. O menor valor;
// c. A soma dos valores;
// d. A média aritmética dos valores;
// e. A porcentagem de valores que são positivos;
// f. A porcentagem de valores negativos;

// Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
// programa. Consistir a resposta no sentido de aceitar somente 'S' ou 'N' e encerrar o
// programa em função dessa resposta.

import java.util.Scanner;

public class TP02Ex03{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int valor;
		double entrada = 0; 
		double maior = -9999.9;
		double menor = 9999.9;
		double soma = 0;
		double media = 0;
		double positivos = 0;
		double negativos = 0;
		double porcPositivos = 0;
		double porcNegativos = 0;
		
		do{
			
			System.out.println("Digite o numero de valores: ");
			valor = scan.nextInt();
			
			if(valor < 0 || valor >= 20){
				
				System.out.println("Digite o numero de valores no intervalo correto(positivo e menor que vinte)");
				System.out.println();
				
			}
			
		} while(valor < 0 || valor >= 20);
			
		
		for(int i = 0; i < valor; i++){
			
			System.out.println("Digite o " + (i + 1) + " valor: ");
			entrada = scan.nextDouble();
			
			if(entrada > maior){
				
				maior = entrada;
				
			}
			if (entrada < menor){
				
				menor = entrada;
				
			}
			
			if (entrada >= 0){
				
				positivos++; 
				
			} else{
				
				negativos++;
				
			}
			
			soma += entrada;
			
		}
		
		media = soma / valor;
		
		porcPositivos = (positivos / valor) * 100;
		porcNegativos = (negativos / valor) * 100;
		
		System.out.println("O maior valor e: " + maior);
		System.out.println("O menor valor e: " + menor);
		System.out.println("A soma dos valores e: " + soma);
		System.out.println("A media aritmetica dos valores e: " + media);
		System.out.println("A porcentagem de numeros positivos e: "+ porcPositivos + "%");
		System.out.println("A porcentagem de numeros negativos e: " + porcNegativos + "%");
		
	}
	
}