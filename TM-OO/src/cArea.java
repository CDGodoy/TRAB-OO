import java.util.Scanner;

public class cArea {
	Scanner input = new Scanner(System.in);
	public void calculando(){
		
		System.out.print("===============\n");
    	System.out.print("   (1) �rea \n");
    	System.out.print("===============\n");
		System.out.println("Okay, vamos calcular uma �rea.");
		
		System.out.println("Qual unidade de �rea voc� utilizou?");
		System.out.println(" (1) Micrometros quadrados");
		System.out.println(" (2) Mil�metros quadrados");
		System.out.println(" (3) Cent�metros quadrados");
		System.out.println(" (4) Dec�metros quadrados");
		System.out.println(" (5) Metros quadrados");
		System.out.println(" (6) Dec�metros quadrados");
		System.out.println(" (7) Hect�metros quadrados");
		System.out.println(" (8) Quil�metros quadrados");
		System.out.println(" (9) Hectares quadrados");
		
		System.out.print("Insira a op��o escolhida: ");
		int escolha = input.nextInt();
	}
}

	