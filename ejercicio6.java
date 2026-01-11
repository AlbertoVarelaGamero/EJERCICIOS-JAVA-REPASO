import java.util.Scanner;

public class ejercicio6 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int multiplicacion;
        int resultado1;
        int resultado2;
        int suma;


        System.out.print("Escribe un numero entero: ");
        numero = entrada.nextInt();
        multiplicacion = numero * 20;
        resultado1 = multiplicacion / 10;
        System.out.printf("El primer resulado es: %d\n",resultado1);

        suma = numero + multiplicacion;
        resultado2 = suma / 10;
        System.out.printf("El suegundo resultado es: %d\n ",resultado2);

        int resto = suma % 10;
        if (resto != 0){
            System.out.printf("El resto es: %d\n", resto);
        }


        

    entrada.close();

    }

    
}
