import java.util.Scanner;

public class cDistancia {
	
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
	final public double ML_P_MT = 1609.344; //MILHA
	final public double JD_P_MT = 0.9144; //JARDAS
	final public double PE_P_MT = 0.3048; //PES (FIFA É MELHOR)
	final public double PL_P_MT = 0.0254; //POLEGADAS
	final public double AL_P_MT = 94605284*(Math.pow(10,15)); //ANOS LUZ
	
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
		
		mDist(unidade);
		double emMetros = pMetros(medida);
		
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
		
		mDist(unidade);
		System.out.println("Sua medida em "+fUnidade+" é: " + dMetros(emMetros));
		
		
	}
	
	
	
	public void mDist(String unidade) { //AQUI ESTAMOS DEFININDO A UNIDADE DE MEDIDA QUE O USUÁRIO UTILIZOU
		if(unidade.equals("KM")) {
			fator = KM_P_MT;
			fUnidade = "Kilômetros";
		}
		if(unidade.equals("HM")) {
			fator = HM_P_MT;
			fUnidade = "Hectâmetros";
		}
		if(unidade.equals("DAM")) {
			fator = DAM_P_MT;
			fUnidade = "Decâmetros";
		}
		if(unidade.equals("DM")) {
			fator = DM_P_MT;
			fUnidade = "Decímetros";
		}
		if (unidade.equals("M")) {
			fator = 1;
			fUnidade = "Metros";
		}
		if(unidade.equals("CM")) {
			fator = CM_P_MT;
			fUnidade = "Centímetros";
		}
		if(unidade.equals("MM")) {
			fator = MM_P_MT;
			fUnidade = "Milímetros";
		}
		if(unidade.equals("UM")) {
			fator = UM_P_MT;
			fUnidade = "Micrômetros";
		}
		if(unidade.equals("ML")) {
			fator = ML_P_MT;
			fUnidade = "Milhas";
		}
		if(unidade.equals("JD")) {
			fator = JD_P_MT;
			fUnidade = "Jardas";
		}
		if(unidade.equals("PE")) {
			fator = PE_P_MT;
			fUnidade = "Pés";
		}
		if(unidade.equals("PL")) {
			fator = PL_P_MT;
			fUnidade = "Polegadas";
		}
		if(unidade.equals("AL")) {
			fator = AL_P_MT;
			fUnidade = "Anos Luz";
		}
	}
	
	public double pMetros(double medida) { //Método para metros
		return (medida * fator); //AQUI CONVERTEMOS O VALOR INSERIDO POR ELE PARA METROS
	}
	
	public double dMetros(double medida) { //Método de metros
		//AQUI CONVERTEMOS DE METROS PARA TODAS AS UNIDADES DE MEDIDAS ACEITAS PELO NOSSO PROGRAMA
		return (medida/fator);
		
	}
	
	
}
