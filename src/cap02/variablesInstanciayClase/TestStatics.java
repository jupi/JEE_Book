package cap02.variablesInstanciayClase;

public class TestStatics {

    public static void main(String[] args) {

       // sumamos utilizando el metodo estatico
        double resultado = Statics.sumar(5, 5);
        
        System.out.println(resultado);
        
        // defi nimos un numero con valor x y luego
        // sumamos x con el metodo sumar de instancia
        Statics s1 = new Statics(10);
        
        s1.sumar(32);
        
        System.out.println(s1);
        
        s1.sumar(10).sumar(12).sumar(5);
        
        System.out.println(s1);
        
    }
    
}
