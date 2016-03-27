/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

package cap02.herencia_y_polimorfismo.figuras;

public class TestFiguraGeometrica2 {

    public static void main(String[] args) {
    
        Circulo2 c = new Circulo2(23);
        Triangulo2 t = new Triangulo2(12, 12);
        Rectangulo2 r = new Rectangulo2(12, 12);
        
        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
        
        
        
    }
    
}
