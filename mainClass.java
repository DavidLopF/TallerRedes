import java.util.ArrayList;

public class mainClass {


    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primosEficientes(int tope) {
        ArrayList<Integer> primos = new ArrayList<Integer>();
        for (int i = 2; i <= tope; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    public static ArrayList<Integer> primosNoEficientes(int tope) {
        ArrayList<Integer> primos = new ArrayList<Integer>();
        for (int i = 2; i <= tope; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos.add(i);
            }
        }
        return primos;
    }

    public static void main(String[] args) {
        int tope = 1000000;
        //calcular tiempo de ejecucion en milisegundos de primosEficientes
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> primosNoEficientes = primosEficientes(tope);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Tiempo de ejecucion de primosEficientes: " + duration + " milisegundos");
    }
   
    
}
