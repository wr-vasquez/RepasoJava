//Escribe un programa que busque y muestre el número más grande en un vector de enteros.

package vectores;

import java.util.Scanner;

public class BuscarMayorVector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Pedimos al usuario que ingrese el tamaño del vector
        System.out.println("** Ingresa el tamaño del vector ***");
        int tamanyo = scan.nextInt();

        //Creamos el vector
        int[] vector = new int[tamanyo];

        //Llenamos el vector con los valores ingresa[idor por el usuario
        System.out.println("Introduce los elementos del vector: ");
        for(int i=0; i<tamanyo; i++){
        vector [i] = scan.nextInt();
        }

        //Encontramos el numero mayor
        int mayor = vector[0];
        for(int i=1; i< tamanyo; i++){
            if(vector[i] > mayor){
                mayor = vector[i];
            }
        }
        
        //Mostramos el resultado
        System.out.println("El Número mayor es: "+mayor);
    }
}
