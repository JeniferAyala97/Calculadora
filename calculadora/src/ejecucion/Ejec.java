package ejecucion;

import logica.Operaciones;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Ejec {
    public static void main(String[] args) {

        Scanner scannerJen = new Scanner(System.in);

        System.out.println("Ingrese valor A:");
        int valorUno = scannerJen.nextInt();
        System.out.println("Ingrese valor B:");
        int valorDos = scannerJen.nextInt();
        Operaciones resultado = new Operaciones();
        System.out.println("El resultado es:"+ resultado.suma(valorUno,valorDos));


    }

    }




