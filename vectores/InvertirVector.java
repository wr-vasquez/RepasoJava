
//Escribe un programa que invierta los elementos de un vector.

package vectores;

import java.util.Scanner;

public class InvertirVector {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     //Pedimos al usuario el tamaño del vector
     System.out.println("Ingresa el tamaño del vector: ");
     int tamanyo = scan.nextInt();

     //Creamos el vector
     int[] vector = new int[tamanyo];

     //Llenamos el vector con los valores ingresados

     System.out.println("Ingresa los valores del vector: ");
     for(int i = 0; i<tamanyo; i++ ){
      //System.out.println("Ingresa los valores del vector: ");
        vector[i]=scan.nextInt();
     }

     //Invertimos el vector
     System.out.println("El vector invertido es: ");
     for(int i = tamanyo - 1; i>=0; i--){
        System.out.println(vector[i]+" ");
     }

    }
}
