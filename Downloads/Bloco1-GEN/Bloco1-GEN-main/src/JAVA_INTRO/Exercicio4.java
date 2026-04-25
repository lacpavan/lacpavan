package JAVA_INTRO;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int A,B,C;
		double D,R,S;

		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();

		R = Math.pow(A+B,2);
		S = Math.pow(B+C,2);
		D = (R + S) / 2;

		System.out.println("\nO valor de D e: "+D+".");

	}

}