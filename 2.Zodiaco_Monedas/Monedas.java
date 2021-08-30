import java.util.Scanner;

public class Monedas {

    public static void main(String[] args) {
        /*
        * Ej 2: El sistema pide al usuario que introduzca el número de monedas 
        * y el número de billetes de cada valor existente que tiene en la cartera.
        * El sistema calcula cuánto dinero tiene y lo muestra por pantalla. 
        * Por otro lado, el sistema pregunta al usuario si quiere convertir su 
        * dinero a otro sistema. En caso afirmativo, muestra una pequeña tabla de 
        * conversión (4 sistemas extranjeros: dólares, libras, bitcoins y liras turcas)
        * y el usuario debe seleccionar a qué sistema convertirlo. Si la selección
        * es correcta, el sistema muestra el valor de la moneda extranjera, 
        * en caso contrario muestra un mensaje de error y el programa finaliza.
        */
        final float DOLAR = 1.21f;
        final float LIBRA = 0.89f;
        final float BITCOIN = 0.000033f;
        final float LIRA = 9.05f;
        
        Scanner scan = new Scanner (System.in);
        
        String monedas[] = {"1 céntimo", "2 céntimos", "5 céntimos", 
            "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros", 
            "5 euros", "10 euros", "20 euros", "50 euros", "100 euros", "200 euros"};
        
        float valorMonedas[] = {0.01f, 0.02f, 0.05f, 0.10f, 0.20f, 0.50f, 
            1, 2, 5, 10, 20, 50, 100, 200};
        
        float dinero = 0;
        
        String tipo;
        for (int i = 0; i < monedas.length; i++) {
            tipo = i < 8 ? "monedas" : "billetes";
            System.out.println("Introduzca el número de " + tipo + " de " + monedas[i]);
            dinero += scan.nextInt() * valorMonedas[i];
        }
        
        System.out.println("Tiene " + dinero + " euros");
        
        System.out.println("¿Desea convertir sus euros en otra divisa?\nSi/No");
        char opcion = scan.next().toUpperCase().charAt(0);
        boolean opcionSi = opcion == 'S';
        
        if (opcionSi){
            System.out.println("Introduzca selección:\n"
                + "\t1. Dólares\n"
                + "\t2. Libras\n"
                + "\t3. BitCoins\n"
                + "\t4. Liras turcas\n");
            int seleccion = scan.nextInt();
            
            while (seleccion < 1 || seleccion > 5) {
                System.out.println("Selección incorrecta, intente de nuevo");
                seleccion = scan.nextInt();
            }
            
            float cambio;
            String divisa;
            switch (seleccion) {
                case 1:
                    cambio = dinero * DOLAR;
                    divisa = " Doláres";
                    break;
                case 2:
                    cambio = dinero * LIBRA;
                    divisa = " Libras";
                    break;
                case 3:
                    cambio = dinero * BITCOIN;
                    divisa = " Bitcoins";
                    break;
                case 4:
                    cambio = dinero * LIRA;
                    divisa = " Liras Turcas";
                    break;    
                default:
                    System.out.println("Selección incorrecta");
                    cambio = dinero * (0);
                    divisa = "-ERROR-";
            }
            
            System.out.println("Sus " + dinero + " euros son " + cambio + divisa);
            
        }       
    }
}
