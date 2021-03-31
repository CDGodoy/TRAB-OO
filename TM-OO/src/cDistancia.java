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
	final public double PE_P_MT = 0.3048; //PES (FIFA � MELHOR)
	final public double PL_P_MT = 0.0254; //POLEGADAS
	final public double AL_P_MT = 94605284*(Math.pow(10,15)); //ANOS LUZ
	
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
		
		mDist(unidade);
		double emMetros = pMetros(medida);
		
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
		
		mDist(unidade);
		System.out.println("Sua medida em "+fUnidade+" �: " + dMetros(emMetros));
		
		
	}
	
	
	
	public void mDist(String unidade) { //AQUI ESTAMOS DEFININDO A UNIDADE DE MEDIDA QUE O USU�RIO UTILIZOU
		if(unidade.equals("KM")) {
			fator = KM_P_MT;
			fUnidade = "Kil�metros";
		}
		if(unidade.equals("HM")) {
			fator = HM_P_MT;
			fUnidade = "Hect�metros";
		}
		if(unidade.equals("DAM")) {
			fator = DAM_P_MT;
			fUnidade = "Dec�metros";
		}
		if(unidade.equals("DM")) {
			fator = DM_P_MT;
			fUnidade = "Dec�metros";
		}
		if (unidade.equals("M")) {
			fator = 1;
			fUnidade = "Metros";
		}
		if(unidade.equals("CM")) {
			fator = CM_P_MT;
			fUnidade = "Cent�metros";
		}
		if(unidade.equals("MM")) {
			fator = MM_P_MT;
			fUnidade = "Mil�metros";
		}
		if(unidade.equals("UM")) {
			fator = UM_P_MT;
			fUnidade = "Micr�metros";
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
			fUnidade = "P�s";
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
	
	public double pMetros(double medida) { //M�todo para metros
		return (medida * fator); //AQUI CONVERTEMOS O VALOR INSERIDO POR ELE PARA METROS
	}
	
	public double dMetros(double medida) { //M�todo de metros
		//AQUI CONVERTEMOS DE METROS PARA TODAS AS UNIDADES DE MEDIDAS ACEITAS PELO NOSSO PROGRAMA
		return (medida/fator);
		
	}
	
	
}
