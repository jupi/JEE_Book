package cap02.herencia_y_polimorfismo.figuras;

public class Circulo2 extends FiguraGeometrica2 {

    
    private int radio;
    
        /*
        Lo primero que debemos hacer en el constructor de la clase derivada es invocar al constructor
        del padre. Como el constructor de FiguraGeometrica espera recibir el nombre
        de la figura le pasamos como argumento nuestro propio nombre: "Rectángulo".
        */
    public Circulo2(int r){
    
        super ("Circulo");
        radio = r;
    }

    @Override
    public double area(){
    
        return Math.PI * Math.pow(radio, 2);
    
    }

    
}
