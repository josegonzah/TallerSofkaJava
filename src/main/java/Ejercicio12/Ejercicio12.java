package Ejercicio12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Ingresa la primera palabra");
        Scanner scanner = new Scanner(System.in);
        String palabra1 = scanner.nextLine();
        String[] array1 = palabra1.toLowerCase().split("");
        System.out.println("Ingresa la segunda palabra");
        String palabra2 = scanner.nextLine();
        String[] array2 = palabra2.toLowerCase().split("");
        List<String> arrayDifference = new ArrayList();
        int lenBucle;
        String[] longestArray;
        String[] shortestArray;
        if (array1.length > array2.length) {
            lenBucle = array1.length;
            longestArray = array1;
            shortestArray = array2;
        } else {
            lenBucle = array2.length;
            longestArray = array2;
            shortestArray = array1;
        }

        for (int i = 0; i < lenBucle; ++i) {
            if (!Arrays.asList(shortestArray).contains(longestArray[i])) {
                arrayDifference.add(longestArray[i]);
            }
        }

        System.out.println(arrayDifference);
    }
}

