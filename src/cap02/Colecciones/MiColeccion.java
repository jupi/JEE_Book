/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap02.Colecciones;

/**
  * @author cice
 * @since miPrima
 */
public class MiColeccion {
 
    /*
    Variables de instancias:
    
    un Object[] para contener la colección de objetos y un int que indicará la cantidad de elementos
    que actualmente tiene la colección (es decir, cuantos de los n elementos del array efectivamente
    están siendo utilizados)
    */
    private Object datos[] = null;
    private int len;

    
    //constructor a través del cual el usuario debe especifi car la capacidad inicial que le
    //quiera dar al array.
    public MiColeccion(int capacidadInicial) {
        
        datos = new Object[capacidadInicial];
        
    }

    /*
    métodos obtener y cantidad. En estos métodos simplemente
    tenemos que retornar el objeto contenido en datos[i] y el valor de la variable len
    respectivamente.    
    */
    
      public Object obtener(int i){
      
          return datos[i];
          
      }  
    
      
      public int cantidad(){
      
          return len;
      
      }
    
}
