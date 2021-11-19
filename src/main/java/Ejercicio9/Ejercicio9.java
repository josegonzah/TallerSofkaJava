package Ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena = "La sonrisa sera la mejor arma contra la tristeza";
        String conacat = "La anterior string fue modificada";
        String newOne = cadena.replace('a', 'e');
        System.out.println(newOne + conacat);
    }
}
