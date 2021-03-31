import java.util.Scanner; //leitura de dados

public class principal {
	static Scanner input = new Scanner(System.in);
	
	static cArea area = new cArea();
	static ProgramMenu menu = new ProgramMenu();
	//static cMassa massa = new cMassa();
	//static cTemperatura temperatura = new cTemperatura();
	//static cVolume volume = new cVolume();
	
	public static void main(String[] args) {
		int opcoesMenu;
		double medida;
		String unidade;
		do{
			menu.InsMedida(); //Chamando exibi��o de inser��o de medida
			medida = input.nextDouble();
			menu.TypeSelect();//Chamando exibi��o de inser��o de tipo medida
	        opcoesMenu = input.nextInt();
	        input.nextLine(); //Limpar Buffer do teclado
	        while((opcoesMenu < 1) || (opcoesMenu > 6)){
	        	menu.ErroMenu();
	        	opcoesMenu = input.nextInt();
	        }

	        switch(opcoesMenu){
	        case 1 : //___________________________________________ Opcao 1 do Menu
	        	area.calculando(medida);
	            break;
	        case 2: //___________________________________________ Opcao 2 do Menu
	    		System.out.print("=====================\n");
	        	System.out.print("   (1) Dist�ncia \n");
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
	    		System.out.print("Insira a op��o escolhida: ");
	    		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
	    		
	    		cDistancia paraM = new cDistancia(unidade); //Chama o construtor cDistancia na classe cDistancia.java
	    		double emMetros = paraM.pMetros(medida); //Pede para converter para metros											
	    		
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
	    		System.out.print("Insira a op��o escolhida: ");											
	    		unidade = input.nextLine().toUpperCase().trim(); //Recebe a medida do usu�rio e deixa em mai�sculo
	    		
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
	        	System.out.print("Obrigado por utiliz�-lo. :D \n");
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

