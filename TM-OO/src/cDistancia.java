import java.util.Scanner;

public class cDistancia {

	static Scanner input = new Scanner(System.in);
	
	final private double KM_P_MT = 1000; //KILOMETRO
	final private double HM_P_MT = 100; //HECTAMETRO
	final private double DAM_P_MT = 10; //DECAMETRO
	final private double DM_P_MT = 0.1; //DECIMETRO
	final private double CM_P_MT = 0.01; //CENTIMETRO
	final private double MM_P_MT = 0.001; //MILIMETRO
	final private double UM_P_MT = 0.0001; //MICROMETRO
	final private double ML_P_MT = 1609.344; //MILHA
	final private double JD_P_MT = 0.9144; //JARDAS
	final private double PE_P_MT = 0.3048; //PES (FIFA É MELHOR)
	final private double PL_P_MT = 0.0254; //POLEGADAS
	final private double AL_P_MT = 94605284*(Math.pow(10,15)); //ANOS LUZ
	
	private double fator;
	
	public cDistancia(String unidade) { //Método construtor
		if(unidade.equals("KM")) {
			fator = KM_P_MT;
		}
		if(unidade.equals("HM")) {
			fator = HM_P_MT;
		}
		if(unidade.equals("DAM")) {
			fator = DAM_P_MT;
		}
		if(unidade.equals("DM")) {
			fator = DM_P_MT;
		}
		if(unidade.equals("CM")) {
			fator = CM_P_MT;
		}
		if(unidade.equals("MM")) {
			fator = MM_P_MT;
		}
		if(unidade.equals("UM")) {
			fator = UM_P_MT;
		}
		if(unidade.equals("ML")) {
			fator = ML_P_MT;
		}
		if(unidade.equals("JD")) {
			fator = JD_P_MT;
		}
		if(unidade.equals("PE")) {
			fator = PE_P_MT;
		}
		if(unidade.equals("pl")) {
			fator = PL_P_MT;
		}
		if(unidade.equals("AL")) {
			fator = AL_P_MT;
		}
	}
	
	public double pMetros(double medida) { //Método para metros
		return (medida * fator);
	}
	
	public double dMetros(double medida) { //Método de metros para
		return (medida / fator);
	}
	
	public void calculando() {
//		System.out.print("===============\n");
//    	System.out.print("   (1) Distância \n");
//    	System.out.print("===============\n");
//		System.out.println("Okay, vamos converter uma medida de distância.");
//		
//		System.out.println("Qual unidade de medida você utilizou?");
//		System.out.println(" UM  - Micrometro");
//		System.out.println(" MM  - Milímetro");
//		System.out.println(" CM  - Centímetro");
//		System.out.println(" DM  - Decímetro");
//		System.out.println("  M  - Metro");
//		System.out.println(" DAM - Decâmetro");
//		System.out.println(" HM  - Hectâmetro");
//		System.out.println(" KM  - Quilômetros");
//		System.out.println(" AL  - Anos Luz");
//		System.out.print("Insira a opção escolhida: ");
//		String unidade = input.nextLine().toUpperCase().trim();
//		

	}
	
}
