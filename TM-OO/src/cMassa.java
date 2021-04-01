import java.util.Scanner;


public class cMassa {
	String unidade, fUnidade;
	static Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();
	
	private double fator;
	
	public void calculando(double medida) {
		System.out.print("=====================\n");
    	System.out.print("   (3) Massa \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de distância.");
		
		System.out.println("Qual unidade de medida você utilizou?");
		System.out.println(" Mg  - Milígramas");
		System.out.println(" Cg  - Centígramas");
		System.out.println(" Dg  - Decígramas");
		System.out.println("  g  - gramas");
		System.out.println(" DAg - Decâgramas");
		System.out.println(" Hg  - Hectâgramas");
		System.out.println(" Kg  - Quilôgramas");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		fator = calc.UMedida(unidade); //Chamando o resultado de UMedida
		double emMetros = calc.pMetros(medida, fator);
		
		System.out.println("Qual unidade de medida você deseja?");
		System.out.println(" Mg  - Milígramas");
		System.out.println(" Cg  - Centígramas");
		System.out.println(" Dg  - Decígramas");
		System.out.println("  g  - gramas");
		System.out.println(" DAg - Decâgramas");
		System.out.println(" Hg  - Hectâgramas");
		System.out.println(" Kg  - Quilôgramas");
		System.out.print("Insira a opção escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
		
		fator = calc.UMedida(unidade);//Chamando o resultado de UMedida
		
		double mFinal = calc.dMetros(emMetros, fator);
		
		fUnidade = calc.UName(unidade);
		
		System.out.println("Sua medida em "+fUnidade+" é: " + calc.arredondar(mFinal));
		
	}
}
