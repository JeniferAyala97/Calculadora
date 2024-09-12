package ejecucion;

import logica.Operaciones;

import java.util.Scanner;

import static java.util.Scanner.*;

public class Ejec {
    public static void main(String[] args) {

        Scanner Jen4 = new Scanner(System.in);

        int valorUno = 0;
        int valorDos = 0;

        Operaciones operaciones = new Operaciones(valorUno,valorDos);

        System.out.println("************************");
        System.out.println("-  1. Suma             -");
        System.out.println("-  2. Resta            -");
        System.out.println("-  3. Multiplicación   -");
        System.out.println("-  4. Divición         -");
        System.out.println("-  5. Salir            -");
        System.out.println("************************");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción:");
        int opciones = scanner.nextInt();

        switch (opciones) {

            case 1:

                System.out.println("Ingrese valor1:");
                valorUno = scanner.nextInt();
                System.out.println("Ingrese valor2:");
                valorDos = scanner.nextInt();

                int resultsuma= operaciones.suma();
                System.out.println("La suma es:"+resultsuma);


        }









    }




}