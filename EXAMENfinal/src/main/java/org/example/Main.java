package org.example;

import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                // Press Alt+Intro with your caret at the highlighted text to see how
                // IntelliJ IDEA suggests fixing it.
                // System.out.printf("Hello and welcome!");

                // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
                for (int i = 1; i <= 5; i++) {

                        // Press Mayús+F9 to start debugging your code. We have set one breakpoint
                        // for you, but you can always add more by pressing Ctrl+F8.
                        System.out.println("i = " + i);
                }

                //Crear un getter para la funcion private int suma(int a,int b){ return a+b; }

                Calculo calculo = new Calculo();
                int suma1 = calculo.getSumaInt();
                System.out.println("La suma de numeros enteros es: " + suma1);

                //1 – Crear un objeto de tipo perro que tenga unos métodos propios (ladrar, jugar)
                // y unos atributos heredados de la clase Animales (cantidad de patas, edad, pelaje)


                Animales animales=new Animales();
                System.out.println(animales.cantidadPatas=4);
                System.out.println(animales.edad=11);
                System.out.println(animales.pelaje="marrón");

                Perro perro=new Perro();
                System.out.println(perro.ladrar());
                System.out.println(perro.jugar());

                //2 – Crear un array de 5 números enteros y calcular el número más grande

                int[] numeros = new int[5];

                numeros[0] = 3;
                numeros[1] = 11;
                numeros[2] = 13;
                numeros[3] = 18;
                numeros[4] = 26;

                int numeroMayor=numeros [0];
                for (int i=0;i<numeros.length;i++){
                        if (numeros[i]>numeroMayor){
                                numeroMayor=numeros[i];
                        }
                }
                        System.out.println(numeroMayor);

                //3 – Convertir las letras de una palabra de minúsculas a mayúsculas

                String palabraMinuscula= "hello";
                String palabraMayuscula=palabraMinuscula.toUpperCase();
                System.out.println(palabraMayuscula);

        }


}