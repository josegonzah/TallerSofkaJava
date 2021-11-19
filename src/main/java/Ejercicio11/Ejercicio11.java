package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int counter = 0;
        int vocalsCounter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena de caracteres: ");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        for (char ch: chars){
            counter = counter + 1;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vocalsCounter = vocalsCounter + 1;
            }
        }
        System.out.println("La cadena tiene " + counter + " caracteres ");
        System.out.println("La cadena tiene " + vocalsCounter + " vocales");
    }
}
