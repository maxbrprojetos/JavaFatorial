
public class Fatorial {
	public static void main(String [] args){
		int fatorial;
		int contador = -1;
		int valorFatorial;
		int multiplicador;
		int contadorInterno = -1;
		
		for(int n = 1; n <= 10; n++){
			contador = 1;
			valorFatorial = n;
			contador = n;
			multiplicador = n;
			
			do{
				valorFatorial = valorFatorial * multiplicador;
				multiplicador = multiplicador - 1;
				contador = contador - 1;
			}while(contador >= 1);
			
			contadorInterno = contadorInterno + 1;
			System.out.println("O fatorial de " + n + " é ("+contadorInterno +"!)" +n+ "="+ valorFatorial);
		}
	}

}
