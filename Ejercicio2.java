//Ejercicios que mandó el profesor para el Tema 2 con mis notas.

/*ENUNCIADO EJERCICIO 2:
Hágase un programa que lea 5 variables enteras y haga lo siguiente:

a) Las muestre en una línea separadas por un espacio.

b) Rote los valores hacia la izquierda (la primera variable tome el valor de la segunda; la segunda, la de la tercera;
la tercera, la de la cuarta; la cuarta, la de la quinta; y la quinta, la de la primera.

c) Se muestren de nuevo el valor de las cinco variables de la misma forma que en el apartado a).

 */


/*Por lo que he visto, hay dos versiones corregidas del ejercicio: la versión Github y la versión del video de la primera tutoría extra.
Parece que lo que lleva a confusión es que el enunciado dice "que el programa LEA", lo que llevaría a usar una variable llamada
Scanner (que es la versión que se hace en el video).
Vamos a empezar por la versión Github, que es más sencilla, y luego haré aparte la del video.
 */



public class Ejercicio2 {

    public static void main(String[] args) {

        //Primero necesitaremos los números que vamos a usar, las 5 variables.

        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;
        int numero5 = 50;

        //Lo primero que pide es que las mostremos en una linea separadas por un espacio, así que voy a hacer que las
        // saque/imprima en pantalla con system.out.println(); poniendo comillas con espacios entre medias

       System.out.println(numero1 +" " +numero2 +" " +numero3 +" " +numero4 +" " +numero5);

       /*Ahora lo difícil es que al hacer que roten los valores de las variables igualando, ej. numero1 = numero2 etc,
       cuando lleguemos a numero5 = numero1 no va a salir lo que queremos, porque ahora numero1 es igual a numero2
       para eso existe una variable llamada "aux" que nos permite guardar un valor. Comenzamos protegiendo el valor de
       numero1. Se escribiria despues de int y se igualaria al numero1.
        */

        int aux = numero1;

        /*Ahora igualamos los demás con el número siguiente con cuidado de que numero5 irá igualado al aux.
        No hace falta poner int otra vez porque ya se han declarado las variables antes.
         */


        numero1 = numero2;
        numero2 = numero3;
        numero3 = numero4;
        numero4 = numero5;
        numero5 = aux;

        //copiamos el System.out.print de antes, que no ha cambiado

        System.out.println(numero1 +" " +numero2 +" " +numero3 +" " +numero4 +" " +numero5);


        //Y fin. En la versión del video también pondré los numeros en el orden contrario.


        //NOTA EXTRA: Antes me he preguntado si se podria resolver así, pero el ejercicio dice que hay que cambiar el valor de las variables, no el orden de impresión.

        System.out.println(numero2 +" " +numero3 +" " +numero4 +" " +numero5 +" " +numero1);
    }
}
