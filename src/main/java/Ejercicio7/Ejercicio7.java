package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int userInput = -1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ingrese numero mayor o igual a 0: ");
            userInput = scanner.nextInt();
        }while(userInput<0);
    }
}
