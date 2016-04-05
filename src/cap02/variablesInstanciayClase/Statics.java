/*
Métodos de la clase
--------------------------


Los métodos definidos como estáticos (static) se convierten en métodos de la clase
y pueden ser invocados directamente a través de la clase sin necesidad de instanciarla.

En general, podemos identificar estos métodos como “aquellos métodos cuyo valor de
retorno será determinado exclusivamente en función de sus argumentos y, obviamente,
no necesitan acceder a ninguna variable de instancia”.


*/

package cap02.variablesInstanciayClase;

public class Statics {
    
    //variable de instancia que permita guardar Nn valor concreto para cada objeto de la clase
    
    private double valor;
    
    //un constructor a través del cual asignaremos su valor inicial
   
        public Statics(double v){
    
        valor = v;
    
    }
    
    @Override
    public String toString(){
    
        return Double.toString(valor);
    
    }
     
    public static double sumar(double a, double b){
    
        return a + b;
    
    }
    
    /*
    Podemos pensar en sobrecargar al método sumar de forma tal que reciba un único
    argumento y sume su valor al valor de la variable de instancia. Claramente, este método
    será un método de instancia (es decir, no será estático) ya que “tocará” el valor de la
    variable de instancia valor.
    
    La versión sobrecargada del método sumar() suma el valor del parámetro a al de la
    variable de instancia valor y retorna una referencia a la misma instancia (this) con la
    cual se está trabajando.
       
    */    
    public Statics sumar (double a){
    
        valor+=a;
        return this;
    
    }
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
