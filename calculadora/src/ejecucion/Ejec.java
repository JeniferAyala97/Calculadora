package ejecucion;

import logica.Operaciones;

import java.util.Scanner;

public class Ejec {
    public static void main(String[] args) {

        Scanner scannerJen = new Scanner(System.in);

        int opcion=0;

        do {

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
                    Operaciones resultado = new Operaciones(valorUno,valorDos);
                    System.out.println("El resultado es:" + resultado.suma());




                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;


                case 2:

                    System.out.println("2. Resta:");

                    System.out.println("Ingrese valor A:");
                    valorUno = scannerJen.nextInt();
                    System.out.println("Ingrese valor B:");
                    valorDos = scannerJen.nextInt();
                    Operaciones resultado2 = new Operaciones(valorUno,valorDos);
                    System.out.println("El resultado es:" + resultado2.resta());

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 3:

                    System.out.println("3. Multiplicación:");

                    System.out.println("Ingrese valor A:");
                    valorUno = scannerJen.nextInt();
                    System.out.println("Ingrese valor B:");
                    valorDos = scannerJen.nextInt();
                    Operaciones resultado3 = new Operaciones(valorUno,valorDos);
                    System.out.println("El resultado es:" + resultado3.multiplicacion());

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 4:

                    System.out.println("4. División:");

                    System.out.println("Ingrese valor A:");
                    valorUno = scannerJen.nextInt();
                    System.out.println("Ingrese valor B:");
                    valorDos = scannerJen.nextInt();
                    Operaciones resultado4 = new Operaciones(valorUno,valorDos);
                    System.out.println("El resultado es:" + resultado4.division());

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                default:
                    System.out.println("5. Salir");
            }

        }
            while (opcion!=8) ;
            System.out.println("Finalizo");

        }

    }




