package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la string 1: ");
        String string1 = scanner.nextLine();
        System.out.println("Ingrese la string 2: ");
        String string2 = scanner.nextLine();
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        boolean equalsTo = true;
        for (char ch: chars1){
            for (char ch1 : chars2){
                if(ch != ch1){
                    System.out.println("Diferencia: " + ch + "diferente a: " + ch1);
                    equalsTo = false;
                }
            }
        }
        if (equalsTo){
            System.out.println("Es igual la cadena 1 con la 2");
            return;
        }
        System.out.println("Las cadenas son diferentes");
    }
}
