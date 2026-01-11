import java.util.Scanner;

public class ej12bienhecho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el número de un mes (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Introduce un año: ");
        int anio = entrada.nextInt();

        int dias = 0;

        // Validamos el año (opcional, pero buena práctica)
        if (anio >= 1000 && anio <= 9999) {
            
            // Lógica para determinar los días del mes
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dias = 30;
                    break;
                case 2:
                    // Lógica de año bisiesto
                    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                default:
                    System.out.println("Mes no válido.");
            }

            if (dias != 0) {
                System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " días.");
            }

        } else {
            System.out.println("El año introducido no tiene 4 dígitos.");
        }

        entrada.close();
    }
}