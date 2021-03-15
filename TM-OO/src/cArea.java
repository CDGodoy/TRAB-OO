import java.util.Scanner;

public class cArea {
	Scanner input = new Scanner(System.in);
	public void calculando(){
		
		System.out.print("===============\n");
    	System.out.print("   (1) Área \n");
    	System.out.print("===============\n");
		System.out.println("Okay, vamos calcular uma área.");
		
		System.out.println("Qual unidade de área você utilizou?");
		System.out.println(" (1) Micrometros quadrados");
		System.out.println(" (2) Milímetros quadrados");
		System.out.println(" (3) Centímetros quadrados");
		System.out.println(" (4) Decímetros quadrados");
		System.out.println(" (5) Metros quadrados");
		System.out.println(" (6) Decâmetros quadrados");
		System.out.println(" (7) Hectâmetros quadrados");
		System.out.println(" (8) Quilômetros quadrados");
		System.out.println(" (9) Hectares quadrados");
		
		System.out.print("Insira a opção escolhida: ");
		int escolha = input.nextInt();
	}
}

	