//Escribe un programa que multiplique todos los elementos de un vector por un número dado por el usuario.

package vectores;
import java.util.Scanner;
public class MultiplicarVector {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Pedimos al usuario el tamaño del vector
        System.out.println("Ingresa el tamaño del Vector: ");
        int tamanyo = scan.nextInt();

        //Creamos el vector con los datos recibidos
        int[] vector = new int[tamanyo];
        

        //Rellenamos el vector con los valores ingresados
        System.out.println("Imgresa los elementos del vector");
        for(int i = 0; i< tamanyo; i++){
            vector[i] = scan.nextInt();
        }

        //Pedimos el numero para multiplicar
        System.out.println("Introduce el numero por el que quieras multiplicar");
        int num = scan.nextInt();
     
        //Multiplicamos y mostramos el vector resultante
        System.out.println("El vector resultante es: ");
        for(int i=0; i<tamanyo; i++){
      System.out.println(vector[i] * num + " ");
        }

    }
}

