package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.scm.back.*;

class TestCalculos {
	
	Random gerador = new Random();
	Calculos calc = new Calculos();

	@Test
	void testPMetros() {
		double n1 = gerador.nextDouble();
		double n2 = gerador.nextDouble();
		double res = n1*n2;
		assertEquals(calc.pMetros(n1,n2), res);
	}
	
	@Test
	void testDMetros() {
		double n1 = gerador.nextDouble();
		double n2 = gerador.nextDouble();
		double res = n1/n2;
		assertEquals(calc.dMetros(n1,n2), res);
	}
	@Test
	void testUMedida() {
		//Array com algumas das opcoes disponiveis e ordenadas da forma correta de acordo com o valor
		String[] options = {"KM-Quilometros", "HM-Hectametros", "DAM-Decametros", "M-Metros", "DM-Decimetros", "CM-Centimetros", "MM-Milimetros", "UM-Micrometros", "ML-Milhas", "JD-Jardas", "PE-Pes", "PL-Polegadas", "AL-Anos_Luz"};
		double[] numOptions = {1000, 100, 10, 1, 0.1, 0.01, 0.001, 0.0001, 1609.344, 0.9144, 0.3048, 0.0254, 94605284*(Math.pow(10,15))};
		
		int alet = gerador.nextInt(12); //Selecionando posicao aleatoria do array
		assertEquals(calc.UMedida(options[alet]), numOptions[alet]);
	}

}
