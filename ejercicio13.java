import java.util.Scanner;


public class ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int segundos [] = {10,20,30,40,50,60};

        String[] posicionesMemoria = {"0x1A2B", "0x3C4D", "0x5E6F"};

        boolean valor_logico = true;

        System.out.println("El primer mes del año : " + nombresMeses[0] );
        System.out.println("El ultimo mes del año : " + nombresMeses[11]);
        System.out.println("La mitad de un minuto son : " + segundos[2] + " segundos");
        System.out.println("Posición de memoria principal: " + posicionesMemoria[0]);
        System.out.println("El valor logico asignado: " + valor_logico);

        


        entrada.close();
     
    }
}