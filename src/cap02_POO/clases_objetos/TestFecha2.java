
package cap02_POO.clases_objetos;

import java.util.Scanner;

public class TestFecha2 {
    
             /*  
            Creamos los objetos f1 y f2 de la clase Fecha utilizando el constructor
            que recibe tres int (es decir, el que programamos nosotros). Luego mostramos los
            objetos con System.out.println quien invoca sobre estos el método toString. La
            salida será dd/mm/aaaa porque en la clase Fecha sobrescribimos el toString espefi -
            cicando este formato de impresión. Por último, comparamos las dos fechas utilizando el
            método equals que también sobrescribimos indicando que dos fechas son iguales si
            coinciden los valores de sus atributos dia, mes y anio.
            */

    public static void main(String[] args ){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese fecha 1 (dia, mes, año:");
        
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        
        Fecha f1 = new Fecha(dia, mes, anio);
        
        System.out.println("Ingrese la fecha dos: ");
        
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();
        
        Fecha f2 = new Fecha(dia, mes, anio);
        
        System.out.println("Fecha 1 = " + f1);
        System.out.println("Fecha 2 = " + f2);
        
        if (f1.equals(f2)) {
            
            System.out.println("las fechas son iguales");
        } else {
        
            System.out.println("Las fechas no son iguales");
            
            
            
            
        }
        
        
    }
    
}
