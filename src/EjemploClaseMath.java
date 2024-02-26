public class EjemploClaseMath {
    public static void main(String[] args) {

        // Valor absoluto
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        // Número máximo
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        // Número mínimo
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Redondear para arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Redondear para abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        // Redondear
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        // Euler elevado a parámetro
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        // Log base parámetro
        double log = Math.log(10);
        System.out.println("log = " + log);

        // Potencia
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        // Raíz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        // Radianes a grados
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        // Grados a radianes
        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        // Funciones trigonométricas
        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));

        double arcSin = Math.asin(0.5);
        System.out.println("arcSin(0.5): " + Math.toDegrees(arcSin));

        double arcCos = Math.acos(0.5);
        System.out.println("arcCos(0.5): " + Math.toDegrees(arcCos));

        double arcTan = Math.atan(1);
        System.out.println("arcTan(1): " + Math.toDegrees(arcTan));

        // Hipotenusa
        double hipotenusa = Math.hypot(3, 4);
        System.out.println("hipotenusa(3, 4): " + hipotenusa);

    }
}
