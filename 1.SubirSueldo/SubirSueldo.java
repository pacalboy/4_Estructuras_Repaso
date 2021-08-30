import java.util.ArrayList;

public class SubirSueldo {

    public static void main(String[] args) {

        final byte INDEFINIDO = 1;
        final byte TEMPORAL = 2;
        final byte PRACTICAS = 3;

        final double INC_INDEFINIDO = 600.0;
        final double INC_TEMPORAL = INC_INDEFINIDO / 2.0;
        final double INC_PRACTICAS = 50.0;

        //Creo una lista de elementos tipo Trabajador
        //La lista tiene el identificador trabajadores
        ArrayList<Trabajador> trabajadores;

        //Inicializo la lista utilizando el constructor vacío de la clase ArrayList
        //Indicando (otra vez) el tipo de elemento que contiene la lista
        trabajadores = new ArrayList<Trabajador>();

        //Añado elementos a la lista usando el método add( nuevo elemento )
        //Creo cada elemento usando el constructor de Trabajador
        //Al constructor le paso el tipo (1=Indefinido, 2=Temporal, 3=Prácticas)
        trabajadores.add(new Trabajador(INDEFINIDO));
        trabajadores.add(new Trabajador(INDEFINIDO));

        trabajadores.add(new Trabajador(TEMPORAL));

        trabajadores.add(new Trabajador(PRACTICAS));
        trabajadores.add(new Trabajador(PRACTICAS));
        trabajadores.add(new Trabajador(PRACTICAS));

        Trabajador miTrabajador = trabajadores.get(5);
        miTrabajador.aumentarSueldo(INC_PRACTICAS);
        /**
         * Equivalente a: trabajadores.get(5).aumentarSueldo(500);
         */

        int tipo;
        double incremento;
        for (Trabajador t : trabajadores) {
            tipo = t.getTipo();

            if (tipo == INDEFINIDO) {
                incremento = INC_INDEFINIDO;
            } else if (tipo == TEMPORAL) {
                incremento = INC_TEMPORAL;
            } else {
                incremento = INC_PRACTICAS;
            }

            t.subirSueldo(incremento);
        }

        //De IF a SWITCH
        for (Trabajador t : trabajadores) {
            tipo = t.getTipo();

            switch (tipo) {
                case INDEFINIDO:
                    incremento = INC_INDEFINIDO;
                    break;
                case TEMPORAL:
                    incremento = INC_TEMPORAL;
                    break;
                case PRACTICAS:
                    incremento = INC_PRACTICAS;
                    break;
                default:
                    incremento = 0.0;
            }

            t.subirSueldo(incremento);
        }

    }
}
