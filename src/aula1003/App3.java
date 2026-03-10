package aula1003;

import java.util.Scanner;

public class App3 {
	//Entre com um nr. e informe quantoas vezes ele se repete
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador = 4;
		int valor[] = {10,47,78,99,7,41,42,21,4,14,4,4,4,4,1,1,4,1,2,};
		int soma = 0;
		for(int i=0; i<valor.length; i++) {
			
			 soma += valor[i];
			

		}
		System.out.println("Repetiu " + contador + "vezes ");

	}

}
