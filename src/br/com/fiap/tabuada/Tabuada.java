package br.com.fiap.tabuada;

public class Tabuada {
	
	public void executarTabuada(int multiplicando, int multiplicador) {
		
		int cont = 0;
		int produto = 0;
		
		while (cont <= multiplicador) {
			
			produto = multiplicando * cont;
			System.out.println(multiplicando + " x " + cont + " = " + produto);
			
			cont = cont + 1;
					
		}
		
	}

}
