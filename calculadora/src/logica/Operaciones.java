package logica;

public class Operaciones {

    //atributos

    int valorUno;
    int valorDos;

    //constructores

    public Operaciones (int valorUno, int valorDos){

        this.valorUno=valorUno;
        this.valorDos=valorDos;
    }
     //metodos

    //Suma
    public int suma(){

        int suma = this.valorUno + this.valorDos;
        return suma;
    }
    //Resta
    public int resta(){

        int resta = this.valorUno - this.valorDos;
        return resta;
    }
    //Multiplicacion
    public int multiplicacion(){

        int multiplicacion = this.valorUno * this.valorDos;
        return multiplicacion;
    }
    //Divicion
    public double divicion (){

        double divicion = (double) this.valorUno/(double) this.valorDos;
        return divicion;
    }



}
