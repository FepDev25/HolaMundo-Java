public class ManejoArchivosMain {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        // ManejoArchivos.crearArchivo(nombreArchivo);

        String textoEscribir = "Hola me llamo Felipe y tengo 19 years\n";
        ManejoArchivos.escribirArchivo(nombreArchivo, textoEscribir);

        // ManejoArchivos.leerArchivo(nombreArchivo);

        String anexo = "Y estudio computer science";
        ManejoArchivos.anexarArchivo(nombreArchivo, anexo);

        ManejoArchivos.leerArchivo(nombreArchivo);

    }
}
