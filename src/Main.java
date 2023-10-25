public class Main {

    public static void main(String[] args) {
        Utils utils = new Utils();
        int numero = utils.pedirNumero();
        int digitos = utils.devolverDigitos(numero);
        if (digitos == 1){
            String valor = utils.mapearUnidades(numero);
            System.out.println("Tu numero con letras es: " + valor);
        }
        if (digitos == 2){
            int[] cifras = utils.separarDigitos(numero);
            if (cifras[0] == 1 && (cifras[1] > 0 && cifras[1] < 6)){
                String valor = utils.mapearValoresEspeciales(numero);
                System.out.println("Tu numero con letras es: " + valor);
            }
            if (cifras[1] == 0){
               String valor = utils.mapearDecenas(numero);
               System.out.println("Tu numero con letras es: " + valor);
            }
            if (cifras[0] > 2 && cifras[1] != 0){
                String unidad = utils.mapearUnidades(cifras[1]);
                String decena = utils.mapearDecenas(cifras[0] * 10);
                System.out.println("Tu numero con letras es: " + decena + " y " + unidad);
            }
            if ((cifras[0] == 1 && cifras[1] > 5) || cifras[0] == 2 ){
                String unidad = utils.mapearUnidades(cifras[1]);
                String decena = utils.mapearValoresEspeciales(cifras[0]);
                System.out.println("Tu numero con letras es: " + decena + unidad);
            }
        }
        if (digitos == 3){
            System.out.println("Tu numero con letras es: cien");
        }
    }

}
