/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

package cap02.herencia_y_polimorfismo.figuras;

public class TestFigurasGeometricas {


    public static void main(String[] args){
    
        Rectangulo r = new Rectangulo(25, 10);
        Triangulo t = new Triangulo(25, 5);
        Circulo c = new Circulo(400);
        
        
        System.out.println("El área del rectángulo es: " + r);
        System.out.println("El área del triángulo es: " + t);
        System.out.println("El área del círculo es: " + c);
    
        /*
        • Las clases Circulo2, Rectangulo2 y Triangulo2 heredan el método toString
        definido en FiguraGeometrica2 (heredado de Object). Recordemos que dentro
        de este método invocábamos al método area (abstracto).
        
        • Cuando en toString se invoca al método area en realidad se está invocando al
        método area de la clase concreta del objeto sobre el cual se invocó el toString.
        Por este motivo, resulta que el cálculo del área es correcto para las tres fi guras que
        defi nimos en el main.
        */
        
    
    }

    
}
