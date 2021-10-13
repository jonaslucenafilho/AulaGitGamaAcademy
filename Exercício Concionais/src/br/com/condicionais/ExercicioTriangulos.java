package br.com.condicionais;

import java.util.Scanner;

public class ExercicioTriangulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int angulo1;
		int angulo2;
		int angulo3;
		int somaDosAngulos;
		
		System.out.println("Digite o primeiro �ngulo do tri�ngulo: ");
		angulo1 = sc.nextInt();
		
		System.out.println("Digite o segundo �ngulo do tri�ngulo: ");
		angulo2 = sc.nextInt();
		
		System.out.println("Digite o terceiro �ngulo do tri�ngulo: ");
		angulo3 = sc.nextInt();
		
		somaDosAngulos = angulo1 + angulo2 + angulo3;
		
		if(somaDosAngulos > 180) {
			System.out.println("Os �ngulos informados n�o s�o de um tri�ngulo!");
		} else if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Tri�ngulo Ret�ngulo!");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Tri�ngulo Obtus�ngulo!");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("Tri�ngulo Acut�ngulo!");
		}
		
		sc.close();
	}
}
