
// Ejercicio 1: Polimorfismo con Herencia
// Problema: Crear una clase Empleado con un método calcularSalario(). Luego, crear dos clases hijas, 
// EmpleadoTiempoCompleto y EmpleadoMedioTiempo, que sobrescriban el método para calcular el salario según el tipo de empleo.

package Polimorfismo;

import java.util.Scanner;
//Clase Padre
class Empleado{
    protected String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    //Método que será sobrescrito por las clases hijas
    public double calcularSalario (){
        return 0.0;
    }

    public void mostrarInfo(){
        System.out.println("Empleado: "+nombre);
    }
}

//CLASE HIJA
class EmpleadoTiempoCompleto extends Empleado{
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual){
        super(nombre);
        this.salarioMensual = salarioMensual;

    }

    @Override
    public double calcularSalario(){
        return salarioMensual;
    }
}


//Clase hija EmpleadoMedioTiempo
class EmpleadoMedioTiempo extends Empleado{
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, double salarioPorHora, int horasTrabajadas){
        super(nombre);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public double calcularSalario(){
        return salarioPorHora * horasTrabajadas;
    }
}





public class Polimconherencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Solicitar tipo de empleado
        System.out.println("Elige el tipo de empleado (tiempo completo/medio tiempo)");
        String tipoEmpleado = scan.nextLine();

        //Solicitar el nombre del empleado
        System.out.println("Introduce el nombre del empleado");
        String nombre = scan.nextLine();

        Empleado empleado;

        //Según el tipo de empleado solicitamos los datos correspondientes
        if(tipoEmpleado.equalsIgnoreCase("tiempo completo")){
            System.out.println("Introduce el salario mensual");
            double salarioMensual = scan.nextDouble();
            empleado = new EmpleadoTiempoCompleto(nombre, salarioMensual);

        }else if(tipoEmpleado.equalsIgnoreCase("medio tiempo")){
            System.out.println("Introduce el salario por hora: ");
            double salarioPorHora = scan.nextDouble();
            System.out.println("Introduce las horas trabajadas: ");
            int horasTrabajadas = scan.nextInt();
            empleado = new EmpleadoMedioTiempo(nombre,salarioPorHora,horasTrabajadas);

        }else{
            System.out.println("Tipo de empleado no es válido.");
            return;
        }
        //Mostrar la información del empleado
        empleado.mostrarInfo();
        System.out.println("Salario: "+empleado.calcularSalario());
        }
}
