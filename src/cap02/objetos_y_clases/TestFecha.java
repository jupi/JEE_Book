/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

/*
La clase  Fecha provee métodos a través de los cuales podemos acceder a sus atributos
para asignar y/o consultar sus valores, como vemos en el siguiente código:

 */
package cap02.objetos_y_clases;

public class TestFecha {

    public static void main (String[] args){
    
    Fecha f = new Fecha(30, 9, 1974);
    Fecha f2 = new Fecha(6,4,1993); 
    
    
       
        System.out.println(f);
        System.out.println(f2);
    
    
    }
    
}
