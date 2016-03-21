package cap01;

import java.util.Scanner;

public class DemoArray2 {


    public static void main (String[] args){
    
    
        //muetra días de la semana usando un array
        
        String [] dias = {"lunes", "martes","miercoles","jueves","viernes","sabado","domingo"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un día (número)>>: ");
        int dia = sc.nextInt();
        
        
        
        if (dia <= dias.length) {
            
            System.out.println(dias[dia-1]);
            
        }else{
        
            System.out.println("Número de día incorrecto");
        }
        
        
    }
    
}
