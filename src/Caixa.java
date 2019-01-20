

public class Caixa {

	public boolean testarValorValido(int valor) {
		if(valor<=0) {
			return false;
		}
		if(valor%10==0) {
			return true;		
		}
		else {
			return false;
		}
	}
	
	public int[] emitirCedulas(int valor) {

		int cedulas[] = {0,0,0,0};
		
		if(valor/100 >0) {
		   cedulas[0]=valor/100;
		   valor = valor%100;
		}
		if(valor/50 >0) {
			cedulas[1]=valor/50;
			valor = valor%50;
		}
		if(valor/20 >0) {
			cedulas[2]=valor/20;
			valor = valor%20;
		}		
		if(valor/10 >0) {
			cedulas[3]=valor/10;
			valor = valor%10;
		}
		
		return cedulas;
	}
}
