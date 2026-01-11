import java.util.Scanner;


public class ejercicio5 {
    public static void main(String args[]){
        Scanner entrada =  new Scanner(System.in);
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;
        int suma;
        int multiplicacion;
        int division;
        suma = numero1 + numero2 + numero3 + numero4 + numero5;
        System.out.printf("La suma de todos los numeros es %d\n ", suma);
        multiplicacion = numero1 * numero2 * numero3 * numero4 * numero5;
        System.out.printf("La multiplicacion de todos los numeros es %d\n",multiplicacion );
        division = multiplicacion / 3;
        System.out.printf("La division de la multiplicacion entre 3 da %d\n",division);

        entrada.close();
    }
    
}
