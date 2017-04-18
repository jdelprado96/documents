package factorialCapsaNegre;

public class Factorial_capsa_negra {

	private static int factorial(int n){
		int res=0;
		if(n == 0 || n == 1){
			return 1;
		}
		for(int i=n; i>=n; i--) //Se realiza la iteracion mientras i sea menor o igual a n se entrara al ciclo y se realizara la operacion ya despues se imprime el resultado del factorial
			res=res*i;

		return n * factorial(n - 1);
	}

	@SuppressWarnings("unused")
	private static int suma(int a,int b){
    	return a + b;
    }


	public static void main(String[] args){
		System.out.println(factorial(3));
	}

}
