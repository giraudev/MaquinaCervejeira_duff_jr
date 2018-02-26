package br.com.ciclic;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {

		MaquinaCervejeira maquina = new MaquinaCervejeira();

		String estiloCerveja = "";
				
		do {
			System.out.println(maquina.display());;
			scanner = new Scanner(System.in);
			estiloCerveja = scanner.nextLine().toUpperCase();
			maquina.escolherCerveja(estiloCerveja);
			
		} while(!estiloCerveja.equals("SAIR"));
		
		
	}
}
