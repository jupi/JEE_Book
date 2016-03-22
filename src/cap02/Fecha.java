/*
 Las clases definen la estructura de sus objetos. Es decir que todos los objetos de una
misma clase podrán almacenar el mismo tipo de información y tendrán la misma capacidad
para manipularla.

Defi niremos entonces la clase Fecha que nos permitirá operar con fechas en nuestros
programas. 

Herencia y sobrescritura de métodos:

En Java, por transitividad, todas las clases heredan de una clase
base llamada Object. No hay que especifi car nada para que ocurra esto. Siempre es así.
La herencia es transitiva. Esto quiere decir que, sean las clases A, B y C, si A hereda
de B y B hereda de C entonces A hereda de C.

Es muy importante saber que todas las clases heredan de la clase base Object ya
que los métodos defi nidos en esta clase serán comunes a todas las otras clases (las que
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
package cap02;

public class Fecha {

    private int dia, mes, anio;
    
/*
podemos sobrescribir el método toString para
indicar el formato con el que queremos que se impriman las fechas.
Decimos que sobrescribirmos un método cuando el método que programamos también
está programado en nuestro padre (o abuelo, o... en Object).
*/  
     
    
//Los métodos de una clase se escriben como funciones. Dentro de los métodos, podemos
//acceder a los atributos de la clase como si fueran variables globales
    
    
    @Override
    
     // sobrescribimos el metodo toString (lo heredamos de Object)     
  public String toString(){
  
      //retorna la cadena tal como queremos que vea la fecha
      return dia + "/" + mes + "/" + anio;
  
  }
    
  /*
equals() es otro de los métodos definidos en la clase Object y se utiliza para comparar
objetos. 
  */
  
 @Override
 // sobrescribimos el metodo equals (lo heredamos de Object) 
  public boolean equals(Object o){
  
        Fecha otra = (Fecha) o;
        
        /*
         retorna true si “nuestro día” es igual al día de la otra
        fecha y “nuestro mes” es igual al mes de la otra fecha y “nuestro año” es igual al año de
        la otra fecha. Si no es así entonces retorna false.
        */
        return  (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
  
  }
  
  /*
  Al programar el constructor:
  *podremos crearlos pasándoles los valores y evitando los getter y setter   
  *perdemos el "nulo" o "por defecto"
  */
  
  
  public Fecha(int d, int m, int a){
  
  dia=d;
  mes=m;
  anio=a;
      
  }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    
}
