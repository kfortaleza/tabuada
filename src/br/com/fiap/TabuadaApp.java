package br.com.fiap;

import java.util.Scanner;

import br.com.fiap.tabuada.Tabuada;

public class TabuadaApp {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		int multiplicando;
		int multiplicador;
		
		System.out.println("---------------------------");
		System.out.println("       T A B U A D A");		
		System.out.println("---------------------------");		
		System.out.println("");
		
		System.out.println("Qual o multiplicando? ");
		multiplicando = leitor.nextInt();
		
		System.out.println("Qual o multiplicador? ");
		multiplicador = leitor.nextInt();
		
		Tabuada tabuada = new Tabuada();
		
		tabuada.executarTabuada(multiplicando, multiplicador);

		
	}

}
