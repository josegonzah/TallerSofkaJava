package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double iva = 0.21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor: ");
        String valor = scanner.nextLine();
        double valorConIva = Double.parseDouble(valor)*iva + Double.parseDouble(valor);
        System.out.println("Valor con IVA "+valorConIva);
    }
}
