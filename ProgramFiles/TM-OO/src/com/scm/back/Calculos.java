package com.scm.back;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Contém todos os cálculos base para a conversão de medidas
 * @author Carlos Daniel de Godoy Barros Nascimento & José Luís Ramos Teixeira
 */
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
	
/**
 * Arredonda os valores
 * @param medida
 * @return medida com 5 casas decimais arredondado para cima
 */
	public String arredondar(double medida) { //Classe de arredondamento
		DecimalFormat df = new DecimalFormat("0.00000");//000000000");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		return df.format(medida);
	}
	
	/**
	 * Realiza a conversão de qualquer medida para metros
	 * @param medida de origem
	 * @param fator de conversão
	 * @return resultado da multiplicação de medida de origem com o valor de conversão para metros
	 */
	public double pMetros(double medida, double fator) {
		return (medida*fator);
	}
	
	/**
	 * 
	 * @param medida em metros (após passar pelo método @see {@link pMetros}
	 * @param fator de conversão
	 * @return resultado da divisão de medida em metros com o valor de conversão para a unidade destino
	 */
	public double dMetros(double medida, double fator) {
		return (medida/fator);
	}
	
	/**
	 * Realiza a conversão de qualquer unidade de temperatura para Celsius
	 * @param unidade A unidade de origem da medida a ser convertida
	 * @param medida O valor da medida de origem 
	 * @return medida convertida para Celsius
	 */
	public double CTPC (String unidade, double medida) {
		if(unidade.equals("°C - Celsius")) {
			return medida;
		}
		if(unidade.equals("°F - Fahrenheit")) {
			return ((medida-32)/1.8);
		}
		if(unidade.equals("K - Kelvin")) {
			return medida-273.15;
		}
		return 0;
	}
	
	/**
	 * Realiza a conversão de Celsius para qualquer unidade de temperatura 
	 * @param unidade A unidade de destino da medida a ser convertida
	 * @param medida O valor da medida em Celsius 
	 * @return medida convertida para destino
	 */
	public double CTDC (String unidade, double medida) {
		if(unidade.equals("°C - Celsius")) {
			return medida;
		}
		if(unidade.equals("°F - Fahrenheit")) {
			return 1.8*medida+32;
		}
		if(unidade.equals("K - Kelvin")) {
			return medida+273.15;
		}
		return 0;
	}
	
	/**
	 * Define o fator de conversão; Todas as unidades de medida podem ser convertidas para metros ou de metros, 
	 * então é definida a unidade central para metros, assim jogando todas as conversões para metros e depois convertendo de metros para outras unidades
	 * @param unidade A unidade escolhida pelo usuário
	 * @return fator de conversão com a medida "Central" em metros
	 */
	public double UMedida (String unidade) {

		if(unidade.equals("KM-Quilometros") || unidade.equals("KM-Quilometros quadrados") || unidade.equals("KM-Quilometros cubicos") || unidade.contentEquals("kg - Quilogramas")) {
			return KM_P_MT;
		}
		if(unidade.equals("HM-Hectametros") || unidade.equals("HM-Hectametros quadrados") || unidade.equals("HM-Hectametros cubicos") || unidade.contentEquals("hg - Hectogramas") ) {
			return HM_P_MT;
		}
		if(unidade.equals("DAM-Decametros") || unidade.equals("DAM-Decametros quadrados") || unidade.equals("DAM-Decametros cubicos") || unidade.contentEquals("dag - Decagramas") ) {
			return DAM_P_MT;
		}
		if(unidade.equals("M-Metros") || unidade.equals("M-Metros quadrados") || unidade.equals("M-Metros cubicos") || unidade.contentEquals("g - Gramas")) {
			return 1;
		}
		if(unidade.equals("DM-Decimetros") || unidade.equals("DM-Decimetros quadrados") || unidade.equals("DM-Decimetros cubicos") || unidade.contentEquals("dg - Decigramas")) {
			return DM_P_MT;
		}
		if(unidade.equals("CM-Centimetros") || unidade.equals("CM-Centimetros quadrados") || unidade.equals("CM-Centimetros cubicos") || unidade.contentEquals("cg - Centigramas")) {
			return CM_P_MT;
		}
		if(unidade.equals("MM-Milimetros") || unidade.equals("MM-Milimetros quadrados") || unidade.equals("MM-Milimetros cubicos") || unidade.contentEquals("mg - Miligramas")) {
			return MM_P_MT;
		}
		if(unidade.equals("UM-Micrometros") || unidade.equals("UM-Micrometros quadrados") || unidade.equals("UM-Micrometros cubicos")) {
			return UM_P_MT;
		}
		if(unidade.equals("ML-Milhas")) {
			return ML_P_MT;
		}
		if(unidade.equals("JD-Jardas")) {
			return JD_P_MT;
		}
		if(unidade.equals("PE-Pes")) {
			return PE_P_MT;
		}
		if(unidade.equals("PL-Polegadas")) {
			return PL_P_MT;
		}
		if(unidade.equals("AL-Anos_Luz")) {
			return AL_P_MT;
		}
		
		return 0;
	}
	
	}
	

