import java.util.Scanner;

public class cTemperatura {
	String unidade, fUnidade;
	static Scanner input = new Scanner(System.in);
	
	static Calculos calc = new Calculos();
	
	private double fator;
	
	public void calculando(double medida) {
		System.out.print("=====================\n");
    	System.out.print("   (5) Temperatura \n");
    	System.out.print("=====================\n");
		System.out.println("Okay, vamos converter uma medida de temperatura.");
		
		System.out.println("Qual unidade de medida voc� utilizou?");
		System.out.println(" �C  - Graus Celsius");
		System.out.println(" �F  - Graus Farenheint");
		System.out.println("  K  - Kelvin");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		double emCelsius = calc.CTPC(unidade, medida);
		
		System.out.println("Qual unidade de medida voc� deseja?");
		System.out.println(" �C  - Graus Celsius");
		System.out.println(" �F  - Graus Farenheint");
		System.out.println("  K  - Kelvin");
		System.out.print("Insira a op��o escolhida: ");
		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
		
		double tempFinal = calc.CTDC(unidade, emCelsius);
		
		System.out.println("Sua medida �: " + calc.arredondar(tempFinal));
		
}
}
