/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

package cap02.herencia_y_polimorfismo.figuras;

public class Rectangulo extends FiguraGeometrica {
    
    private double base, altura;
    
    public Rectangulo(double b, double h){
    
        base = b;
        altura = h;
    
    }
    
    public double area(){
    
    return base * altura;
    
    
    }
    

    
}
