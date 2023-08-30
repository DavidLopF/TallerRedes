public class mainfibonacci {

    // public static int fibonacci(int n) {
    // long siguiente =1, actual = 0, temporal = 0;

    // for (int i = 0; i < n; i++) {
    // temporal = siguiente;
    // siguiente = siguiente + actual;
    // actual = temporal;
    // }
    // return (int) actual;

    // }

    // optimo
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        int n = 1000;
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            fibonacci(10000);
        }

        System.out.println("Tiempo de ejecucion: " + (System.currentTimeMillis() - startTime) + " milisegundos");

    }
}