/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/


package cap02.herencia_y_polimorfismo.figuras;

public class Circulo extends FiguraGeometrica{

    private int radio;
    
public Circulo(int r){

    radio = r;


}

public double area(){

return Math.PI*Math.pow(radio, 2);

}


    
}

