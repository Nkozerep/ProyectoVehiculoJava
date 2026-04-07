import java.util.Scanner; // Importa la clase Scanner para leer datos

public class Vehiculo { // Clase principal del programa

    public static void main(String[] args) { // Método principal

        Scanner sc = new Scanner(System.in); // Crear objeto Scanner

        System.out.print("Ingrese la marca: "); // Solicita marca
        String marca = sc.nextLine(); // Guarda la marca

        System.out.print("Ingrese el modelo: "); // Solicita modelo
        String modelo = sc.nextLine(); // Guarda el modelo

        System.out.print("Ingrese la cilindrada: "); // Solicita cilindrada
        int cilindrada = sc.nextInt(); // Guarda la cilindrada
        sc.nextLine(); // Limpia buffer

        System.out.print("Ingrese el tipo de combustible: "); // Solicita combustible
        String combustible = sc.nextLine(); // Guarda el combustible

        System.out.print("Ingrese capacidad de pasajeros: "); // Solicita pasajeros
        int pasajeros = sc.nextInt(); // Guarda pasajeros

        System.out.println("La marca que ha ingresado es: " + marca); // Muestra marca
        System.out.println("El modelo que ha ingresado es: " + modelo); // Muestra modelo
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // Muestra cilindrada
        System.out.println("El tipo de combustible es: " + combustible); // Muestra combustible
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros."); // Muestra pasajeros
    }
}