package br.com.condicionais;

import java.util.Scanner;

public class ExercicioTresInteiros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero: ");
		int primeiroNumero = sc.nextInt();

		System.out.println("Informe o segundo n�mero: ");
		int segundoNumero = sc.nextInt();

		System.out.println("Informe o terceiro n�mero: ");
		int terceiroNumero = sc.nextInt();

		if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {		
			if (segundoNumero > terceiroNumero) {
				System.out.println("O maior n�mero �: " + primeiroNumero);
				System.out.println("O menor n�mero �: " + terceiroNumero);
			} else if (terceiroNumero > segundoNumero) {
				System.out.println("O maior n�mero �: " + primeiroNumero);
				System.out.println("O menor n�mero �: " + segundoNumero);
			} else {
				System.out.println("Os tr�s n�meros s�o iguais!");
			}
		} else if (segundoNumero >= terceiroNumero && segundoNumero >= primeiroNumero) {
			System.out.println("O maior n�mero �: " + segundoNumero);
			if (primeiroNumero >= terceiroNumero) {
				System.out.println("O menor n�mero �: " + terceiroNumero);
			} else {
				System.out.println("O menor n�mero �: " + primeiroNumero);
			}
		} else {
			System.out.println("O maior n�mero �: " + terceiroNumero);
			if (primeiroNumero >= segundoNumero) {
				System.out.println("O menor n�mero �: " + segundoNumero);
			} else {
				System.out.println("O menor n�mero �: " + primeiroNumero);
			}
		}

		sc.close();
	}
}
