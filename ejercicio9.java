import java.util.Scanner;

public class ejercicio9 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.print("Dame un numero entero mayor que 0: ");
        n = entrada.nextInt();

        if (n <= 0){
            System.out.println("El numero debe ser mayor que 0.");
        }else {
            int suma = 0;

            for (int i = 1; i <= n; i++){
                suma = suma + i;

            }
            System.out.println("La suma de 1 hasta " + n + " es: " + suma);

        }
       
        entrada.close();

    }
    
}
