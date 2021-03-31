import java.util.Scanner; //leitura de dados

public class principal {

	static Scanner input = new Scanner(System.in);
	
	static cDistancia dist = new cDistancia();
	static cArea area = new cArea();
	static ProgramMenu menu = new ProgramMenu();
	static cVolume volume = new cVolume();
	//static cMassa massa = new cMassa();
	//static cTemperatura temperatura = new cTemperatura();

	
	public static void main(String[] args) {
		int opcoesMenu;
		double medida;
		String unidade;
		do{
			menu.InsMedida(); //Chamando exibição de inserção de medida
			medida = input.nextDouble();
			menu.TypeSelect();//Chamando exibição de inserção de tipo medida
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
	    		dist.calculando(medida);
	            break;
	        case 3 : //___________________________________________ Opcao 3 do Menu
	            break;
	        case 4 : //___________________________________________ Opcao 4 do Menu
	        	volume.calculando(medida);
	            break;
	        case 5 : //___________________________________________ Opcao 5 do Menu
	            break;
	        case 6 : //___________________________________________ Opcao 6 do Menu
	        	menu.FinalMenu();
	            break;
	       
	        }
	        
	    }while(opcoesMenu != 6);


	}
}

