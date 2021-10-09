package br.com.condicionais;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");		
		int idade = sc.nextInt();
		
		System.out.println("Voc� est� acompanhado? ");
		String acompanhado = sc.next();
		
		boolean isAcompanhado = false;
		if (acompanhado.toUpperCase().equals("SIM")) {
			isAcompanhado = true;
		}
		
		if (idade <= 18 && idade >= 1) { 
			if (isAcompanhado) {
				System.out.println("Apesar de n�o ser adulto, voc� pode entrar!");
			} else {
				System.out.println("Voc� ainda n�o � adulto!");
			}
		} else if (idade > 18 && idade <= 60){
			System.out.println("Voc� j� � uma pessoa adulta, pode entrar!");
		} else {
			System.out.println("Voc� � da terceira idade, pode entrar!");
		}
		
		sc.close();
	}
}
