package cap02.herencia_y_polimorfismo.figuras;


public class TestAreaPromedio {

    
    public static void main(String[] args){
    
        FiguraGeometrica2 arr[] = {
                                    new Circulo2(25),
                                    new Rectangulo2(10, 10),
                                    new Triangulo2(12, 12)};
        
        double prom = FiguraGeometrica2.areaPromedio(arr);
                                   
        System.out.println("promedio = " + prom);
    
    }
    
}
