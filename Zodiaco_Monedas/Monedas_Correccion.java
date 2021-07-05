import java.util.Scanner;

public class Monedas_Correccion {
    static final float P_LIRATURCA = 9.05f;
    static final float P_LIBRA = 0.89f;
    static final float P_DOLAR = 1.21f;
    static final float P_BITCOIN = 0.000038f;

    static double cambiosDivisas[] = {P_LIBRA, P_LIBRA, P_DOLAR, P_BITCOIN};

    static Scanner sc = new Scanner(System.in);

    static final String divisas[] = {"Liras Turcas", "Libras", "Dólares", "Bitcoins"};
    static final float valorReal[] = {
        0.01f, 0.02f, 0.05f,                    //Céntimos pequeños
        0.1f, 0.2f, 0.5f,                       //Monedas 
        1f, 2f, 5f, 10f, 20f, 50f, 100f, 200f   //Billetes  
    };
    static final int valorConocido[] = {
        1, 2, 5,                                //Céntimos pequeños
        10, 20, 50,                             //Monedas 
        1, 2, 5, 10, 20, 50, 100, 200           //Billetes  
    };
    static final String nombre[] = {
        "centimo", "centimos", "centimos",
        "centimos", "centimos", "centimos",
        "euro", "euros", "euros", "euros", "euros", "euros", "euros", "euros"
    };

    public static float calcularDineroCartera() {
        float total = 0.0f;
        for (int i = 0; i < valorReal.length; i++) {
            System.out.println("Introduce la cantidad de "
                    + valorConocido[i] + ' ' + nombre[i]);
            total += valorReal[i] * pedirNPositivo();
        }
        return total;
    }

    public static int pedirNPositivo() {
        int n = sc.nextInt();
        n = n > 0 ? n : 0;
        return n;
    }

    public static String mostrarDivisas() {
        String mensaje = "Las divisas disponibles son: ";
        for (int i = 0; i < divisas.length; i++) {
            mensaje += "\n\t" + (i + 1) + " - " + divisas[i];
        }
        mensaje += "\nIntroduce el número correspondiente a la divisa";
        return mensaje;
    }
    
    public static void main(String[] args) {
        float miDinero = calcularDineroCartera();
        System.out.println("El dinero que tienes es: " + miDinero + "€");

        System.out.println("¿Quieres convertir tu dinero a otra moneda?");
        if (sc.next().toUpperCase().equals("SI")) {
            System.out.println(mostrarDivisas());

            int divisa = sc.nextInt();
            if (divisa < 1 || divisa > 4) {
                System.out.println("Divisa incorrecta");
            } else {
                switch (divisa) {
                    case 1 ->
                        miDinero *= cambiosDivisas[0];
                    case 2 ->
                        miDinero *= cambiosDivisas[1];
                    case 3 ->
                        miDinero *= cambiosDivisas[2];
                    case 4 ->
                        miDinero *= cambiosDivisas[3];
                    default ->
                        System.out.println("Error en la divisa");
                }
                System.out.println("Tu dinero ahora es: " + miDinero);
            }
        } else {
            System.out.println("Adiós");
        }
    }
}
