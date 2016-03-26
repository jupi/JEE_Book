/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/



package cap02.objetos_y_clases.fecha;

public class TestFechaSobrecargada {

    public static void main (String [] args){
    
        FechaSobrecarga f = new FechaSobrecarga("10/05/2014");
        
        System.out.println(f);
    
    }
    

    
}
