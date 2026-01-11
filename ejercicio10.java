import java.util.Scanner;


public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce un numero positivo, negativo para terminar: ");
        while (true) {
            numero = entrada.nextInt();

            // si el numero es negativo se acaba el bucle.
            if (numero < 0){
                break;
            }
            if (numero > maximo){
                maximo = numero;
            }
            if (numero < minimo){
                minimo = numero;
            }
            // acumular para la media
            suma += contador;
            //suma = suma + contador
            contador++;
            //contador = contador + 1
        }
        if (contador > 0){
            double media = (double) suma / contador;
            System.out.println("Minimo: "+ minimo);
            System.out.println("Maximo: "+ maximo);
            System.out.println("media:"+ media);
        } else{
            System.out.println("No se introdujeron numeros positivos.");
        }


        entrada.close();
    }
    
}
