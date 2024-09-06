// Crea una clase Persona con los atributos nombre, edad y dpi. 
// Implementa un constructor para inicializar los atributos, 
// además de métodos para mostrar la información de la persona y determinar si es mayor de edad.

package ClasesObjetos;

//Definimos la clase Persona
class Persona {
    //Atributos de la clase
    private String nombre;
    private int edad;
    private String dpi;

    //Constructor para inicializar los atributos
    public Persona(String nombre, int edad, String dpi){
        this.nombre = nombre;
        this.edad = edad;
        this.dpi = dpi;
    }

    //Método para mostrar la información de la persona
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("DPI: "+dpi);
    }


    //Método para verificar si la persona es mayor de edad
    public boolean esMayordeEdad(){
        return edad >=18;
    }

    
}

public class Personas {
    public static void main(String[] args){
        //Creacion de una instancia de la clase persona
       Persona persona1 = new Persona ("Juan",25,"24782754510609");

       //Mostrar información de la persona
       persona1.mostrarInfo();

       //Verificar si es mayor de edad
       if(persona1.esMayordeEdad()){
        System.out.println("Es mayor de edad");
       }else{
        System.out.println("No es mayor de edad");
       }
    }

}


