package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana: ");
        String dia = scanner.nextLine();

        switch (dia){
            case "lunes": System.out.println("Laboral");
            break;
            case "martes": System.out.println("laboral");
            break;
            case "miercoles": System.out.println("laboral");
            break;
            case "jueves": System.out.println("laboral");
            break;
            case "viernes": System.out.println("laboral");
            break;
            case "sabado": System.out.println("no laboral");
            break;
            case "domingo": System.out.println("no laboral");
            break;
        }
    }
}
