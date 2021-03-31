import java.util.Scanner;

public class cDistancia {
	
	String unidade, fUnidade;
	static Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();
	
	private double fator;
	
	public void calculando(double medida) {
		System.out.print("=====================\n");
    	System.out.print("   (2) Distância \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de distância.");
		
		System.out.println("Qual unidade de medida você utilizou?");
		System.out.println(" UM  - Micrometro");
		System.out.println(" MM  - Milímetro");
		System.out.println(" CM  - Centímetro");
		System.out.println(" DM  - Decímetro");
		System.out.println("  M  - Metro");
		System.out.println(" DAM - Decâmetro");
		System.out.println(" HM  - Hectâmetro");
		System.out.println(" KM  - Quilômetros");
		System.out.println(" AL  - Anos Luz");
		System.out.println(" ML  - Milhas");
		System.out.println(" JD  - Jardas");
		System.out.println(" PE  - Pés");
		System.out.println(" PL  - Polegadas");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		fator = calc.UMedida(unidade); //Chamando o resultado de UMedida
		double emMetros = calc.pMetros(medida, fator);
		
		System.out.println("Qual unidade de medida você deseja?");
		System.out.println(" UM  - Micrometro");
		System.out.println(" MM  - Milímetro");
		System.out.println(" CM  - Centímetro");
		System.out.println(" DM  - Decímetro");
		System.out.println("  M  - Metro");
		System.out.println(" DAM - Decâmetro");
		System.out.println(" HM  - Hectâmetro");
		System.out.println(" KM  - Quilômetros");
		System.out.println(" AL  - Anos Luz");
		System.out.println(" ML  - Milhas");
		System.out.println(" JD  - Jardas");
		System.out.println(" PE  - Pés");
		System.out.println(" PL  - Polegadas");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		fator = calc.UMedida(unidade);//Chamando o resultado de UMedida
		
		double mFinal = calc.dMetros(emMetros, fator);
		
		fUnidade = calc.UName(unidade);
		
		System.out.println("Sua medida em "+fUnidade+" é: " + calc.arredondar(mFinal));
		
	}
	
}
