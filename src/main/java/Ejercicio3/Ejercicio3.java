package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        String radio = scanner.nextLine();
        double area = Math.pow(Double.parseDouble(radio), 2)*3.1416;
        System.out.println("El area es: " + area);
    }
}
