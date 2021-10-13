package br.com.condicionais;

import java.util.Scanner;

public class ExercicioPoligono {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numeroDeLados;
		
		System.out.println("Informe o n�mero de lados do pol�gono: ");
		numeroDeLados = sc.nextInt();
		
		if (numeroDeLados < 3) {
			System.out.println("N�o � um pol�gono!");
		} else if (numeroDeLados == 3) {
			System.out.println("� um Tri�ngulo!");
		} else if (numeroDeLados == 4) {
			System.out.println("� um Quadrado!");
		} else if (numeroDeLados == 5) {
			System.out.println("� um Pent�gono!");
		} else {
			System.out.println("Pol�gono n�o identificado!");
		}
		
		sc.close();
	}
}
