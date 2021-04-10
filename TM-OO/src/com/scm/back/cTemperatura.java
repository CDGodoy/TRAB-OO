package com.scm.back;
import java.util.Scanner;

public class cTemperatura {
	String unidade, fUnidade;
	static Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();
	
	public void calculando(double medida) {
		System.out.print("=====================\n");
    	System.out.print("   (5) Temperatura \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de temperatura.");
		
		System.out.println("Qual unidade de medida você utilizou?");
		System.out.println(" °C  - Graus Celsius");
		System.out.println(" °F  - Graus Farenheint");
		System.out.println("  K  - Kelvin");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		double emCelsius = calc.CTPC(unidade, medida);
		
		System.out.println("Qual unidade de medida você deseja?");
		System.out.println(" °C  - Graus Celsius");
		System.out.println(" °F  - Graus Farenheint");
		System.out.println("  K  - Kelvin");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		double tempFinal = calc.CTDC(unidade, emCelsius);
		
		System.out.println("Sua medida é: " + calc.arredondar(tempFinal));
		
}
}

