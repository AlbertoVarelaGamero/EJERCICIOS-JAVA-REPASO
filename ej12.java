import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el numero de un mes: ");
        int mes = entrada.nextInt();

        System.out.print("Introduce un año: ");
        int año = entrada.nextInt();

        int dias;

        if (año >= 1000 && año <= 9999 ){

            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dias = 30;
                    break;
                case 2:
                    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
                        dias = 29;
                     } else {
                        dias = 28;
                    }
                    break;
                default : 
                    System.out.print("Mes no valido");
                }
                if (dias != 0){
                    System.out.println("El mes " + mes + "del año " + año + "tiene" + dias + "dias.");

                


        } else {
            System.out.print("El año introducido no tiene 4 digitos. ");
        }
        entrada.close();




    }
    
}
