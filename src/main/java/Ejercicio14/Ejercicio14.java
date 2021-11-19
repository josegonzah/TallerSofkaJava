package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int numero = scanner.nextInt();
        for (int i = numero; i<=100; i+=2){
            System.out.println(i);
        }
    }
}
