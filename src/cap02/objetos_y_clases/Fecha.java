package cap02.objetos_y_clases;

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
  *Al programar el constructor:
    *podremos crear nuevos objetos pasándoles los valores y evitando los getter y setter   
    *perdemos el constructor "nulo" o "por defecto"
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
