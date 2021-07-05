import java.util.ArrayList;
import java.util.Scanner;

public class OpcionalesAmpliacion {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /**
         * Ej 0. En un Instituto una escuela está organizando un viaje de estudios,
         * y requiere determinar cuánto debe cobrar a cada alumno y cuánto se 
         * debe pagar a la agencia de viajes por el servicio. La forma de cobrar
         * es la siguiente: si son 100 alumnos o más, el importe por cada alumno
         * es de 65€; de 50 a 99 alumnos, e es de 70€, de 30 a 49, de 95€, y si 
         * son menos de 30, el importe del alquiler del autobús es de 4000€, sin
         * importar el número de alumnos. Realiza un programa para que dado un 
         * número de alumnos determine cuánto debe pagar cada uno. 
         */
        System.out.println("Introduzca número de alumnos");
        int numAlumnos = scan.nextInt();
        float importe;
        
        if (numAlumnos > 99) {
            importe = 65;
        }else if (numAlumnos > 49){
            importe = 70;
        }else if (numAlumnos > 29){
            importe = 95;
        }else if (numAlumnos > 0){
            importe = 4000/numAlumnos;
        }else
            importe = -1;
        
        if(importe < 0){
            System.out.println("Número de alumnos erróneo");
        }else{
            System.out.println("Cada alumno paga " + importe);
        }
        
        
        /**
         * Ej 1. Ingresar 2 números por teclado y sumar, sin utilizar el operando 
         * de suma(+).
         */
        System.out.println("\nIntroduzca dos números enteros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int suma = Math.addExact(a, b);
        System.out.println("La suma es: " + suma);
        
        
        /**
         * Ej 2. Un programa que solicite números entre 0 y 999. Si el número 
         * que se introduce está fuera de los límites se volverá a pedir un valor. 
         * El programa finaliza si el usuario introduce un ' - '. Utiliza 
         * excepciones. Para el valor introducido es necesario determinar el 
         * número de dígitos que tiene. 
         */
        System.out.println("\nIntroduzca un número entre 0 y 999\n\"-\" para salir");
        String nStr = scan.next();
        boolean go = !nStr.equals("-");
        
        int num;
        int cifras;
        
        while (go) {
            try {
                num = Integer.parseInt(nStr);
                if (num < 0 || num > 1000) {
                    System.out.println("Número fuera de los límites");
                }else{
                    if(num/100 > 0){
                    cifras = 3;
                    }else if (num/10 > 0){
                    cifras = 2;
                    }else{
                    cifras = 1;
                    }
                System.out.println("Número de cifras: " + cifras); 
                }
                    
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            }
            
            System.out.println("\nIntroduzca un número entre 0 y 999\n\"-\" para salir");
            nStr = scan.next();
            go = !nStr.equals("-");
        }
        
        
        /**
         * Ej 3. Visualizar los divisibles de un número entero.
         */
        System.out.println("\nNúmero para visualizar divisores:");
        int entero = scan.nextInt();
        ArrayList<Integer> divisores = new ArrayList<Integer>();
        for (int i = 1; i <= entero; i++) {
            if(entero%i == 0){
                divisores.add(i);
            }
        }
        System.out.println(divisores);
        
        
        /**
         * Ej 4. Programa que pida números de cuatro cifras e indique si los 
         * números son capicúas o no. El programa deberá ir pidiendo números hasta
         * que el usuario introduce ‘-1’ por teclado. El número –1 indicará la 
         * finalización de la ejecución del programa. Nota1: Un número capicúa 
         * es simétrico p.e. 1221 ó 25752. Nota2: Cuando el número no es de cuatro
         * cifras se deberá mostrar un mensaje de error por pantalla y se pedirá
         * otro número menor que 10000. En caso de que el número sea menor de 
         * cuatro cifras se completará con ceros a la izquierda. Nota3: El único
         * número negativo que se aceptará es ‘-1’ que indicará la finalización 
         * del programa. Cualquier otro número negativo, se mostrará un mensaje de error.
         */
        //El usuario introduce el número
        System.out.println("\nIntroduzca un número de cuatro cifras\n-1 para salir");
        int n = scan.nextInt();
        boolean seguir = n != -1;
        
        boolean nCorrecto;
        boolean capicua;

        while (seguir) {
            //Se comprueba que sea positivo y de 4 cifras o menos
            nCorrecto = n / 10000 <= 0 && n >= 0;  
            
            if (!nCorrecto) {
                System.out.println("Número incorrecto");
            } else {
                String n2 = Integer.toString(n);
                //Dependiendo de las cifras se le añaden 0 delante
                switch (n2.length()) {
                    case 1:
                        n2 = "000" + n2;
                        break;
                    case 2:
                        n2 = "00" + n2;
                        break;
                    case 3:
                        n2 = "0" + n2;
                        break;
                    case 4:
                        break;
                    default:
                        n2 = "0";
                }
                //Se comprueba si es capicúa y se imprime por pantalla
                capicua = n2.charAt(0) == n2.charAt(3) && n2.charAt(1) == n2.charAt(2);
                if (capicua) {
                    System.out.println(n2 + " es CAPICÚA");
                } else {
                    System.out.println("Lo sentimos, " + n2 + " no es capicúa");
                }
            }
            //El usuario introduce el número
            System.out.println("\nIntroduzca un número de cuatro cifras\n-1 para salir");
            n = scan.nextInt();
            seguir = n != -1;
        }
        
        
        /**
         * Ej 5. Insertar un número entero y mostrar su visualización en 
         * números romanos. 
         */
        System.out.println("\nNúmero para pasarlo a Romano:");
        int numero = scan.nextInt();
        String romano = "";
        
        int mill = numero / 1000 % 10;
        int cent = numero / 100 % 10;
        int dec = numero / 10 % 10;
        int unid = numero % 10;
                
        for (int i = 0; i < mill; i++) {
            romano += "M";
        }
        
        if (cent == 9) {
            romano += "CM";
        }else if (cent >= 5) {
            romano = romano + "D";
            for (int i = 5; i < cent; i++) {
                romano += "C";
            }
        }else if (cent == 4) {
            romano += "CD";
        }else {
            for (int i = 0; i < cent; i++) {
                romano += "C";
            }
        }
        
        if (dec == 9) {
            romano += "XC";
        }else if (dec >= 5) {
            romano = romano + "L";
            for (int i = 5; i < dec; i++) {
                romano += "X";
            }
        }else if (dec == 4) {
            romano += "XL";
        }else {
            for (int i = 0; i < dec; i++) {
                romano += "X";
            }
        }
        
        if (unid == 9) {
            romano += "IX";
        }else if (unid >= 5) {
            romano = romano + "V";
            for (int i = 5; i < unid; i++) {
                romano += "I";
            }
        }else if (unid == 4) {
            romano += "IV";
        }else {
            for (int i = 0; i < unid; i++) {
                romano += "I";
            }
        }
        System.out.println(romano);
        
    }
    
}
