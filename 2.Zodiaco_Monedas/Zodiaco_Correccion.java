import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zodiaco_Correccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Crea un objeto a partir de la fecha actual
        //Utilizo método estático de Calendar para crear la instancia
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        //Establece el calendario como NO indulgente
        //(no deja pasar el error si la fecha no es válida)
        c.setLenient(false);

        int dia = 0;
        int mes = 0;
        boolean fechaValida = false;

        while (!fechaValida) {
            try {
                System.out.println("Introduce el día y el mes");
                dia = sc.nextInt();
                mes = sc.nextInt() - 1;

                //Establece la fecha del usuario
                c.set(2020, mes, dia);

                //Si llego aquí sin que salte ninguna excepción
                //Establezco que la fecha ha sido válida
                fechaValida = true;

            } catch (InputMismatchException ime) {
                System.out.println("Fechas numéricas por favor");
                sc.nextLine();
            } catch (IllegalArgumentException iae) {
                System.out.println("Fecha no válida. Mes o día fuera de los límites");
                sc.nextLine();
            }
        }

        System.out.println(c.getTime());

        String signo;

        switch (mes) {
            case Calendar.JANUARY -> {
                if (dia < 20) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
            }
            case Calendar.FEBRUARY -> {
                if (dia < 19) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
            }
            case Calendar.MARCH -> {
                if (dia < 20) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
            }
            //...
            default -> {
                signo = null;
            }
        }
        
        if(signo == null){
            System.out.println("No es posible encontrar un signo para esa fecha");
        } else {
            System.out.println("El signo del zodiaco para tu fecha es: "+signo);
        }
    }
    
}
