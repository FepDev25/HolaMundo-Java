public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos nº " + i + ": " + args[i]);
        }

        // javac ArgumentosLineaComando.java
        // java ArgumentosLineaComando

        // javac ArgumentosLineaComando.java -encoding utf8 (para acentos)

        // Se puede hacer un Run con parámetros, configurar arriba
    }
}
