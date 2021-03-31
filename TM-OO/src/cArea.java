import java.util.Scanner;

public class cArea {
	
	String unidade, fUnidade;
	Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();

	private double fator;

	public void calculando(double medida){
		
    	System.out.print("=====================\n");
    	System.out.print("   (1) �REA \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de �rea.");
		
		System.out.println("Qual unidade de medida voc� utilizou?");
		System.out.println(" UM  - Micrometros quadrados");
		System.out.println(" MM  - Mil�metros quadrados");
		System.out.println(" CM  - Cent�metros quadrados");
		System.out.println(" DM  - Dec�metros quadrados");
		System.out.println("  M  - Metros quadrados");
		System.out.println(" DAM - Dec�metros quadrados");
		System.out.println(" HM  - Hect�metros quadrados");
		System.out.println(" KM  - Quil�metros quadrados");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = Math.pow(calc.UMedida(unidade), 2);
		
		double emMetros = calc.pMetros(medida, fator);//Calculando da unidade inserida para Metros
		
		System.out.println("Qual unidade de medida voc� deseja??");
		System.out.println(" UM  - Micrometros quadrados");
		System.out.println(" MM  - Mil�metros quadrados");
		System.out.println(" CM  - Cent�metros quadrados");
		System.out.println(" DM  - Dec�metros quadrados");
		System.out.println("  M  - Metros quadrados");
		System.out.println(" DAM - Dec�metros quadrados");
		System.out.println(" HM  - Hect�metros quadrados");
		System.out.println(" KM  - Quil�metros quadrados");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = Math.pow(calc.UMedida(unidade), 2);
		
		fUnidade = calc.UName(unidade);
		
		double mFinal = calc.dMetros(emMetros, fator); //Calculando de Metros para a unidade desejada
		System.out.println("Sua medida em "+fUnidade+" �: " + calc.arredondar(mFinal)); //Exibindo o resultado arredondado
		
	}

}


	