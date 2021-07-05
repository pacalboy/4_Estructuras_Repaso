import java.util.Scanner;

public class Zodiaco {

    public static void main(String[] args) {
        /*
        * A partir del día y mes de nacimiento que introduzca el usuario, 
        * determina su signo del zodíaco.
        */
        Scanner scan = new Scanner(System.in);
        
        //Se introduce mes y se obliga a que esté dentro de los límites
        int mes = 0;
        boolean mesIncorrecto = mes > 12 || mes <= 0;
        while (mesIncorrecto) {
            System.out.println("Introduzca mes de nacimiento (entre 1 y 12)");
            mes = scan.nextInt();
            mesIncorrecto = mes > 12 || mes <= 0;
        }
        //Se crea el booleano mes30
        boolean mes30 = mes == 4 || mes == 6 || mes == 9 || mes == 11;
        //Se introduce dia y se obliga a que esté dentro de los límites
        int dia = 0;
        boolean diaIncorrecto = dia > 31 || dia <= 0;
        while (diaIncorrecto) {
            System.out.println("Introduzca dia de nacimiento");
            dia = scan.nextInt();
            diaIncorrecto = dia > 31 || dia <= 0;
            //Se comprueba el dia en caso de ser mes30
            if (mes30) {
                if (dia > 31){
                    diaIncorrecto = true;
                }
            //Se comprueba el dia en caso de ser febrero    
            }else if (mes == 2){
                if (dia > 29){
                    diaIncorrecto = true;
                }    
            }
            //Si el dia no es correcto muestra el mensaje
            if (diaIncorrecto)
                System.out.println("El día introducido no pertenece al mes");
        }
        
        String signo = "";
        
        switch (mes) {
            case 1:
                if (dia > 19)
                signo = "Acuario";
                else
                signo = "Capricornio";    
                break;
            case 2:
                if (dia > 18)
                signo = "Piscis";
                else
                signo = "Acuario"; 
                break;
            case 3:
                if (dia > 19)
                signo = "Aries";
                else
                signo = "Piscis"; 
                break;
            case 4:
                if (dia > 19)
                signo = "Tauro";
                else
                signo = "Aries"; 
                break;
            case 5:
                if (dia > 20)
                signo = "Géminis";
                else
                signo = "Tauro"; 
                break;
            case 6:
                if (dia > 20)
                signo = "Cáncer";
                else
                signo = "Géminis"; 
                break;
            case 7:
                if (dia > 22)
                signo = "Leo";
                else
                signo = "Cáncer"; 
                break;
            case 8:
                if (dia > 22)
                signo = "Virgo";
                else
                signo = "Leo"; 
                break; 
            case 9:
                if (dia > 22)
                signo = "Libra";
                else
                signo = "Virgo"; 
                break;
            case 10:
                if (dia > 22)
                signo = "Escorpio";
                else
                signo = "Libra"; 
                break; 
            case 11:
                if (dia > 21)
                signo = "Sagitario";
                else
                signo = "Escorpio"; 
                break; 
            case 12:
                if (dia > 21)
                signo = "Capricornio";
                else
                signo = "Sagitario"; 
                break;    
        }
        
        System.out.println("Tu signo del zodiaco es: " + signo);
    }
    
}
