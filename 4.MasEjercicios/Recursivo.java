import java.util.Scanner;

public class Recursivo {
    
    public static int collatz (int n){
        int resultado = 0;
        if (n == 1) {
            return 1;
        }else if (n%2 == 0) {
            System.out.print(n/2 + " ");
            resultado = collatz(n/2);
            return n/2;
        }else if (n%2 != 0) {
            System.out.print(n*3+1 + " ");
            resultado = collatz (n*3+1);
            return n*3+1;
        }
        System.out.println("");
        return resultado;
    }
    
    public static void main(String[] args) {
        /**
         * EJERCICIO RECURSIVO, INVESTIGAR. 
         * Considere siguiente proceso repetitivo para un número entero dado: 
         * si el número es 1, el proceso termina. De lo contrario, si es par se 
         * divide entre 2, y si es impar se multiplica por 3 y se le suma 1. 
         * Por ejemplo: si empezamos con 6 obtendremos la sucesión de números 
         * 6, 3, 10, 5, 16, 8, 4, 2, 1. 
         * La conjetura de Collatz dice que, a partir de cualquier número inicial,
         * la sucesión obtenida siempre termina en 1. Escriba un programa que 
         * permita verificar la conjetura de Collatz para cualquier entero dado,
         * y que imprima la secuencia correspondiente.
         */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca número para comenzar la sucesión de Collatz");
        
        collatz(scan.nextInt());
        
        
    }
    
}
