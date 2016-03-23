/*
ENCAPSULAMIENTO:
------------------
Uno de los objetivos que debemos perseguir cuando programamos clases es poder encapsular
la complejidad que emerge de las operaciones asociadas a sus atributos. Me
refi ero a que debemos hacerle la vida fácil al programador que utilice objetos de nuestras
clases exponiéndole las operaciones que podría llegar a necesitar, pero ocultándole la
complejidad derivada de las mismas.
*/



package cap02_POO.clases_objetos;

public class FechaEncapsulada {

    private int dia, mes, anio;
 
            //sobrecargamos el constructor pasándole como argumento una cadena
    
    public FechaEncapsulada(String s){
    
            //buscamos primera ocurrencia desde el principio "/"
            
            int pos1 = s.indexOf('/');
            
            //buscamos primera ocurrencia desde el final "/"
            
            int pos2 = s.lastIndexOf('/');
            
            //Tomamos la subcadena ubicada entre 0 y pos1 (no inclusive), la convertimos a int
            //y la asignamos al atributo dia.

            String sdia = s.substring(0, pos1);
            dia = Integer.parseInt(sdia);
            
            //Tomamos la subcadena ubicada entre pos1+1 y pos2 (no inclusive), la convertimos
            //a int y la asignamos en el atributo mes.
            
            String smes = s.substring(pos1+1, pos2);
            mes = Integer.parseInt(smes);
            
            //Tomamos la subcadena ubicada entre pos2+1, la convertimos
            //a int y la asignamos en el atributo mes.
            
            String sanio = s.substring(pos2+1);
            anio = Integer.parseInt(sanio);
    
    }
    
     @Override
    
     // sobrescribimos el metodo toString (lo heredamos de Object)     
  public String toString(){
  
      //retorna la cadena tal como queremos que vea la fecha
      return dia + "/" + mes + "/" + anio;
  
  }
 
 @Override
 // sobrescribimos el metodo equals (lo heredamos de Object) 
  public boolean equals(Object o){
  
        FechaEncapsulada otra = (FechaEncapsulada) o;
        
        return  (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
  
  }
    
  public FechaEncapsulada(int d, int m, int a){
  
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

