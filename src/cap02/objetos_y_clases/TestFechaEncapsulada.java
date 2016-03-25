/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Los métodos estáticos pueden invocarse directamente
sobre la clase sin necesidad de instanciarla primero
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/

/*
 Ejemplo: suma días a una fecha.
--------------------------------
Ahora podemos desarrollar una aplicación en la que el usuario ingrese una fecha expresada
en formato dd/mm/aaaa y una cantidad de días para sumarle, y nuestro programa
le mostrará la fecha resultante.
 */
package cap02.objetos_y_clases;

import java.util.Scanner;

public class TestFechaEncapsulada {

    public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Igrese una fecha (dd/mm/año): ");
        
        String sFecha = sc.next();
        
        FechaEncapsulada f = new FechaEncapsulada(sFecha);
    
        System.out.println("La fecha es: " + f);
        
        System.out.println("Ingrese días a sumar (puede ser negativo): ");
        
        int diasSum = sc.nextInt();
        
        f.addDias(diasSum);

        System.out.println("Sumando " + diasSum + " días a la fecha introducida, queda: " + f);
        
        
    
    }
    
}
