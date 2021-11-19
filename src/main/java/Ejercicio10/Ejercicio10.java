package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la string que desea reempazar: ");
        String string = scanner.nextLine();
        System.out.println(string.replace(" ", ""));
    }
}
