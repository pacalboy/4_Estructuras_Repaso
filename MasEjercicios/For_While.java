import java.util.Scanner;

public class For_While {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        /**
         * Ej 0. Crea un programa que pida caracteres hasta que se introduzca un espacio,
         * el programa imprimirá imprima ‘VOCAL’ si es una vocal y ‘NO VOCAL’ 
         * en caso contrario.
         */ 
        char caracter;
        boolean seguir = true;
        boolean vocal;
        
        while (seguir) {
            System.out.println("Introduzca caracteres (espacio para parar)");
            caracter = scan.next().toLowerCase().charAt(0);
            vocal = caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
            seguir = caracter != ' ';
            if (vocal) {
                System.out.println("VOCAL\n");
            }else if (caracter != ' ')
                System.out.println("NO VOCAL\n");
        }
        
        
        /**
         * Ej 1. Una empresa tiene un registro de las horas que ha trabajado 
         * diariamente un empleado durante la semana (seis días) y requiere 
         * determinar el total de éstas, así como el sueldo que recibirá por las
         * horas trabajadas (el precio de las horas es una constante 
         * predeterminada). Invéntate el registro de las horas trabajadas.
         */
        final float S_HORA = 13.75f;
        float registro [] = {8.5f, 5.2f, 8, 9.5f, 7.5f, 7.5f};
        float sueldoSemanal = 0;
        //Se recorre el registro de horas y se multiplica por el valor de la hora
        //Se va almacenando el sueldo semanal
        for(float r : registro){
            sueldoSemanal += r*S_HORA;
        }
        System.out.println("Sueldo semanal: " + sueldoSemanal);
        
        
        /**
         * Ej 2. Mostrar un menú con tres opciones: 1-Mostrar texto completo, 
         * 2-Mostrar resumen, 3-Finalizar programa. A continuación, el usuario 
         * debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción 
         * incorrecta, informarle del error. El menú se debe volver a mostrar 
         * después de ejecutar cada opción, permitiendo volver a elegir. 
         * Las opciones 1 ó 2 muestran texto. La opción 3 finaliza el programa, 
         * es decir, ya no se imprime más veces el menú. 
         */ 
        int seleccion;
        boolean continuar = true;
        boolean error = false;
        while (continuar) {
            System.out.println("\n1-Mostrar texto completo\n"
                + "2-Mostrar resumen\n"
                + "3-Finalizar programa");
            seleccion = scan.nextInt();
            
            switch (seleccion) {
                case 1:
                    System.out.println("Un texto");
                    break;
                case 2:
                    System.out.println("Un resumen");
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
        
        
        /**
         * Ej 3. A partir de un número entero de euros, determinar el número de 
         * billetes más grandes en el que se puede desglosar. 
         * Por ejemplo: 48€ == 2 billetes de 20€, 1 de 5€ y 3 euros en monedas.
         * Otro ejemplo: 315€ == 1 billete de 200€,  1 billete de 100€, 
         * 1 billete de 10€ y 1 billete de 5€
         */
        System.out.println("Introduzca euros para saber cuantos billetes tiene de cada valor");
        int euros = scan.nextInt();
        //Array que contiene el valor de los billetes
        int valores[] = {200, 100, 50, 20, 10, 5};
        //Array que almacena la cantidad de billetes
        int cantidad[] = {0, 0, 0, 0, 0, 0};
        //Se inicializa el ensaje que se imprime al final
        String mensaje = euros + " == ";
        
        //Se recorre el array de valores de billetes
        //Para cada billete se guarda la cantidad de billetes
        for (int i = 0; i < valores.length; i++) {
            while (euros - valores[i] >= 0) {
                cantidad[i]++;
                euros -= valores[i];
            }
        }
        //Se añade al mensaje aquellos billetes que la cantidad sea mayor que 0
        for (int i = 0; i < valores.length; i++) {
            if(cantidad[i]>0)
                mensaje += cantidad[i]+ " billetes de " + valores[i]+',';
        }
        //Se termina el mensaje con las monedas y se imprime
        mensaje += " y " + euros + " en monedas";
        System.out.println(mensaje);
        
        
        /**
         * Ej 4. Ingresar un número de 3 dígitos. Si el número no es de 3 dígitos
         * se volverá a pedir un número. Visualizar los dígitos de forma inversa.
         * Ejemplo: número 156 --> 651
         */
        //El usuario introduce un número y se pasa a String
        System.out.println("\nIntroduzca un número");
        int numero = scan.nextInt();
        String num = Integer.toString(numero);
        //Se comprueba si es de 3 cifras, en caso contrario se vuelve a pedir hasta que lo sea
        while (num.length()<3 || num.length()>3) {
            System.out.println("No es de tres cifras, introduzca de nuevo");
            numero = scan.nextInt();
            num = Integer.toString(numero);
        }
        //Se guarda el número dando la vuelta en un string
        String nuevoNum = "";
        for (int i = num.length(); i > 0; i--) {
            nuevoNum += num.charAt(i-1);
        }
        System.out.println(nuevoNum);
        
        //-----OTRA FORMA-----
        int numero2 = 0;
        boolean numeroIncorrecto = true;
        
        while (numeroIncorrecto) {
            System.out.println("\nIntroduzca un número de 3 cifras");
            numero2 = scan.nextInt();
            numeroIncorrecto = numero2 > 999 || numero2 <100;
        }
        
        //Se divide el número por cifras
        int centenas = numero2 / 100 % 10;
        int decenas = numero2 / 10 % 10;
        int unidades = numero2 % 10;
        
        //Se monta el número por cifras
        int numeroAlReves = 0;
        numeroAlReves += unidades*100; //Si es 0 el número sale con dos cifras
        numeroAlReves += decenas*10;
        numeroAlReves += centenas;
        
        System.out.println(numeroAlReves);
        
        
        /**
         * Ej 5. Solicitar al usuario que ingrese una frase y luego informar cuál
         * fue la palabra más larga (en caso de haber más de una, mostrar la primera)
         * y cuántas palabras había. Precondición: se tomará como separador de 
         * palabras al carácter ' ' (espacio), ya sea uno o más.
         */
        //El usuario introduce una frase
        System.out.println("\nIngrese una frase");
        String frase = scan.next();
        //La frase se divide por palabras usando espacio como separación y se guarda en un array
        String palabras [] = frase.split(" ");
        String palabraLarga = palabras[0];
        
        int numPalabras = 1;
        //Se coje la primera palabra y se recorre el array comparando por palabras 
        //Se almacena la mas larga
        for (int i = 1; i < palabras.length; i++) {
            if (palabraLarga.length()<palabras[i].length()) {
                palabraLarga = palabras[i];
            }
            //Se cuenta el número de "palabras" de más de 0 carácteres 
            if (palabras[i].length() > 0) {
                numPalabras++;
            }
        }
        
        System.out.println("De las " + numPalabras + " palabras, la más larga es \"" + palabraLarga + "\"");
        
        
    }
    
}
