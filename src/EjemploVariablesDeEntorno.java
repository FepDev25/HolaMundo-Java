import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        // Obtener todas las variables de entorno
        Map<String, String> variablesEntorno = System.getenv();

        // Imprimir todas las variables de entorno
        System.out.println("Variables de entorno:");
        for (Map.Entry<String, String> entry : variablesEntorno.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
