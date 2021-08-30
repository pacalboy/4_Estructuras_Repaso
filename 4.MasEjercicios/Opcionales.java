import java.util.Scanner;

public class Opcionales {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /**
         * Ej 0. A partir de dos cadenas introducidas por el usuario, determinar qué 
         * cadena tiene mayor longitud.
         */
        System.out.println("Introduzca una palabra");
        String cadena1 = scan.next();
        System.out.println("Introduzca otra palabra");
        String cadena2 = scan.next();
        String cadenaMayor;
        if (cadena1.length() >= cadena2.length()) {
            cadenaMayor = cadena1;
        }else{
            cadenaMayor = cadena2;
        }
        
        System.out.println('\"' + cadenaMayor+"\" es más larga");
        
        
        /**
         * Ej 1. Una empresa se dedica a vender bolígrafos. Si el usuario compra 
         * más de cien el precio de cada lápiz es de 0,85€, en caso contrario el
         * precio es de 0,95€. A partir de una cantidad de lápices introducida 
         * por el usuario, determinar la cantidad que debe pagar. 
         */
        System.out.println("\n¿Cuántos lápices quiere?");
        int pedido = scan.nextInt();
        float precio;
        if (pedido > 100){
            precio = 0.85f;
        }else{
            precio = 0.95f;
        }
        
        float pago = pedido * precio;
        System.out.println("Tiene que pagar "+ pago);
        
        
        /**
         * Ej 2. Ingresar un número y verificar si es múltiplo de 10
         */
        System.out.println("Ingrese un múltiplo de 10");
        int num = scan.nextInt();
        boolean multiploDiez = num%10 == 0;
        if (multiploDiez) {
            System.out.println("Gracias"); 
        }else{
            System.out.println(num + " no es múltiplo de 10");
        }
        
        
        /**
         * Ej 3. Ingresar una nota de 1 a 20 y visualizar la siguiente equivalencia:
         * 19 y 20 Sobresaliente  
         * 16, 17 y 18 Muy Buena
         * 14 y 15 Buena 
         * 12 y 13 Regular 
         * 1 al 11 Insuficiente
         */
        System.out.println("Introducir nota:");
        int nota = scan.nextInt();
        String calificacion ="";
        
        while (nota < 1 || nota > 20) {
            System.out.println("Introducir nota:");
            nota = scan.nextInt();
        }
        
        if (nota >= 19 && nota <= 20) {
            calificacion = "Sobresaliente";
        }else if (nota >= 16 && nota <= 18){
            calificacion = "Muy Buena";
        }else if (nota >= 14 && nota <= 15) {
            calificacion = "Buena";
        }else if (nota >= 12 && nota <= 13) {
            calificacion = "Regular";
        }else if (nota >= 1 && nota <= 11) {
            calificacion = "Insuficiente";  
        }
        
        System.out.println("Tu calificación es de " + calificacion);
        
        
        /**
         * Ej 4. Diseña un algoritmo que para 3 valores decimales dados, 
         * determine cuál es mayor. 
         */
        System.out.println("Introduzca 3 valores");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float mayor;
        
        if (a>b && a>c) {
            mayor = a;
        }else if (b>a && b>c) {
            mayor = b;
        }else{
            mayor = c;
        }
        System.out.println("El mayor de los 3 es " + mayor);
        
        
        /**
         * Ej 5. En un videoclub se ofrece la promoción de llevarse tres películas
         * por el precio de las dos más baratas. Haga un programa que, dados los
         * tres precios de las películas, determine la cantidad a pagar. 
         */
        System.out.println("Introduzca los precios de las 3 películas");
        float precio1 = scan.nextFloat();
        float precio2 = scan.nextFloat();
        float precio3 = scan.nextFloat();
        
        float pFinal;
        
        //Se comparan los dos primeros y se guarda el menor
        //Luego, según el caso, se comparan los otros dos y se le añade el menor al ya guardado
        if (precio1<precio2){
            pFinal = precio1;
            if (precio2<precio3){
                pFinal += precio2;
            }else{
                pFinal += precio3;
            }    
        }else{
            pFinal = precio2;
            if(precio1<precio3){
                pFinal += precio1;
            }else{
                pFinal = precio3;
            }
        }
        
        System.out.println("Tiene que pagar " + pFinal);
        
    }
    
}
