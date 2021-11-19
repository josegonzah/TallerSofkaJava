package Ejercicio16;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private int dni;
    private char sexo = 'M';
    private double peso = 0;
    private double altura = 0;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'M';
        this.peso = 0;
        this.altura = 0;
        this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generaDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = this.peso/(Math.pow(this.altura, 2));
        if(IMC < 20){
            return -1;
        }
        if(IMC >= 20 && IMC <= 25){
            return 0;
        }
        return 1;
    }

    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }
        return false;
    }

    private void comprobarSexo(){
        if(this.sexo != 'M' && this.sexo != 'H'){
            this.sexo = 'H';
        }
    }

    public String[] toStringPerson(){
        String edad = String.valueOf(this.edad);
        String sexo = String.valueOf(this.sexo);
        String altura = String.valueOf(this.altura);
        String peso = String.valueOf(this.peso);
        String dni = String.valueOf(this.dni);
        String[] info = {this.nombre, edad, dni, sexo, peso, altura};
        return info;
    }

    private void generaDNI(){
        this.dni = ThreadLocalRandom.current().nextInt(10000000, 100000000);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
