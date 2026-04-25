package JAVA_INTRO;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Criar um sistema que leia o tempo de duraçao de um evento em uma fabrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		*/
		Scanner leia = new Scanner(System.in);

		int horas,segundos,minutos,minuto,tempo;
		String evento;

		System.out.println("Qual o nome do evento? \nR:");
		evento = leia.next();
		System.out.println("Qual a duraçao em segundos do evento? \nR:");
		tempo = leia.nextInt();

		horas = tempo/ 3600;
		minuto = tempo / 60;
		minutos = (tempo - (horas * 3600)) / 60;
		segundos = (tempo - (minutos * 60)) % 30;

		System.out.println("\nO evento "+evento+" tera a duraçao de "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		System.out.println("\nO tempo total do evento"+evento+" em horas sera de: "+horas+" horas.");
		System.out.println("\nO tempo total do evento"+evento+" em minutos sera de: "+minuto+" minutos.");
		System.out.println("\nO tempo total do evento"+evento+" em segundos sera de: "+tempo+" segundos.");



	}

}