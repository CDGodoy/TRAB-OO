import java.util.Scanner; //leitura de dados

public class principal {
	static Scanner input = new Scanner(System.in);
	
	static cArea area = new cArea();
	
	//static cMassa massa = new cMassa();
	//static cTemperatura temperatura = new cTemperatura();
	//static cVolume volume = new cVolume();
	
	public static void main(String[] args) {
		int opcoesMenu;
		double medida;
		do{
	        System.out.println("============================================");
	        System.out.println("SEJA BEM VINDO AO SUPER CONVERSOR DE MEDIDAS");
	        System.out.println("============================================");
	        
	        System.out.print("Insira o valor da medida a ser convertida: ");
	        medida = input.nextDouble();
	        
	        System.out.println("Qual tipo de unidade de medida você inseriu? ");
	        System.out.println("(1) Área");
	        System.out.println("(2) Distância");
	        System.out.println("(3) Massa");
	        System.out.println("(4) Volume");
	        System.out.println("(5) Temperatura");
	        System.out.println("(6) Finalizar programa");
	        opcoesMenu = input.nextInt();
	        input.nextLine(); //Limpar Buffer do teclado
	        while((opcoesMenu < 1) || (opcoesMenu > 6)){
	        	System.out.print("Por favor, escolha uma das opcoes(1 a 6).\n");
	        	System.out.print("Qual tipo de unidade de medida você inseriu? ");
	        	opcoesMenu = input.nextInt();
	        }

	        switch(opcoesMenu){
	        case 1 : //___________________________________________ Opcao 1 do Menu
	        	area.calculando();
	            break;
	        case 2: //___________________________________________ Opcao 2 do Menu
	    		System.out.print("=====================\n");
	        	System.out.print("   (1) Distância \n");
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
	    		System.out.print("Insira a opção escolhida: ");
	    		String unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
	    		
	    		cDistancia paraM = new cDistancia(unidade); //Chama o construtor cDistancia na classe cDistancia.java
	    													// levando junto a unidade escolhida pelo usuario
	    		double emMetros = paraM.pMetros(medida); //Pede para converter para metros											
	    		
	    		
	    		
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
	    		System.out.print("Insira a opção escolhida: ");											
	    		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usuário e deixa em maiúsculo
	    		
	    		cDistancia deM = new cDistancia(unidade);
	        	
	    		double mfinal = deM.dMetros(emMetros);
	    		
	    		System.out.println(mfinal);
	    		
	            break;
	        case 3 : //___________________________________________ Opcao 3 do Menu
	            break;
	        case 4 : //___________________________________________ Opcao 4 do Menu
	            break;
	        case 5 : //___________________________________________ Opcao 5 do Menu
	            break;
	        case 6 : //___________________________________________ Opcao 6 do Menu
	        	System.out.print("============================\n");
	        	System.out.print("   (6) Finalizar programa. \n");
	        	System.out.print("============================\n");
	        	System.out.print("Programa terminado. \n");
	        	System.out.print("Obrigado por utilizá-lo. :D \n");
	        	System.out.print("\n");
	        	System.out.print("________________________________________\n");
	        	System.out.print("|            Copyright 2021            |\n");
	        	System.out.print("|        by Carlos Daniel Godoy        |\n");
	        	System.out.print("|      & Jose Luis Ramos Teixeira      |\n");
	        	System.out.print("________________________________________\n");
	        	System.out.print("\n");
	            break;
	       
	        }
	        
	    }while(opcoesMenu != 6);


	}
}

