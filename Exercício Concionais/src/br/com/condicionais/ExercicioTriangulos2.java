package br.com.condicionais;

import java.util.Scanner;

public class ExercicioTriangulos2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lado1;
		int lado2;
		int lado3;
		
		System.out.println("Digite o primeiro lado do tri�ngulo: ");
		lado1 = sc.nextInt();
		
		System.out.println("Digite o segundo lado do tri�ngulo: ");
		lado2 = sc.nextInt();
		
		System.out.println("Digite o terceiro lado do tri�ngulo: ");
		lado3 = sc.nextInt();
		
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Tri�ngulo Equil�tero!");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Tri�ngulo Escaleno!");
		} else {
			System.out.println("Tri�ngulo Is�sceles!");
		}
		
		sc.close();
	}
}
