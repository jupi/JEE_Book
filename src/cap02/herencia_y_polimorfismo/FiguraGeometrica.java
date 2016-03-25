/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

/*
Toda figura geométrica describe un área cuyo valor se puede
calcular”. Sin embargo, para calcular el área de una fi gura geométrica será necesario
conocer cuál es esa fi gura. Es decir, no alcanza con saber: “es una figura geométrica”,
necesitamos además conocer qué figura es.
Dicho de otro modo, podemos calcular el área de un rectángulo, podemos calcular el
área de un círculo y también podemos calcular el área de un triángulo, pero no podemos
calcular el área de una figura geométrica si no conocemos concretamente de qué figura
estamos hablando.
-----------------------------------------------------------------------------------------
Una clase abstracta es una clase que tiene métodos que no pueden ser desarrollados
por falta de información concreta. Estos métodos se llaman “métodos abstractos” y deben
desarrollarse en las subclases, cuando esta información esté disponible.

 */
package cap02.herencia_y_polimorfismo;

public abstract class FiguraGeometrica {


    //método abstracto. es un método abstracto, por esto se lo defi ne como abstract y no 
    //se lo resuelve. Simplemente, se fi naliza su declaración con ; 
    public abstract double area();
    
    public String toString(){
    
        return "area = " +area();
        
        /*
        Dejo planteado un interrogante para el lector: en la clase FiguraGeometrica sobrescribimos
        el método toString y dentro de este invocamos al método area (que es bstracto).
        ¿Esto tiene sentido?
        En general las clases abstractas deben ser subclaseadas y toda clase que herede de una
        clase abstracta tendrá que sobrescribir los métodos abstractos de su padre o bien también
        deberá ser declarada abstracta y (por lo tanto) no se podrá instanciar. 
        */        
        
        
    
    }
    
}
    

