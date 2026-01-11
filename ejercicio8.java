import java.util.Scanner;

public class ejercicio8 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un numero entero: ");
        numero = entrada.nextInt();

        if (numero < 0){
            System.out.println("Los números negativos no pueden ser cuadrados de un entero.");
        } else{
            double raiz = Math.sqrt(numero);

            if (raiz == (int)raiz){
                System.out.printf("El número %d es un cuadrado perfecto (es el cuadrado de %d).\\n" + "\", numero, (int)raiz");
            }else{
                System.out.printf("El número %d NO se puede expresar como el cuadrado de un entero.\n", numero);
            }} 
            entrada.close();
        }


        }
    

