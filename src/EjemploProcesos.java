import java.io.IOException;

public class EjemploProcesos {

    public static void main(String[] args) {
        EjemploProcesos ejemplo = new EjemploProcesos();
        ejemplo.ejecutarComandos();
    }

    public void ejecutarComandos() {
        try {
            // Ejemplos de comandos
            ejecutarComando("open -a TextEdit");
            ejecutarComando("ls -l"); // Listar archivos en el directorio
            ejecutarComando("pwd");   // Mostrar directorio actual
            ejecutarComando("whoami"); // Mostrar nombre de usuario

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void ejecutarComando(String comando) throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process proceso = rt.exec(comando);

        // Esperar a que el proceso termine
        proceso.waitFor();

        // Imprimir el resultado del comando (opcional)
        System.out.println("Resultado del comando '" + comando + "': " + proceso.exitValue());
    }
}

