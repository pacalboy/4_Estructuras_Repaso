import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class For_Correccion {

    public static void main(String[] args) {
        /**
         * Ej 0 A partir de dos números dados por el usuario, mostrar todos los
         * valores intermedios. No incluir los valores dados. Ejemplo: 5 y 9
         * imprime 678
         */
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a>b){ //Intercambio números en caso de que estén al revés
            int aux = a;
            a = b;
            b = aux;
        }
        
        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
        }

        
        
        /**
         * Ej 1: Diseña un programa que para dos números dados, muestre todos
         * los valores intermedios que sean pares.
         */
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(c>d){ //Intercambio números en caso de que estén al revés
            int aux = c;
            c = d;
            d = aux;
        }
        
        if( c%2 == 0 ){
            c++;
        }
        
        for(int i=c+1 ; i<d ; i=i+2){
            System.out.println(i);
        }
        
        
        /**
         * Ej 2. Crea una alarma. El usuario introducirá un número (en segundos)
         * que representa cuánto tiempo quiere que espere la máquina hasta que
         * le avise de que ha transcurrido el tiempo indicado. Cada segundo que
         * pase mostrará un mensaje que diga "Han pasado x segundos". Utiliza el
         * método Thread.sleep( <nanosegundos a esperar> ); que sirve para
         * pausar la ejecución de un programa durante el tiempo indicado en
         * nanosegundos. (1segundo = 1000 nanosegundos)
         */
        int s = sc.nextInt();
        
        for(int i=1 ; i<=s ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(For_Correccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Han pasado " + i + "segundos");
        }
        System.out.println("BOOOOM");
        
        
        /**
         * Ej 3: Diseña un programa para que dado un número entero que indique
         * el usuario, muestre su tabla de multiplicar.  
         */
        int num = sc.nextInt();
        for(int i=0 ; i<11 ; i++){
            System.out.println(num + " * " + i + " = " + i*num);
        }
        
         /** 
         * Ej 4: Crea un programa que lea una cadena por teclado, un caracter y
         * un número entero. El programa debe generar una nueva cadena que esté
         * formada por la cadena inicial y el carácter tantas veces como indique
         * el número entero. Ejemplo [ "Hola", '!', 5 ] -> "Hola!!!!!". Ejemplo:
         * [ "Boom". 'm', 3] -> "Boommmm"
         */
         System.out.println("Introduce cadena: ");
         String cadena = sc.next();
         System.out.println("Introduce caracter: ");
         char caracter = sc.next().charAt(0);
         System.out.println("Introduce entero: ");
         int entero = sc.nextInt();
         
         for(int i=0 ; i<entero ; i++){
             cadena += caracter;
         }
         System.out.println("La cadena resultante es: " + cadena);
         
         
         /**
         * Ej 5: Crea un programa que a partir de esta lista: int
         * telefonosMaria[ ] = {671711711, 912121212, 789789789, 654654678};
         * Genere una cadena como el siguiente: (finalmente muestra la cadena
         * generada) "Teléfonos de María: * 671711711 ** * 912121212 ** *
         * 789789789 ** * 654654678 ** "
         */
         int telefonosMaria[] = {671711711, 912121212, 789789789, 654654678};
         String mensaje = "Teléfonos de María: \n";
         for(int elemento : telefonosMaria){
             mensaje += "** " + elemento + " **\n";
         }
         System.out.println(mensaje);
    }
    
}
