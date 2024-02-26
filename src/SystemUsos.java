import java.util.*;

public class SystemUsos {

    public static void main(String[] args) {
        // Ejemplo de uso de out
        System.out.println("Hola, mundo!");

        // Ejemplo de uso de System.in
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.println("El número ingresado es: " + numero);

        // Ejemplo de uso de System.err
        System.err.println("Este es un mensaje de error");

        // Ejemplo de uso de currentTimeMillis
        long tiempoInicio = System.currentTimeMillis();

        // Hacer alguna tarea que tome tiempo
        int k = 0;
        for (int i = 0; i < 100000000; i++) {
            k += i;
        }

        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;
        System.out.println("Tiempo total de ejecución: " + tiempoTotal + " milisegundos");

        // Obtener la versión del sistema operativo
        String versionSO = System.getProperty("os.version");
        System.out.println("Versión del sistema operativo: " + versionSO);

        // Obtener el nombre del sistema operativo
        String nombreSO = System.getProperty("os.name");
        System.out.println("Nombre del sistema operativo: " + nombreSO);

        // Obtener la arquitectura del sistema operativo
        String arquitecturaSO = System.getProperty("os.arch");
        System.out.println("Arquitectura del sistema operativo: " + arquitecturaSO);

        // Obtener el directorio de trabajo actual
        String directorioActual = System.getProperty("user.dir");
        System.out.println("Directorio de trabajo actual: " + directorioActual);

        // Obtener el nombre del usuario
        String nombreUsuario = System.getProperty("user.name");
        System.out.println("Nombre de usuario: " + nombreUsuario);

        // Obtener todas las variables de entorno
        Map<String, String> variablesEntorno = System.getenv();

        // Imprimir todas las variables de entorno
        System.out.println("Variables de entorno:");
        for (Map.Entry<String, String> entry : variablesEntorno.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        String username = System.getenv("USER");
        System.out.println("USER = " + username);

        // Ejemplo de uso de exit
        System.exit(0); // Termina la aplicación con éxito (código de salida 0)
    }

}
