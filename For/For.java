import java.util.Scanner;

public class For {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner scan = new Scanner (System.in);
        
        /*
        * Ej 0. A partir de dos números dados por el usuario, mostrar todos los 
        * valores intermedios. No incluir los valores dados. Ejemplo: 5 y 9 imprime 678
        */
        int inicio = 0;
        int fin = 0;        
        boolean ordenCorrecto = false;
        while (!ordenCorrecto) {
            System.out.println("Introduzca primer número y segundo "
                    + "(el segundo ha de ser mayor)");
            inicio = scan.nextInt();
            fin = scan.nextInt();
            ordenCorrecto = inicio < fin;
        }
        
        for (int i = inicio + 1; i < fin; i++) {
            System.out.println(i);
        }

        /*
        * Ej 1: Diseña un programa que para dos números dados, muestre todos los
        * valores intermedios que sean pares.
        */
        int iniPar = 0;
        int finPar = 0;        
        boolean ordCorrecPar = false;
        while (!ordCorrecPar) {
            System.out.println("\nPARES\nIntroduzca primer número y segundo "
                    + "(el segundo ha de ser mayor)");
            iniPar = scan.nextInt();
            finPar = scan.nextInt();
            ordCorrecPar = iniPar < finPar;
        }
        if (iniPar%2 != 0) {
                iniPar -=1;
            }
        for (int i = iniPar+2; i < finPar; i=i+2) {
            System.out.println(i);
        }
        
        /*
        * Ej 2. Crea una alarma. El usuario introducirá un número (en segundos) 
        * que representa cuánto tiempo quiere que espere la máquina hasta que le
        * avise de que ha transcurrido el tiempo indicado. Cada segundo que pase
        * mostrará un mensaje que diga "Han pasado x segundos".  
        * Utiliza el método Thread.sleep( <nanosegundos a esperar> );  que sirve
        * para pausar la ejecución de un programa durante el tiempo indicado en 
        * nanosegundos. (1segundo = 1000 nanosegundos)
        */
        boolean segundosNegativos = true;
        int tiempo = 0;
        while (segundosNegativos) {
            System.out.println("\nIntroduzca cuántos segundos de espera (en positivo)");
            tiempo = scan.nextInt();
            segundosNegativos = tiempo < 0;
        }
        
        for (int i = 1; i <= tiempo; i++) {
            Thread.sleep(1000);
            if (i != 1){
                System.out.println("Han pasado " +i+ " segundos");
            }else
                System.out.println("Ha pasado " +i+ " segundo");
        }
        System.out.println("¡ALARMA!");
        
        
        /*
        * Ej 3: Diseña un programa para que dado un número entero que indique el
        * usuario, muestre su tabla de multiplicar. 
        */
        System.out.println("\nIntroduzca número para la tabla de multiplicar");
        int numTabla = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(numTabla + " * " + i + " = " + numTabla*i);
        }
        
        /*
        * Ej 4: Crea un programa que lea una cadena por teclado, un caracter y 
        * un número entero. El programa debe generar una nueva cadena que esté 
        * formada por la cadena inicial y el carácter tantas veces como indique 
        * el número entero. Ejemplo [ "Hola", '!', 5 ] -> "Hola!!!!!". 
        * Ejemplo:  [ "Boom". 'm', 3] -> "Boommmm"
        */
        System.out.println("\nIntroduzca una cadena, un carácter y un número");
        String cadena = scan.next();
        char caracter = scan.next().charAt(0);
        int veces = scan.nextInt();
        String nuevaCadena = cadena;
        for (int i = 0; i < veces; i++) {
            nuevaCadena += caracter;
        }
        System.out.println(cadena + '\n');

        /*
        * Ej 5: Crea un programa que a partir de esta lista: 
        * int telefonosMaria[ ] = {671711711, 912121212, 789789789, 654654678}; 
        * Genere una cadena como el siguiente: (finalmente muestra la cadena generada)      
        *     Teléfonos de María: 
        *       ** 671711711 **
        *       ** 912121212 ** 
        *       ** 789789789 ** 
        *       ** 654654678 **
        */
        int telefonosMaria[ ] = {671711711, 912121212, 789789789, 654654678};
        String nuevoTlfnosMaria [] = new String [5];
        nuevoTlfnosMaria [0] = "Teléfonos de María:";
        for (int i = 1; i < nuevoTlfnosMaria.length; i++) {
            nuevoTlfnosMaria [i] = "** "+telefonosMaria [i-1]+" **";
        }
        for (String t : nuevoTlfnosMaria) {
            System.out.println(t);
        }

    }
    
}
