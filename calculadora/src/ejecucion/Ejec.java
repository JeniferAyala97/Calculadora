package ejecucion;

import logica.Operaciones;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Ejec {
    public static void main(String[] args) {

        Scanner scannerJen = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("-  1. Suma             -");
        System.out.println("-  2. Resta            -");
        System.out.println("-  3. Multiplicación   -");
        System.out.println("-  4. División         -");
        System.out.println("-  5. Salir            -");
        System.out.println("************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción:");
        int opciones = scanner.nextInt();

        switch (opciones) {

            case 1:

                System.out.println("1. Suma:");

                System.out.println("Ingrese valor A:");
                int valorUno = scannerJen.nextInt();
                System.out.println("Ingrese valor B:");
                int valorDos = scannerJen.nextInt();
                Operaciones resultado = new Operaciones();
                System.out.println("El resultado es:" + resultado.suma(valorUno, valorDos));

            case 2:

                System.out.println("2. Resta:");

                System.out.println("Ingrese valor A:");
                valorUno = scannerJen.nextInt();
                System.out.println("Ingrese valor B:");
                valorDos = scannerJen.nextInt();
                Operaciones resultado2 = new Operaciones();
                System.out.println("El resultado es:" + resultado2.resta(valorUno, valorDos));

            case 3:

                System.out.println("3. Multiplicación:");

                System.out.println("Ingrese valor A:");
                valorUno = scannerJen.nextInt();
                System.out.println("Ingrese valor B:");
                valorDos = scannerJen.nextInt();
                Operaciones resultado3 = new Operaciones();
                System.out.println("El resultado es:" + resultado3.multiplicacion(valorUno, valorDos));

            case 4:

                System.out.println("4. División:");

                System.out.println("Ingrese valor A:");
                valorUno = scannerJen.nextInt();
                System.out.println("Ingrese valor B:");
                valorDos = scannerJen.nextInt();
                Operaciones resultado4= new Operaciones();
                System.out.println("El resultado es:" + resultado4.division(valorUno, valorDos));









    }

    }}




