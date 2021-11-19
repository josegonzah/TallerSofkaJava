package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero1: ");
        int numVar1 = scanner.nextInt();

        System.out.println("Ingrese número2: ");
        int numVar2 = scanner.nextInt();

        if(numVar1 > numVar2){
            System.out.println("El primero es mayor");
            return;
        }
        if(numVar1 < numVar2){
            System.out.println("El segundo es mayor");
            return;
        }
        if(numVar1 == numVar2){
            System.out.println("Son iguales");
            return;
        }
    }
}
