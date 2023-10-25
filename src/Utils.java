import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    Map<Integer, String> unidades = Map.of(
            0, "cero",
            1, "uno",
            2, "dos",
            3, "tres",
            4, "cuatro",
            5, "cinco",
            6, "seis",
            7, "siete",
            8, "ocho",
            9, "nueve"
    );

    static Map<Integer, String> decenas =  Map.of(
            10, "diez",
            20, "veinte",
            30, "treinta",
            40, "cuarenta",
            50, "cincuenta",
            60, "sesenta",
            70, "setenta",
            80, "ochenta",
            90, "noventa"
    );

    static Map<Integer, String> valoresEspeciales = Map.of(
            11, "once",
            12, "doce",
            13, "trece",
            14, "catorce",
            15, "quince",
            1, "dieci",
            2, "veinti"
    );
    int pedirNumero(){
        int numero = -1;
        while (numero < 0 || numero > 100){
            System.out.print("Introduce el numero a convertir (0-100): ");
            try {
                numero = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Input incorrecto.");
                scanner.next();
            }
        }
        return numero;
    }

    // Determina si el numero que se introduce como parametro tiene 1, 2 o 3 digitos en este caso.
    int devolverDigitos(int numero){
        int digitos = 1;
        if (numero / 100 == 1) {
            digitos = 3;
            return digitos;
        }
        if (numero / 10 > 0) {
            digitos = 2;
            return digitos;
        }
        return digitos;
    }

    String mapearUnidades(int numero){
        return unidades.get(numero);
    }

    // Este metodo se aplica solo en numeros de dos cifras, y separa las decenas de las unidades, devolviendolas en un array.
    int[] separarDigitos(int numero){
        int[] cifras = new int[2];
        cifras[0] = numero / 10;
        cifras[1] = numero % 10;
        return cifras;
    }

    String mapearValoresEspeciales(int numero){
        return valoresEspeciales.get(numero);
    }

    String mapearDecenas(int numero){
        return decenas.get(numero);
    }

}
