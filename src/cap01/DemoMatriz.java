/*

una matriz es un array de dos dimensiones
        
también podríamos decir que una matriz es un array de arrays. Viéndolo de esta manera
entonces podemos conocer la cantidad de filas y columnas de una matriz a través del atributo length.

int [][]mat = new int[5][3];
int filas = mat.length; // cantidad de filas
int colums = mat[0].length; // cantidad de columnas
Se puede inicializar una matriz DEFINIENDO SUS VALORES POR EXTENSIÓN:


int mat[][] = { {3, 2, 1 }
 ,{5, 3, 7 }
 ,{1, 9, 2 }
 ,{4, 6, 5 } };

Esto dimensiona la matriz mat con 4 filas y 3 columnas y además asigna los valores en
las celdas correspondientes.
 */
package cap01;

import java.util.Scanner;

public class DemoMatriz {

    public static void main(String[] args) {

/*
Ejemplo: llena matriz con números aleatorios.
En el siguiente programa, pedimos al usuario que ingrese las dimensiones de una matriz
(fi las y columnas), creamos una matriz de esas dimensiones y la llenamos con números
generados aleatoriamente
*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        int n = sc.nextInt();

        System.out.println("Ingrese la cantidad de columnas: ");
        int m = sc.nextInt();

        //creo la matriz con los números intro por consola...
        int mat[][] = new int[n][m];

        int nmro;

        //for anidado para generar las dos dimensiones del array
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                // genero un numero aleatorio entre 0 y 1000 casteando a int
                nmro = (int) (Math.random() * 1000);

                // asigno el numero en la matriz
                mat[i][j] = nmro;

            }

        }

        //lo pinto todo
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                //pinto los valores del bucle anidados
                System.out.println(mat[i][j] + "\t");

            }

            System.out.println();

        }

    }

}
