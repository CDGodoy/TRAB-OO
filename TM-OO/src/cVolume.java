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
		
		fator = Math.pow(calc.UMedida(unidade), 3); //Chamando o resultado de UMedida ao cubo
		
		double emMetros = calc.pMetros(medida, fator); //Calculando da unidade inserida para Metros
		
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
		
		fator = Math.pow(calc.UMedida(unidade), 3);//Chamando o resultado de UMedida ao cubo
		
		double mFinal = calc.dMetros(emMetros, fator); //Calculando de Metros para a unidade desejada
		fUnidade = calc.UName(unidade);
		System.out.println("Sua medida em "+fUnidade+" cúbicos é: " + calc.arredondar(mFinal));
		
	}

}
