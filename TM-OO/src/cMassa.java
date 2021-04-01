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
		System.out.println("Okay, vamos converter uma medida de dist�ncia.");
		
		System.out.println("Qual unidade de medida voc� utilizou?");
		System.out.println(" Mg  - Mil�gramas");
		System.out.println(" Cg  - Cent�gramas");
		System.out.println(" Dg  - Dec�gramas");
		System.out.println("  g  - gramas");
		System.out.println(" DAg - Dec�gramas");
		System.out.println(" Hg  - Hect�gramas");
		System.out.println(" Kg  - Quil�gramas");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = calc.UMedida(unidade); //Chamando o resultado de UMedida
		double emMetros = calc.pMetros(medida, fator);
		
		System.out.println("Qual unidade de medida voc� deseja?");
		System.out.println(" Mg  - Mil�gramas");
		System.out.println(" Cg  - Cent�gramas");
		System.out.println(" Dg  - Dec�gramas");
		System.out.println("  g  - gramas");
		System.out.println(" DAg - Dec�gramas");
		System.out.println(" Hg  - Hect�gramas");
		System.out.println(" Kg  - Quil�gramas");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		fator = calc.UMedida(unidade);//Chamando o resultado de UMedida
		
		double mFinal = calc.dMetros(emMetros, fator);
		
		fUnidade = calc.UName(unidade);
		
		System.out.println("Sua medida em "+fUnidade+" �: " + calc.arredondar(mFinal));
		
	}
}
