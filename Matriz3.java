/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */
package Arrays;
import java.util.Scanner;
public class Matriz3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [][] M = new int[3][3];
		int cont=0,contM=0,c,l, num;
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Digite um valor: ");
				num = leia.nextInt();
				cont++;;
				if(num >10) {
					contM++;
				} else {
					
				}
				
			}
		}
		
			System.out.println("A quantidade de valores maiores de 10 é: "+contM);
			System.out.println("A quantidade de "+cont);
	}

}
