import java.util.Scanner; //leitura de dados

public class principal {
	static Scanner input = new Scanner(System.in);
	
	static cArea area = new cArea();
	//static cDistancia distancia = new cDistancia();
	//static cMassa massa = new cMassa();
	//static cTemperatura temperatura = new cTemperatura();
	//static cVolume volume = new cVolume();
	
	public static void main(String[] args) {
		int opcoesMenu;
		float medida;
		do{
	        System.out.println("============================================");
	        System.out.println("SEJA BEM VINDO AO SUPER CONVERSOR DE MEDIDAS");
	        System.out.println("============================================");
	        
	        System.out.print("Insira o valor da medida a ser convertida: ");
	        medida = input.nextFloat();
	        
	        System.out.println("Qual tipo de unidade de medida você inseriu? ");
	        System.out.println("(1) Distância");
	        System.out.println("(2) Área");
	        System.out.println("(3) Volume");
	        System.out.println("(4) Massa");
	        System.out.println("(5) Temperatura");
	        System.out.println("(6) Finalizar programa");
	        opcoesMenu = input.nextInt();
	     
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
	        	System.out.print("Obrigado por utiliza-lo. :D \n");
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

