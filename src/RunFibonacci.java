
public class RunFibonacci {

	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		int aux1 = 1;
		int aux2 = 1;
		int resultado = 1;
		
		if (!(numero < 2)) {
			for (int i = 2; i < numero; i++) {
				resultado = aux1 + aux2;
				aux2 = aux1;
				aux1 = resultado;
				
			}
		}
		
		System.out.println(String.valueOf(resultado));
	}

}
