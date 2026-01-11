import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int origen [] = {10, 28, 4, 50, 25, 32, 8, 100, 22};

        int destino [] = new int[origen.length];

        int contador = 0 ;

        for (int i = 0; i < origen.length ; i++){
            if (origen[i] % 2 == 0 && origen[i] > 25 ){
                destino[contador] = origen[i];
                contador++;
            }
        }
        
       System.out.println("Vector de Origen: " + Arrays.toString(origen));
       System.out.println("Vector de Destino (pares > 25): " + Arrays.toString(destino)); 

       entrada.close();

        
    }
    
}
