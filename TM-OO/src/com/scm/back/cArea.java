package com.scm.back;
import java.util.Scanner;

public class cArea {
	
	String unidade, fUnidade;
	Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();

	private double fator;

	public void calculando(double medida){
		
    	System.out.print("=====================\n");
    	System.out.print("   (1) Ã�REA \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de Ã¡rea.");
		
		System.out.println("Qual unidade de medida vocÃª utilizou?");
		System.out.println(" UM  - Micrometros quadrados");
		System.out.println(" MM  - MilÃ­metros quadrados");
		System.out.println(" CM  - CentÃ­metros quadrados");
		System.out.println(" DM  - DecÃ­metros quadrados");
		System.out.println("  M  - Metros quadrados");
		System.out.println(" DAM - DecÃ¢metros quadrados");
		System.out.println(" HM  - HectÃ¢metros quadrados");
		System.out.println(" KM  - QuilÃ´metros quadrados");
		System.out.print("Insira a opÃ§Ã£o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuÃ¡rio e deixa em maiÃºsculo
		
		fator = Math.pow(calc.UMedida(unidade), 2);
		
		double emMetros = calc.pMetros(medida, fator);//Calculando da unidade inserida para Metros
		
		System.out.println("Qual unidade de medida vocÃª deseja??");
		System.out.println(" UM  - Micrometros quadrados");
		System.out.println(" MM  - MilÃ­metros quadrados");
		System.out.println(" CM  - CentÃ­metros quadrados");
		System.out.println(" DM  - DecÃ­metros quadrados");
		System.out.println("  M  - Metros quadrados");
		System.out.println(" DAM - DecÃ¢metros quadrados");
		System.out.println(" HM  - HectÃ¢metros quadrados");
		System.out.println(" KM  - QuilÃ´metros quadrados");
		System.out.print("Insira a opÃ§Ã£o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuÃ¡rio e deixa em maiÃºsculo
		
		fator = Math.pow(calc.UMedida(unidade), 2);
				
		double mFinal = calc.dMetros(emMetros, fator); //Calculando de Metros para a unidade desejada
		System.out.println("Sua medida em "+fUnidade+" Ã©: " + calc.arredondar(mFinal)); //Exibindo o resultado arredondado
		
	}

}