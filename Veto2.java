/* 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados. */
package Arrays;
import java.util.Scanner;
public class Veto2 {

	public static void main(String[] args) {
		int[] V = new int[6];
		int contPar=0, contImp=0, somaPar=0, somaImp=0, x;

		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nEntre com um valor: ");
			V[x] = leia.nextInt();
			
			if(V[x] % 2==0) { 
				somaPar += V[x];
				contPar++;
				
			} else { 
				somaImp += V[x];
				contImp++;
			}
			
		}
		
			System.out.println("A soma dos pares s�o: "+somaPar);
			System.out.println("A soma dos �mpares s�o: "+somaImp);
			System.out.println("A contagem dos pares: "+ contPar);
			System.out.println("A contagem dos �mpares: "+ contImp);
			
			for (x=0;x<6;x++) {
				if (V[x] % 2==0) {
					System.out.printf("\nOs n�meros pares digitados foram: %d ", V[x]);
				}else {
					System.out.printf("\nOs n�meros impares digitados foram: %d ", V[x]);
				}
			}
	}

}
