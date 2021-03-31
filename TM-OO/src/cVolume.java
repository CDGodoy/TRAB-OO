import java.util.Scanner;

public class cVolume {
	String unidade, fUnidade;
	static Scanner input = new Scanner(System.in);
	
	//DEFININDO UNIDADES
	final public double KM_P_MT = 1000; //KILOMETRO
	final public double HM_P_MT = 100; //HECTAMETRO
	final public double DAM_P_MT = 10; //DECAMETRO
	final public double DM_P_MT = 0.1; //DECIMETRO
	final public double CM_P_MT = 0.01; //CENTIMETRO
	final public double MM_P_MT = 0.001; //MILIMETRO
	final public double UM_P_MT = 0.0001; //MICROMETRO
	
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
		
		mvol(unidade);
		double emMetros = pMetros(medida);
		
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
		
		mvol(unidade);
		System.out.println("Sua medida em "+fUnidade+" �: " + dMetros(emMetros));
		
	}
	
	public void mvol(String unidade) {
		if(unidade.equals("KM")) {
			fator = Math.pow(KM_P_MT, 3); //Elevando a 2, pois �rea � basicamente o quadrado de dist�ncia
			fUnidade = "Kil�metros c�bicos";
		}
		if(unidade.equals("HM")) {
			fator = Math.pow(DAM_P_MT, 3);
			fUnidade = "Hect�metros c�bicos";
		}
		if(unidade.equals("DAM")) {
			fator = Math.pow(DAM_P_MT, 3);
			fUnidade = "Dec�metros c�bicos";
		}
		if(unidade.equals("DM")) {
			fator = Math.pow(DM_P_MT, 3);
			fUnidade = "Dec�metros c�bicos";
		}
		if (unidade.equals("M")) {
			fator = 1;
			fUnidade = "Metros c�bicos";
		}
		if(unidade.equals("CM")) {
			fator = Math.pow(CM_P_MT, 3);
			fUnidade = "Cent�metros c�bicos";
		}
		if(unidade.equals("MM")) {
			fator = Math.pow(DAM_P_MT, 3);
			fUnidade = "Mil�metros c�bicos";
		}
		if(unidade.equals("UM")) {
			fator = Math.pow(UM_P_MT, 3);
			fUnidade = "Micr�metros c�bicos";
		}
	}

	public double pMetros(double medida) {
		return (medida*fator);
	}
	public double dMetros(double medida) {
		return (medida/fator);
	}

}
