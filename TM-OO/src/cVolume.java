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
		System.out.println("Okay, vamos converter uma medida de área.");
		
		System.out.println("Qual unidade de medida você utilizou?");
		System.out.println(" UM  - Micrometros cúbicos");
		System.out.println(" MM  - Milímetros cúbicos");
		System.out.println(" CM  - Centímetros cúbicos");
		System.out.println(" DM  - Decímetros cúbicos");
		System.out.println("  M  - Metros cúbicos");
		System.out.println(" DAM - Decâmetros cúbicos");
		System.out.println(" HM  - Hectâmetros cúbicos");
		System.out.println(" KM  - Quilômetros cúbicos");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		mvol(unidade);
		double emMetros = pMetros(medida);
		
		System.out.println("Qual unidade de medida você deseja??");
		System.out.println(" UM  - Micrometros cúbicos");
		System.out.println(" MM  - Milímetros cúbicos");
		System.out.println(" CM  - Centímetros cúbicos");
		System.out.println(" DM  - Decímetros cúbicos");
		System.out.println("  M  - Metros cúbicos");
		System.out.println(" DAM - Decâmetros cúbicos");
		System.out.println(" HM  - Hectâmetros cúbicos");
		System.out.println(" KM  - Quilômetros cúbicos");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		mvol(unidade);
		System.out.println("Sua medida em "+fUnidade+" é: " + dMetros(emMetros));
		
	}
	
	public void mvol(String unidade) {
		if(unidade.equals("KM")) {
			fator = Math.pow(KM_P_MT, 3); //Elevando a 2, pois área é basicamente o quadrado de distância
			fUnidade = "Kilômetros cúbicos";
		}
		if(unidade.equals("HM")) {
			fator = Math.pow(DAM_P_MT, 3);
			fUnidade = "Hectâmetros cúbicos";
		}
		if(unidade.equals("DAM")) {
			fator = Math.pow(DAM_P_MT, 3);
			fUnidade = "Decâmetros cúbicos";
		}
		if(unidade.equals("DM")) {
			fator = Math.pow(DM_P_MT, 3);
			fUnidade = "Decâmetros cúbicos";
		}
		if (unidade.equals("M")) {
			fator = 1;
			fUnidade = "Metros cúbicos";
		}
		if(unidade.equals("CM")) {
			fator = Math.pow(CM_P_MT, 3);
			fUnidade = "Centímetros cúbicos";
		}
		if(unidade.equals("MM")) {
			fator = Math.pow(DAM_P_MT, 3);
			fUnidade = "Milímetros cúbicos";
		}
		if(unidade.equals("UM")) {
			fator = Math.pow(UM_P_MT, 3);
			fUnidade = "Micrômetros cúbicos";
		}
	}

	public double pMetros(double medida) {
		return (medida*fator);
	}
	public double dMetros(double medida) {
		return (medida/fator);
	}

}
