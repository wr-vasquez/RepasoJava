// Crea una clase Persona con los atributos nombre, edad y dPi. Implementa un constructor para inicializar los atributos. 
// El programa debe pedir al usuario que ingrese los datos de una persona y mostrar la información, además de determinar 
// si es mayor de edad.
package ClasesObjetos ;


import java.util.Scanner;

class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void mostrarInfo() {
        System.out.println("*** MOSTRANDO DATOS ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DPI: " + dni);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}

public class Personas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();

        System.out.println("Ingrese su DPI:");
        String dni = sc.next();

        // Crear instancia de Persona
        Persona persona1 = new Persona(nombre, edad, dni);

        // Mostrar la información
        persona1.mostrarInfo();

        // Verificar si es mayor de edad
        if (persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}

