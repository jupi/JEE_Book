/**
Herencia y polimorfismo:
------------------------------
@La herencia permite definir nuevas clases en función de otras clases ya existentes.
*Diremos que la “clase derivada” o la “subclase” hereda los métodos y atributos de la “clase base”.
*Esto posibilita, partiendo de una base, redefinir el comportamiento de los métodos heredados
*y/o extender su funcionalidad.

@En la sección anterior, trabajamos con la clase Fecha. Supongamos que no tenemos
*acceso al código de esta clase. Es decir, podemos utilizarla, pero no la podemos modifi
*car porque, por ejemplo, fue provista por terceras partes. Hagamos de cuenta que
*no la desarrollamos nosotros.

@La clase Fecha nos es útil, funciona bien y es muy práctica. Sin embargo, queremos
*modificar la forma en la que una fecha se representa a sí misma cuando le invocamos
*el método toString (recordemos que no la podemos modificar porque estamos
*suponiendo que nosotros no la hemos desarrollado).
* 
* 
*La solución será crear una nueva clase que herede de Fecha y que modifique la
*manera en la que esta se representa como cadena. Esto lo podremos hacer sobrescribiendo
*el método toString. Llamaremos a la nueva clase FechaDetallada y haremos que se
*represente así: “25 de octubre de 2009”.
 */


package cap02.herencia_y_polimorfismo;

import cap02.objetos_y_clases.FechaSobrecarga;

/*
La clase FechaDetallada hereda de la clase base Fecha y sobrescribe el método
toString para retornar una representación más detallada que la que provee su padre.
*/

public class FechaDetallada extends FechaSobrecarga  {
    
    
        /*
        los constructores no se heredan; por lo tanto, por el momento, la clase
        FechaDetallada solo tiene el constructor por defecto. Sin embargo, para agregar
        el constructor que recibe un String bastará con las siguientes líneas de código.
        */

        
        public FechaDetallada (String f){
        
        super(f);
        
        }
    
    
        private static String meses[] = {"Enero",
                "febrero","marzo", "abril","mayo","junio","julio",
                "agosto","septiembre","octubre","noviembre","diciembre"
                };
    
        
        @Override
         public String toString(){
         
             return getDia() + " de " + meses[getMes()-1] + " de " + getAnio();
         }
    
         
}
