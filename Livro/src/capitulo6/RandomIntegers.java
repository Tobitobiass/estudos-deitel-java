// Figura 6.6: RandomIntegers.java  // Inteiros aleatórios deslocados e escalonados. 
// lançamento de um dado 20 vezes
package capitulo6;

import java.security.SecureRandom;

public class RandomIntegers {
	
	public static void main(String[] args) 
	{		
		// O objeto randomIntergers produzirá números aleatórios seguros
		SecureRandom randomNumbers = new SecureRandom();
		
		// Faz o loop 20 vezs
		for (int counter = 1; counter <= 20; counter++) 
		{
			// Seleciona o inteiro aleatório entre 1 e 6
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d ", face); // exibe o valor gerado
			
			// Se o contador for divisível por 5, inicia uma nova linha de saída
			if (counter % 5 == 0)
				System.out.println();			
		}
	}
} // Fim da classe RandomIntegers