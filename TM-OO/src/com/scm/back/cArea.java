package com.scm.back;
import java.util.Scanner;

public class cArea {
	
	String unidade, fUnidade;
	Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();

	private double fator;

	public void calculando(double medida){
		
    	System.out.print("=====================\n");
    	System.out.print("   (1) ÁREA \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de área.");
		
		System.out.println("Qual unidade de medida você utilizou?");
		System.out.println(" UM  - Micrometros quadrados");
		System.out.println(" MM  - Milímetros quadrados");
		System.out.println(" CM  - Centímetros quadrados");
		System.out.println(" DM  - Decímetros quadrados");
		System.out.println("  M  - Metros quadrados");
		System.out.println(" DAM - Decâmetros quadrados");
		System.out.println(" HM  - Hectâmetros quadrados");
		System.out.println(" KM  - Quilômetros quadrados");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		fator = Math.pow(calc.UMedida(unidade), 2);
		
		double emMetros = calc.pMetros(medida, fator);//Calculando da unidade inserida para Metros
		
		System.out.println("Qual unidade de medida você deseja??");
		System.out.println(" UM  - Micrometros quadrados");
		System.out.println(" MM  - Milímetros quadrados");
		System.out.println(" CM  - Centímetros quadrados");
		System.out.println(" DM  - Decímetros quadrados");
		System.out.println("  M  - Metros quadrados");
		System.out.println(" DAM - Decâmetros quadrados");
		System.out.println(" HM  - Hectâmetros quadrados");
		System.out.println(" KM  - Quilômetros quadrados");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		fator = Math.pow(calc.UMedida(unidade), 2);
		
		fUnidade = calc.UName(unidade);
		
		double mFinal = calc.dMetros(emMetros, fator); //Calculando de Metros para a unidade desejada
		System.out.println("Sua medida em "+fUnidade+" é: " + calc.arredondar(mFinal)); //Exibindo o resultado arredondado
		
	}

}