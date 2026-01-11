import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char respuesta;

        do {
            System.out.print("Introduce el numero para calcular la suma: ");
            int numero = entrada.nextInt();
            // Calculamos suma
            int suma = 0;
            if (numero > 0){
                for (int i = 1;i <= numero;i++){
                    suma += i;
                }
                System.out.println("La suma de 1 hasta"+ numero + "es:" + suma);
            } else {
                System.out.print("Introduce un numero mayor que 0: ");
            }
            System.out.print("Si desea continuar escriba s, sino cualquier otra palabra: ");
            respuesta = entrada.next().toLowerCase().charAt(0);

        
        
        } while (respuesta == 's');

        System.out.print("El programa ha terminado");
        entrada.close();

        
    }
    
}
