package factorialCapsaNegre;

public class Factorial_capsa_negra {

    private static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int suma(int a,int b){
    	return a + b;
    }

    public static void main(String[] args){
        System.out.println(factorial(3));
    }
}
