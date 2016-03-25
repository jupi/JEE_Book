/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

package cap02.herencia_y_polimorfismo;

public class Triangulo extends FiguraGeometrica {

    private double base, altura;
    
    
    public Triangulo(int b, int h){
    
        base = b;
        altura = h;
        
    }

    public double area(){
    
        return base*altura /2;
    
    }

    
}
