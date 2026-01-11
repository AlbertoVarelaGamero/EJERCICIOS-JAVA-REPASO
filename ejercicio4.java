import java.util.Scanner;


public class ejercicio4{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        double pi = 3.1416;
        double radio;
        double area;

        System.out.print("Escriba el radio: ");
        radio = entrada.nextDouble
        ();

        area = pi * Math.pow(radio,2) ;
        //area = pi * radio * radio;

        System.out.printf("El area es %f\n", area);
    entrada.close();

    }
}