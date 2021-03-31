import java.util.Scanner;

public class cDistancia {
	
	String unidade, fUnidade;
	static Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();
	
	private double fator;
	
	public void calculando(double medida) {
		System.out.print("=====================\n");
    	System.out.print("   (2) Dist�ncia \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de dist�ncia.");
		
		System.out.println("Qual unidade de medida voc� utilizou?");
		System.out.println(" UM  - Micrometro");
		System.out.println(" MM  - Mil�metro");
		System.out.println(" CM  - Cent�metro");
		System.out.println(" DM  - Dec�metro");
		System.out.println("  M  - Metro");
		System.out.println(" DAM - Dec�metro");
		System.out.println(" HM  - Hect�metro");
		System.out.println(" KM  - Quil�metros");
		System.out.println(" AL  - Anos Luz");
		System.out.println(" ML  - Milhas");
		System.out.println(" JD  - Jardas");
		System.out.println(" PE  - P�s");
		System.out.println(" PL  - Polegadas");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = calc.UMedida(unidade); //Chamando o resultado de UMedida
		double emMetros = calc.pMetros(medida, fator);
		
		System.out.println("Qual unidade de medida voc� deseja?");
		System.out.println(" UM  - Micrometro");
		System.out.println(" MM  - Mil�metro");
		System.out.println(" CM  - Cent�metro");
		System.out.println(" DM  - Dec�metro");
		System.out.println("  M  - Metro");
		System.out.println(" DAM - Dec�metro");
		System.out.println(" HM  - Hect�metro");
		System.out.println(" KM  - Quil�metros");
		System.out.println(" AL  - Anos Luz");
		System.out.println(" ML  - Milhas");
		System.out.println(" JD  - Jardas");
		System.out.println(" PE  - P�s");
		System.out.println(" PL  - Polegadas");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = calc.UMedida(unidade);//Chamando o resultado de UMedida
		
		double mFinal = calc.dMetros(emMetros, fator);
		
		fUnidade = calc.UName(unidade);
		
		System.out.println("Sua medida em "+fUnidade+" �: " + calc.arredondar(mFinal));
		
	}
	
}
