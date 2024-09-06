//Escribe un programa en Java que, dado un vector de enteros, calcule la suma de todos sus elementos.


package vectores;

import java.util.Scanner;

public class SumaVector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Pedimos al usuario el tamaño del vector
        System.out.println("Introduce el tamaño del vector: ");
        int tamVect = scan.nextInt();

        //Creamos el vector
        int[] vector = new int[tamVect];

        //Rellenamos el vector con los valores ingresador por el usuario
        System.out.println("Introduce los elementos del vector: ");
        for(int i=0; i<tamVect; i++){
            vector[i] = scan.nextInt();
        }

        //Calculamos la suma
        int suma = 0;
        for(int i = 0; i<tamVect; i++){
            suma += vector[i];
        }

        System.out.println("La suma de los elementos es: "+suma);
        
    }
}
