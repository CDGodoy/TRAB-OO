import java.util.Scanner;

public class cVolume {
	String unidade, fUnidade;
	static Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();
	
	private double fator;
	
	public void calculando(double medida) {
    	System.out.print("=====================\n");
    	System.out.print("   (4) VOLUME \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de �rea.");
		
		System.out.println("Qual unidade de medida voc� utilizou?");
		System.out.println(" UM  - Micrometros c�bicos");
		System.out.println(" MM  - Mil�metros c�bicos");
		System.out.println(" CM  - Cent�metros c�bicos");
		System.out.println(" DM  - Dec�metros c�bicos");
		System.out.println("  M  - Metros c�bicos");
		System.out.println(" DAM - Dec�metros c�bicos");
		System.out.println(" HM  - Hect�metros c�bicos");
		System.out.println(" KM  - Quil�metros c�bicos");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = Math.pow(calc.UMedida(unidade), 3); //Chamando o resultado de UMedida ao cubo
		
		double emMetros = calc.pMetros(medida, fator); //Calculando da unidade inserida para Metros
		
		System.out.println("Qual unidade de medida voc� deseja??");
		System.out.println(" UM  - Micrometros c�bicos");
		System.out.println(" MM  - Mil�metros c�bicos");
		System.out.println(" CM  - Cent�metros c�bicos");
		System.out.println(" DM  - Dec�metros c�bicos");
		System.out.println("  M  - Metros c�bicos");
		System.out.println(" DAM - Dec�metros c�bicos");
		System.out.println(" HM  - Hect�metros c�bicos");
		System.out.println(" KM  - Quil�metros c�bicos");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = Math.pow(calc.UMedida(unidade), 3);//Chamando o resultado de UMedida ao cubo
		
		double mFinal = calc.dMetros(emMetros, fator); //Calculando de Metros para a unidade desejada
		fUnidade = calc.UName(unidade);
		System.out.println("Sua medida em "+fUnidade+" c�bicos �: " + calc.arredondar(mFinal));
		
	}

}
