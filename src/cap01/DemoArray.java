package cap01;

import java.util.Scanner;

public class DemoArray {

    public static void main(String[] args) {

        //defino un array de diez enteros
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor (0=>fin): ");

        //asigno la entrada por teclado a v
        int v = sc.nextInt();

        int i = 0;

        //mientras 
        while (v != 0 && i < 10) {

            arr[i++] = v;
            System.out.println("Ingrese un valor (0=>fin): ");
            v = sc.nextInt();

        }
        
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
            
        }

    }

}
