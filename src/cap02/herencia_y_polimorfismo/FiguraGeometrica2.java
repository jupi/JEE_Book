/*
Que una clase abstracta no pueda ser instanciada no implica que esta no pueda tener
constructores. De hecho (como sucede con todas las clases), si no defi nimos un constructor
explícitamente igual existe el constructor nulo.
¿Qué sentido tiene defi nir un constructor en una clase que no podremos instanciar? El
sentido es el de “obligar” a las subclases a settear los valores de los atributos de la clase
base (en este caso la clase abstracta).
Agregaremos el atributo nombre en clase FiguraGeometrica y también un constructor
que reciba el valor para este atributo. Así cada fi gura podrá guardar su nombre para
brindar información más específi ca al momento de defi nir el método toString.
 
 */
package cap02.herencia_y_polimorfismo;

public class FiguraGeometrica2 {
    
}
