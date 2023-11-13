//Ejercicios que mandó el profesor para el Tema 2 con mis notas.

/*ENUNCIADO EJERCICIO 1.
Hágase un programa en el que se declare constantes locales con tu nombre completo,
la dirección de tu casa (sólo la calle), el número del portal, el piso, la letra del piso, el código postal,
la localidad, la provincia y el país. Muéstrese por consola dichos datos almacenados en las constantes como
si fuera la dirección a la que se enviaría una carta.


Luis González Sanz

C/ Maria de Molina nº 51, 1A

91023 Madrid

España

*/

public class Ejercicio1 {
    public static void main(String[] args) {
        /*Con "final" creamos las constantes (variable final), con "String" podemos hacer textos. Necesitará su identificador como cualquier variable (pero en MAYÚSCULAS),
        el texto que queremos entre comillas ("") y finalizar con un punto y coma (;).
        Creamos una constante para cada apartado.
         */
        final String NOMBRE = "Luis González Sanz";
        final String CALLE = "C/ Maria de Molina";
        final String PORTAL = "nº 51, 1A";
        final String CP = "91023";
        final String CIUDAD = "Madrid";
        final String PAIS = "España";

        /*Hasta aquí hemos tenido 0 fallos al ejecutar el código.
        Ahora, para verlo en pantalla necesitamos el "System.out.println" con cada apartado.
        Entre comillas ("") podemos agregar un texto adicional (¡Ojo con dejar un espacio!)
        Con + concatenamos, agregamos algo. En este caso voy a probar a poner el texto que describe cada cosa
        y concateno la variable para que salgan los datos que corresponden.
         */

        System.out.println("NOMBRE: "+NOMBRE);

        //He probado y funciona. Si le quito el + da error. También puedo poner solo la constante NOMBRE en el paréntesis y ya.

        /*Para el siguiente, he escrito en el paréntesis ("DIRECCIÓN: "+CALLE +PORTAL) a secas.
        Funcionar, funciona, pero CALLE Y PORTAL aparecen pegados. Hay que añadir un espacio en blanco asi: +" "
         */

        System.out.println("DIRECCIÓN: "+CALLE +" " +PORTAL);
        System.out.println("CÓDIGO POSTAL: "+CP);
        System.out.println("CIUDAD: "+CIUDAD);
        System.out.println("PAÍS: "+PAIS);

        //¡Listo! Borja solo ha puesto las constantes sin texto previo y ha juntado ciudad y código postal, pero a grandes rasgos bien

    }


}
