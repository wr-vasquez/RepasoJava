//Dado un arreglo de enteros, encuentra el valor máximo.
public class MaximoValorArreglo {
    public static void main(String[] args) {
        
        int numeros [] = {10,4,15,6,20,1};//Arreglo
        int maximo = numeros[0]; //Asumimos que el primer elemento es el máximo
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        System.out.println("El valor máximo es: "+ maximo);
    }
}

// Se inicializa la variable maximo con el primer valor del arreglo.
// A medida que iteramos por el arreglo, si encontramos un número mayor que maximo, lo actualizamos.
// Al final, mostramos el valor máximo.
