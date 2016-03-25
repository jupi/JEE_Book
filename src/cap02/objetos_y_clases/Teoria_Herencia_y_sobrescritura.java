/*
RESUMEN:
-------------------

• Toda clase hereda (directa o indirectamente) de la clase Object.
• Los métodos de la clase Object son comunes a todas las clases.
• De Object siempre heredaremos los métodos toString y equals.
• Podemos sobrescribir estos métodos para definir el formato de impresión de los objetos
de nuestras clases y el criterio de comparación (respectivamente).
• Los objetos no pueden ser utilizados hasta tanto no hayan sido creados.
• Para crear objetos utilizamos el constructor de la clase.
• Todas las clases tienen (al menos) un constructor.
• Podemos programar un constructor o bien aceptar el constructor por defecto que
Java defi ne por nosotros en caso de que no lo hayamos programado.
• Si programamos explícitamente el constructor entonces “perdemos” el constructor
nulo.


CLASES:
--------
Las clases definen la estructura de sus objetos. Es decir que todos los objetos de una
misma clase podrán almacenar el mismo tipo de información y tendrán la misma capacidad
para manipularla.


Herencia y sobrescritura de métodos:
-----------------------------------------

En Java, por transitividad, todas las clases heredan de una clase
base llamada Object. No hay que especifi car nada para que ocurra esto. Siempre es así.
La herencia es transitiva. Esto quiere decir que, sean las clases A, B y C, si A hereda
de B y B hereda de C entonces A hereda de C.

Es muy importante saber que todas las clases heredan de la clase base Object ya
que los métodos definidos en esta clase serán comunes a todas las otras clases (las que
vienen con el lenguaje y las que programemos nosotros mismos).

Todas las clases heredan de Object el método toString, por lo tanto, podemos
invocar este método sobre cualquier objeto de cualquier clase. Tal es así que cuando
hacemos:
System.out.println(obj);

siendo obj un objeto de cualquier clase, lo que realmente estamos haciendo (implícitamente)
es:

System.out.println( obj.toString() );

Ya que System.out.println invoca el método toString del objeto que recibe
como parámetro. Es decir, System.out.println “sabe” que cualquiera sea el tipo
de datos (clase) del objeto que recibe como parámetro este seguro tendrá el método
toString.

 */