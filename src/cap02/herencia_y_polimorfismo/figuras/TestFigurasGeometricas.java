/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

package cap02.herencia_y_polimorfismo.figuras;

import cap02.herencia_y_polimorfismo.figuras.Triangulo;
import cap02.herencia_y_polimorfismo.figuras.Rectangulo;
import cap02.herencia_y_polimorfismo.figuras.Circulo;

public class TestFigurasGeometricas {


    public static void main(String[] args){
    
        Rectangulo r = new Rectangulo(25, 10);
        Triangulo t = new Triangulo(25, 5);
        Circulo c = new Circulo(400);
        
        
        System.out.println("El área del rectángulo es: " + r);
        System.out.println("El área del triángulo es: " + t);
        System.out.println("El área del círculo es: " + c);
    
    
    }

    
}
