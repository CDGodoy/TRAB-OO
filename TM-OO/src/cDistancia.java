import java.util.Scanner;

public class cDistancia {

	static Scanner input = new Scanner(System.in);
	//DEFININDO UNIDADES
	//Elas estão públicas pois 
	final public double KM_P_MT = 1000; //KILOMETRO
	final public double HM_P_MT = 100; //HECTAMETRO
	final public double DAM_P_MT = 10; //DECAMETRO
	final public double DM_P_MT = 0.1; //DECIMETRO
	final public double CM_P_MT = 0.01; //CENTIMETRO
	final public double MM_P_MT = 0.001; //MILIMETRO
	final public double UM_P_MT = 0.0001; //MICROMETRO
	final public double ML_P_MT = 1609.344; //MILHA
	final public double JD_P_MT = 0.9144; //JARDAS
	final public double PE_P_MT = 0.3048; //PES (FIFA É MELHOR)
	final public double PL_P_MT = 0.0254; //POLEGADAS
	final public double AL_P_MT = 94605284*(Math.pow(10,15)); //ANOS LUZ
	
	private double fator;
	
	public cDistancia(String unidade) { //AQUI ESTAMOS DEFININDO A UNIDADE DE MEDIDA QUE O USUÁRIO UTILIZOU
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
		if(unidade.equals("PL")) {
			fator = PL_P_MT;
		}
		if(unidade.equals("AL")) {
			fator = AL_P_MT;
		}
	}
	
	public double pMetros(double medida) { //Método para metros
		return (medida * fator); //AQUI CONVERTEMOS O VALOR INSERIDO POR ELE PARA METROS
	}
	
	public void dMetros(double medida) { //Método de metros
		//AQUI CONVERTEMOS DE METROS PARA TODAS AS UNIDADES DE MEDIDAS ACEITAS PELO NOSSO PROGRAMA
		System.out.println("==========RESULTADOS==========");
		System.out.println("\nKilômetros: " + (medida/KM_P_MT));
		System.out.println("\nHectâmetros: " + (medida/HM_P_MT));
		System.out.println("\nDecâmetros: " + (medida/DAM_P_MT));
		System.out.println("\nmetros: " + medida);
		System.out.println("\nDecimetros: " + (medida/DM_P_MT));
		System.out.println("\nCentimetros: " + (medida/CM_P_MT));
		System.out.println("\nMilimetros: " + (medida/MM_P_MT));
		System.out.println("\nMicrometros: " + (medida/UM_P_MT));
		System.out.println("\nMilhas: " + (medida/ML_P_MT));
		System.out.println("\nJardas: " + (medida/JD_P_MT));
		System.out.println("\nPés: " + (medida/PE_P_MT));
		System.out.println("\nPolegadas: " + (medida/PL_P_MT));
		System.out.println("\nAnos luz: " + (medida/AL_P_MT));
		
	}
	
	
}
