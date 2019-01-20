import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCaixa {

	@Test
	public void testarValorInvalido() {
		int valor=15121;
		Caixa caixa = new Caixa();
		boolean retorno = caixa.testarValorValido(valor);
		assertEquals(false,retorno);
	}
	@Test
	public void testarValorInvalidoZero() {
		int valor=0;
		Caixa caixa = new Caixa();
		boolean retorno = caixa.testarValorValido(valor);
		assertEquals(false,retorno);
	}
	
	@Test
	public void testarValorValido() {
		int valor=15120;
		Caixa caixa = new Caixa();
		boolean retorno = caixa.testarValorValido(valor);
		assertEquals(true,retorno);
	}
	
	@Test
	public void testarQuantidadeDeCedulas15110() {
		int valor=15110;
		Caixa caixa = new Caixa();
		int[] retorno = caixa.emitirCedulas(valor);
		assertEquals(151,retorno[0]);
		assertEquals(0,retorno[1]);
		assertEquals(0,retorno[2]);
		assertEquals(1,retorno[3]);
		
		System.out.println("Testando valor 15110");
		System.out.println("Foram liberadas "+retorno[0]+" cedulas de 100");
		System.out.println("Foram liberadas "+retorno[1]+" cedulas de  50");
		System.out.println("Foram liberadas "+retorno[2]+" cedulas de  20");
		System.out.println("Foram liberadas "+retorno[3]+" cedulas de  10");
		System.out.println();
	}

	@Test
	public void testarQuantidadeDeCedulas80() {
		int valor=80;
		Caixa caixa = new Caixa();
		int[] retorno = caixa.emitirCedulas(valor);
		assertEquals(0,retorno[0]);
		assertEquals(1,retorno[1]);
		assertEquals(1,retorno[2]);
		assertEquals(1,retorno[3]);
		
		System.out.println("Testando valor 80");
		System.out.println("Foram liberadas "+retorno[0]+" cedulas de 100");
		System.out.println("Foram liberadas "+retorno[1]+" cedulas de  50");
		System.out.println("Foram liberadas "+retorno[2]+" cedulas de  20");
		System.out.println("Foram liberadas "+retorno[3]+" cedulas de  10");
		System.out.println();
	}
	
	@Test
	public void testarQuantidadeDeCedulas390() {
		int valor=390;
		Caixa caixa = new Caixa();
		int[] retorno = caixa.emitirCedulas(valor);
		assertEquals(3,retorno[0]);
		assertEquals(1,retorno[1]);
		assertEquals(2,retorno[2]);
		assertEquals(0,retorno[3]);
		
		System.out.println("Testando valor 390");
		System.out.println("Foram liberadas "+retorno[0]+" cedulas de 100");
		System.out.println("Foram liberadas "+retorno[1]+" cedulas de  50");
		System.out.println("Foram liberadas "+retorno[2]+" cedulas de  20");
		System.out.println("Foram liberadas "+retorno[3]+" cedulas de  10");
		System.out.println();
	}

}
