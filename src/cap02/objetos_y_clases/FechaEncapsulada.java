/*
ENCAPSULAMIENTO:
------------------
*Uno de los objetivos que debemos perseguir cuando programamos clases es poder encapsular
la complejidad que emerge de las operaciones asociadas a sus atributos. Me
refi ero a que debemos hacerle la vida fácil al programador que utilice objetos de nuestras
clases exponiéndole las operaciones que podría llegar a necesitar, pero ocultándole la
complejidad derivada de las mismas.

OBJETIVO:
---------
*Vamos a definir en la clase FechaEncapsulada el método addDias, que nos permitirá
añadir días a una fecha sin preocuparse por conocer el algoritmo que resuelve este problema. 

*Para simplificar, consideremis que todos los meses tienen 30 días, por lo tanto, 
en esta versión de la clase Fecha los años tendrán 360 días (12 meses por 30 días cada uno). 

El algoritmo para sumar días a una fecha consistirá en convertir la fecha a días,
sumarle los días que se desean sumar y (teniendo la nueva fecha expresada en días) separarla en día, mes y año para asignar cada uno de
estos valores en los atributos que correspondan.

Entonces SERÁN TRES LOS MÉTODOS A PROGRAMAR:
---------------------------------------------
• El método addDias será el método que vamos a “exponer” para que los usuarios
de la clase puedan invocar y así sumarle días a sus fechas.

• Desarrollaremos también el método fechaToDias que retornará un entero para
representar la fecha expresada en días. Este método no lo vamos a “exponer”. Es
decir, no será visible para el usuario: será private (privado).

• Por último, desarrollaremos el método inverso: diasToFecha que dado un valor
entero que representa una fecha expresada en días, lo separará y asignará los valores
que correspondan a los atributos dia, mes y anio. Este método también será
private ya que no nos interesa que el usuario lo pueda invocar. 

 */
package cap02.objetos_y_clases;

public class FechaEncapsulada {
    
    private int dia, mes, anio;

    //método privado (encapsulado) que retorna la fecha convertida en dias
    private int fechaToDias() {
        
        return anio * 360 + mes * 30 + dia;
        
    }

    //método privado (encapsulado) que asigna la fecha expresada en días a los atributos
    private void diasToFecha(int i) {

        //dividimos entre 360 y obtenemos el anio
        anio = (int) i / 360;

        //del resto de la división anterior podremos obtener el mes y el día
        int resto = i % 360;

        //el mes es el resto dividido entre trenta
        mes = (int) resto / 30;

        //el resto de la opearicón anterior son los días
        dia = resto % 30;

        //ajuste por si dia queda en 0
        if (dia == 0) {
            
            dia = 30;
            mes--;
        }

        //ajuste por si mes queda en 0
        if (mes == 0) {
            mes = 12;
            anio--;
            
        }
        
    }
    //este método será el que expondremos de manera pública y contenndrá la lógica 
    //encapsulada para el usuario final
    
    public void addDias(int d) {

        //convierto la fecha a dias y le sumo d
        int sum = fechaToDias() + d;

        //la fecha resultante (sum) la separo en dia, mes, anio
        diasToFecha(sum);
    }

    //sobrecargamos el constructor pasándole como argumento una cadena
    public FechaEncapsulada(String s) {

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
        String smes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(smes);

        //Tomamos la subcadena ubicada entre pos2+1, la convertimos
        //a int y la asignamos en el atributo mes.
        String sanio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sanio);
        
    }
    
    @Override

    // sobrescribimos el metodo toString (lo heredamos de Object)     
    public String toString() {

        //retorna la cadena tal como queremos que vea la fecha
        return dia + "/" + mes + "/" + anio;
        
    }
    
    @Override
    // sobrescribimos el metodo equals (lo heredamos de Object) 
    public boolean equals(Object o) {
        
        FechaEncapsulada otra = (FechaEncapsulada) o;
        
        return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
        
    }
    
    public FechaEncapsulada(int d, int m, int a) {
        
        dia = d;
        mes = m;
        anio = a;
        
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
