package Ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Electrodomestico());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora(200, "blanco", 'D', 70, 30));
        electrodomesticos.add(new Lavadora(200, "blanco", 'D', 70, 40));
        electrodomesticos.add(new Lavadora(200, "blanco", 'D', 67, 25));
        electrodomesticos.add(new Television(300, "azul", 'A', 23, 70, true));
        electrodomesticos.add(new Television(300, "azul", 'A', 23, 70, false));
        electrodomesticos.add(new Television(300, "azul", 'F', 23, 70, true));
        electrodomesticos.add(new Electrodomestico(200, 100));

        double precioTV = 0;
        double precioLAvadora = 0;
        double precioElectrodomestico = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) precioTV+=electrodomestico.precioFinal();
            else if (electrodomestico instanceof Lavadora) precioLAvadora += electrodomestico.precioFinal();
            precioElectrodomestico += electrodomestico.precioFinal();
            System.out.println("el precio final es: "+electrodomestico.precioFinal());
        }

        System.out.println("el precio total de tv:" + precioTV);
        System.out.println("el precio total lavadora:"+ precioLAvadora);
        System.out.println("el precio total de electrodomesticos"+ precioElectrodomestico);
    }
}
