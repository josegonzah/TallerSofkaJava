package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numVar1 = 0;
        int numVar2 = 0;

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
