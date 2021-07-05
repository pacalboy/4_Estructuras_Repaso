# 4_Estructuras_Repaso
Afianzar las estructuras de control.

## SubirSueldo

Ejemplo realizado en clase de como realizar un método para subir sueldo a un trabajador.  
Contiene dos ejemplos, uno usa IF y otro SWITCH.

## Zodiaco_Monedas


0. A partir del día y mes de nacimiento que introduzca el usuario, determina su signo del zodíaco. (Aviso de que me gusta para examen).  
  
1. El sistema pide al usuario que introduzca el número de monedas y el número de billetes de cada valor existente que tiene en la cartera. El sistema calcula cuánto dinero tiene y lo muestra por pantalla. Por otro lado, el sistema pregunta al usuario si quiere convertir su dinero a otro sistema. En caso afirmativo, muestra una pequeña tabla de conversión (4 sistemas extranjeros: dólares, libras, bitcoins y liras turcas) y el usuario debe seleccionar a qué sistema convertirlo. Si la selección es correcta, el sistema muestra el valor de la moneda extranjera, en caso contrario muestra un mensaje de error y el programa finaliza.

Corrección:
~~~
Zodiaco: Correcto pero recuerda poner un default siempre, son buenas prácticas.
Monedas: Correcto.
~~~

## For

0. A partir de dos números dados por el usuario, mostrar todos los valores intermedios. No incluir los valores dados. Ejemplo: 5 y 9 imprime 678  
  
1. Diseña un programa que para dos números dados, muestre todos los valores intermedios que sean pares.  
  
2. Crea una alarma. El usuario introducirá un número (en segundos) que representa cuánto tiempo quiere que espere la máquina hasta que le avise de que ha transcurrido el tiempo indicado. Cada segundo que pase mostrará un mensaje que diga "Han pasado x segundos". Utiliza el método Thread.sleep( <nanosegundos a esperar> ); que sirve para pausar la ejecución de un programa durante el tiempo indicado en nanosegundos. (1segundo = 1000 nanosegundos)  
  
3. Diseña un programa para que dado un número entero que indique el usuario, muestre su tabla de multiplicar.  
  
4. Crea un programa que lea una cadena por teclado, un caracter y un número entero. El programa debe generar una nueva cadena que esté formada por la cadena inicial y el carácter tantas veces como indique el número entero. Ejemplo [ "Hola", '!', 5 ] -> "Hola!!!!!". Ejemplo: [ "Boom". 'm', 3] -> "Boommmm"  
  
5. Crea un programa que a partir de esta lista:  
int telefonosMaria[ ] = {671711711, 912121212, 789789789, 654654678};  
Genere una cadena como el siguiente: (finalmente muestra la cadena generada)  
"Teléfonos de María:  
** 671711711 **  
** 912121212 **  
** 789789789 **  
** 654654678 ** "

~~~
1. Cambiar iniPar -=1 por iniPar-- 
5. No me gusta. El objetivo era guardarlo todo en un único String,
no en un array de Strings en el que la consistencia no existe porque el primer elemento 
almacena una cosa y los siguientes tienene un significado completamente distinto
~~~

## MásEjercicios

**For_While**  

0. Crea un programa que pida caracteres hasta que se introduzca un espacio, el programa imprimirá imprima ‘VOCAL’ si es una vocal y ‘NO VOCAL’ en caso contrario.  
  
1. Una empresa tiene un registro de las horas que ha trabajado diariamente un empleado durante la semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas (el precio de las horas es una constante predeterminada). Invéntate el registro de las horas trabajadas.  
  
2. Mostrar un menú con tres opciones: 1-Mostrar texto completo, 2-Mostrar resumen, 3-Finalizar programa. A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El menú se debe volver a mostrar después de ejecutar cada opción, permitiendo volver a elegir. Las opciones 1 ó 2 muestran texto. La opción 3 finaliza el programa, es decir, ya no se imprime más veces el menú.  
  
3. A partir de un número entero de euros, determinar el número de billetes más grandes en el que se puede desglosar.  
Por ejemplo: 48€ == 2 billetes de 20€, 1 de 5€ y 3 euros en monedas.  
Otro ejemplo: 315€ == 1 billete de 200€, 1 billete de 100€, 1 billete de 10€ y 1 billete de 5€  
  
4. Ingresar un número de 3 dígitos. Si el número no es de 3 dígitos se volverá a pedir un número. Visualizar los dígitos de forma inversa. Ejemplo: número 156 --> 651  
  
5. Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga (en caso de haber más de una, mostrar la primera) y cuántas palabras había. Precondición: se tomará como separador de palabras al carácter ' ' (espacio), ya sea uno o más.

Corrección:
~~~
2. Variable sin utilizar: boolean error = false
4. ¿Esta condición? num.length()<3 || num.length()>3, mejor esta: num.length()!=3 
~~~  
  
**Opcionales** (repaso If)  

0. A partir de dos cadenas introducidas por el usuario, determinar qué cadena tiene mayor longitud  
  
1. Una empresa se dedica a vender bolígrafos. Si el usuario compra más de cien el precio de cada lápiz es de 0,85€, en caso contrario el precio es de 0,95€. A partir de una cantidad de lápices introducida por el usuario, determinar la cantidad que debe pagar.  
  
2. Ingresar un número y verificar si es múltiplo de 10  
  
3. Ingresar una nota de 1 a 20 y visualizar la siguiente equivalencia:  
19 y 20 Sobresaliente --- 16, 17 y 18 Muy Buena --- 14 y 15 Buena --- 12 y 13 Regular --- 1 al 11 Insuficiente  
  
4. Diseña un algoritmo que para 3 valores decimales dados, determine cuál es mayor.  
  
5. En un videoclub se ofrece la promoción de llevarse tres películas por el precio de las dos más baratas. Haga un programa que, dados los tres precios de las películas, determine la cantidad a pagar.

**OpcionalesAmpliación**  

0. En un Instituto una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto se debe pagar a la agencia de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el importe por cada alumno es de 65€; de 50 a 99 alumnos, e es de 70€, de 30 a 49, de 95€, y si son menos de 30, el importe del alquiler del autobús es de  
4000€, sin importar el número de alumnos. Realiza un programa para que dado un número de alumnos determine cuánto debe pagar cada uno.  
  
1. Ingresar 2 números por teclado y sumar, sin utilizar el operando de suma(+)  
  
2. Un programa que solicite números entre 0 y 999. Si el número que se introduce está fuera de los límites se volverá a pedir un valor. El programa finaliza si el usuario introduce un ' - '. Utiliza excepciones. Para el valor introducido es necesario determinar el número de dígitos que tiene.  
  
3. Visualizar los divisibles de un número entero.

4. Programa que pida números de cuatro cifras e indique si los números son capicúas o no. El programa deberá ir pidiendo números hasta que el usuario introduce ‘-1’ por teclado. El número –1 indicará la finalización de la ejecución del programa. Nota1: Un número capicúa es simétrico p.e. 1221 ó 25752. Nota2: Cuando el número no es de cuatro cifras se deberá mostrar un mensaje de error por pantalla y se pedirá otro número menor que 10000. En caso de que el número sea menor de cuatro cifras se completará con ceros a la izquierda. Nota3: El único número negativo que se aceptará es ‘-1’ que indicará la finalización del programa. Cualquier otro número negativo, se mostrará un mensaje de error.  
  
5. Insertar un número entero y mostrar su visualización en números romanos.

**Recursivo**  
Investigar recursividad.  
Considere siguiente proceso repetitivo para un número entero dado: si el número es 1, el proceso termina. De lo contrario, si es par se divide entre 2, y si es impar se multiplica por 3 y se le suma 1.  
Por ejemplo: si empezamos con 6 obtendremos la sucesión de números 6, 3, 10, 5, 16, 8, 4, 2, 1. La conjetura de Collatz dice que, a partir de cualquier número inicial, la sucesión obtenida siempre termina en 1. Escriba un programa que permita verificar la conjetura de Collatz para cualquier entero dado, y que imprima la secuencia correspondiente.

