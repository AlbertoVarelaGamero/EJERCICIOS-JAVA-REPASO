import java.util.Scanner;

public class ejercicio7 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int resto;

        System.out.print("Escribe un numero entero: ");
        numero = entrada.nextInt();

        resto = numero % 2;
        if (resto == 0){
            System.out.printf("El numero es par");
        }



    
        entrada.close();
    }
    
}
