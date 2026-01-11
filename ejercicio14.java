import java.util.Scanner;


public class ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int enteros [] = {10,20,30,40,50,60,70,80,90,100};
        int suma = 0;

        for (int num : enteros ) {
            suma = suma + num; 
        }
        System.out.println("La suma de todos los elementos: " + suma);

        entrada.close();
        
        
        }
    
}
