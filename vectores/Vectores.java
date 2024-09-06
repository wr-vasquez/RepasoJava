import java.util.Scanner;
//Programa que carga un vector y cuenta cuantas veces se ingresó el numero 3

public class Vectores {
    public static void main(String[] args) {
        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        //Carga del vector
        for(int i = 0; i<15; i++){
            System.out.println("Ingrese un numero para llenar el vector: ");
            vector[i] = teclado.nextInt();
        }

        //recorrer y contar cuantos numeros 3 hay
        int cont = 0;
        for(int i = 0; i<15; i++){

            if (vector[i] == 3) {
                cont = cont +1;
                
            }
            
        }
        System.out.println("Se ha encontrado el numero 3: "+cont + " Veces");
        
    }
    
}
