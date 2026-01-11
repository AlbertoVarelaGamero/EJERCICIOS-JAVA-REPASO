import java.util.Scanner;


public class ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes_par = 31;
        int mes_impar = 30;
        int febrero = 28;
        int año = 365;
        System.out.print("Introduce el numero de un mes: ");
        int respuesta = entrada.nextInt();

        int resp = respuesta % 2;
        if (respuesta == 2){
            System.out.println("El mes que ha introducido tiene " + febrero + " dias." );
        }
        if (resp == 0){
            System.out.println("El mes que ha introducido tiene "+ mes_par +" dias.");} 
            else {System.out.println("El mes que ha introducido tiene " + mes_impar + " dias." );}
        
        System.out.print("Introduce un año: ");
        int años = entrada.nextInt();

        if (años >= 1000 && años <= 9999){
            System.out.println("El año introducido tiene: " + año + " dias.");
        } else {
            System.out.print("El año introducido no tiene 4 digitos.");
        } 
        entrada.close();



    }
    
}
