/* 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados. */
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
		
			System.out.println("A soma dos pares são: "+somaPar);
			System.out.println("A soma dos ímpares são: "+somaImp);
			System.out.println("A contagem dos pares: "+ contPar);
			System.out.println("A contagem dos ímpares: "+ contImp);
			
			for (x=0;x<6;x++) {
				if (V[x] % 2==0) {
					System.out.printf("\nOs números pares digitados foram: %d ", V[x]);
				}else {
					System.out.printf("\nOs números impares digitados foram: %d ", V[x]);
				}
			}
	}

}
