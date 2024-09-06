//Dado un arreglo de enteros, encuentra la suma de todos sus elementos.


public class SumaArrreglo {
    public static void main(String[] args) {
        int[] numeros ={1,2,3,4,5};//Arreglo
        int suma = 0; 

        for(int i =0; i<numeros.length; i++){
            suma += numeros[i] ;//Sumar cada elemento
        }
        System.out.println("La suma de los elementos es: "+ suma);
        
    }
    

}

// Definimos un arreglo numeros con algunos elementos.
// Inicializamos una variable suma en 0.
// Iteramos sobre el arreglo y sumamos cada uno de los elementos.
// Finalmente, mostramos el resultado de la suma.