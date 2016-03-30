//++++++++++++++++++++++++++++++++
//Los atributos de las clases son variables de instancia, pero las variables de instancia no
//siempre serán consideradas como atributos.
//++++++++++++++++++++++++++++++++++++++++

package cap02.variablesInstanciayClase;

import cap02.objetos_y_clases.fecha.Fecha;

public class Persona {

    
    /*    
        La clase Persona tiene cuatro variables de instancia: nombre, apellido, dirección
        y contador. Sin embargo, solo las primeras tres pueden ser consideradas como atributos.
        La variable de instancia cont es utilizada para contar cuántas veces se invoca al método
        toString sobre el objeto. Por esto, dentro del método toString lo primero que
        hacemos es incrementar su valor.
        Las variables nombre, apellido, dirección tienen que ver con “la persona”, pero
        la variable cont simplemente es un recurso de programación: un contador. No puede
        ser considerada como atributo de la clase.
    
        Como podemos ver, el hecho de que una variable de instancia sea considerada como
        atributo es bastante subjetivo y quedará a criterio del programador.
    */
    
    
     //atributos
    private String nombre, apellido;
    private Fecha fechaNacimiento;
    
    private int contador = 0; //variable de estado

    public Persona(String nombre, String apellido, Fecha fechaNacimiento ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", contador=" + contador + '}';
    }

    
    
    
    
}
