/*
Que una clase abstracta no pueda ser instanciada no implica que esta no pueda tener
constructores. De hecho (como sucede con todas las clases), si no definimos un constructor
explícitamente igual existe el constructor nulo.

¿Qué sentido tiene definir un constructor en una clase que no podremos instanciar? El
sentido es el de “obligar” a las subclases a settear los valores de los atributos de la clase
base (en este caso la clase abstracta).

Agregaremos el atributo nombre en clase FiguraGeometrica y también un constructor
que reciba el valor para este atributo. Así cada fi gura podrá guardar su nombre para
brindar información más específi ca al momento de defi nir el método toString.

 */
package cap02.herencia_y_polimorfismo.figuras;

public abstract class FiguraGeometrica2 {

    private String nombre;

    //metodo abstracto

    public abstract double area();

    public FiguraGeometrica2(String nom){

        nombre = nom;

    }

    public String toString(){

        return nombre + "(area = " + area() + ")";

    }

    public String getNombre(){

        return nombre;
    }


    public void setNombre(String nombre){

        this.nombre = nombre;
        
    }
     
    
    
        //ahora tenemos que modificar las subclases e invocar explícitamente al constructor 
        //definido en la clase base...
    
    
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    
    
        /*
        Por último, informalmente, dijimos que los métodos estáticos pueden invocarse directamente
        sobre las clases sin necesidad de instanciarlas. Podríamos defi nir un método
        estático en la clase FiguraGeometrica para calcular el área promedio de un conjunto
        de figuras. 
        */
    
    public static double areaPromedio(FiguraGeometrica2 arr[]){
    
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            sum += arr[i].area();
            
        }
        return sum/arr.length;
    
    }
    
        /*
        Es fundamental notar la importancia y el poder de abstracción que se logra combinando
        métodos abstractos con polimorfismo. En el método areaPromedio, recorremos el
        conjunto de figuras y a cada elemento le invocamos el método area sin preocuparnos
        por averiguar cuál es la figura concreta. Nos alcanza con saber que es una figura geomé-
        trica y (por lo tanto) que tiene el método area. Cada figura resolverá este método tal
        como lo defina su propia clase, por polimorfismo
        */
    
    
}
