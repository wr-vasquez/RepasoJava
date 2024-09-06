//Dado dos arreglos de enteros, fusiona ambos en un solo arreglo.

import java.util.Arrays;

public class FusionarArreglos {
    public static void main(String[] args) {
        int[] arreglo1 = {1,2,3};
        int[] arreglo2 = {4,5,6};

        int[] fusionado = new int[arreglo1.length + arreglo2.length]; // Se crea un arreglo con tamaño suficiente
        
        //Copiamos los elementos del primer arreglo
        for(int i=0; i < arreglo1.length; i++){
            fusionado[i]=arreglo1[i];

        }

        //Copiamos los elementos del segundo arreglo
        for(int i=0; i<arreglo2.length; i++){
            fusionado[arreglo1.length + i]=arreglo2[i];

        }
        System.out.println("Arreglo fusionado: "+Arrays.toString(fusionado));
    }
}
