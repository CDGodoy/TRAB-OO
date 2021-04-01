import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculos {
	
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
	

	public String arredondar(double medida) { //Classe de arredondamento
		DecimalFormat df = new DecimalFormat("0.00000");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		return df.format(medida);
	}
	
	
	public double pMetros(double medida, double fator) {
		return (medida*fator);
	}
	
	
	public double dMetros(double medida, double fator) {
		return (medida/fator);
	}
	public double CTPC (String unidade, double medida) {
		if(unidade.equals("C")) {
			return medida;
		}
		if(unidade.equals("F")) {
			return ((medida-32)/1.8);
		}
		if(unidade.equals("K")) {
			return medida-273.15;
		}
		return 0;
	}
	public double CTDC (String unidade, double medida) {
		if(unidade.equals("C")) {
			return medida;
		}
		if(unidade.equals("F")) {
			return 1.8*medida+32;
		}
		if(unidade.equals("K")) {
			return medida+273.15;
		}
		return 0;
	}
	
	public double UMedida (String unidade) {
		if(unidade.equals("KM") || unidade.equals("KG")) {
			return KM_P_MT;
		}
		if(unidade.equals("HM") || unidade.equals("HG")) {
			return HM_P_MT;
		}
		if(unidade.equals("DAM") || unidade.equals("DAG")) {
			return DAM_P_MT;
		}
		if(unidade.equals("M") || unidade.equals("G")) {
			return 1;
		}
		if(unidade.equals("DM") || unidade.equals("DG")) {
			return DM_P_MT;
		}
		if(unidade.equals("CM") || unidade.equals("CG")) {
			return CM_P_MT;
		}
		if(unidade.equals("MM") || unidade.equals("MG")) {
			return MM_P_MT;
		}
		if(unidade.equals("UM")) {
			return UM_P_MT;
		}
		if(unidade.equals("ML")) {
			return ML_P_MT;
		}
		if(unidade.equals("JD")) {
			return JD_P_MT;
		}
		if(unidade.equals("PE")) {
			return PE_P_MT;
		}
		if(unidade.equals("PL")) {
			return PL_P_MT;
		}
		if(unidade.equals("AL")) {
			return AL_P_MT;
		}
		
		return 0;
	}
	
	public String UName(String unidade) {
		if(unidade.equals("KM")) {
			return "Kilômetros";
		}
		if(unidade.equals("HM")) {
			return "Hectâmetros";
		}
		if(unidade.equals("DAM")) {
			return "Decâmetros";
		}
		if(unidade.equals("M")) {
			return "Metros";
		}
		if(unidade.equals("DM")) {
			return "Decímetros";
		}
		if(unidade.equals("CM")) {
			return "Centrímetros";
		}
		if(unidade.equals("MM")) {
			return "Milímetros";
		}
		if(unidade.equals("UM")) {
			return "Micrômetros";
		}
		if(unidade.equals("ML")) {
			return "Milhas";
		}
		if(unidade.equals("JD")) {
			return "Jardas";
		}
		if(unidade.equals("PE")) {
			return "Pés";
		}
		if(unidade.equals("PL")) {
			return "Polegadas";
		}
		if(unidade.equals("AL")) {
			return "Anos luz";
		}
		
		return null;
	}
	
}

