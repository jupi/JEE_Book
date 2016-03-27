/*
Algún lector con experiencia podrá pensar que estamos hardcodeando el nombre “Rectángulo”,
pero no es así. Se trata del nombre de la figura y este nunca podrá cambiar
arbitrariamente.
*/


package cap02.herencia_y_polimorfismo.figuras;

public class Triangulo2 extends FiguraGeometrica2{
    
    private int base, altura;
    
        /*
        Lo primero que debemos hacer en el constructor de la clase derivada es invocar al constructor
        del padre. Como el constructor de FiguraGeometrica espera recibir el nombre
        de la figura le pasamos como argumento nuestro propio nombre: "Rectángulo".
        */
    
    public Triangulo2(int b, int h){

        
        super("Triangulo2");
        base = b;
        altura = h;
    }
    
    
    public double area(){
    
        return base * altura / 2;
    
    }
    
}
