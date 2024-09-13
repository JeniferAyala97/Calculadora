package logica;

public class Operaciones {
    //atributos
    int valorUno;
    int valorDos;


    //constructores

    public Operaciones (int valorUno, int valorDos) {

        this.valorUno = valorUno;
        this.valorDos = valorDos;
    }

    public Operaciones() {

    }
    //todos

    //suma
    public int suma (){
        return valorUno + valorDos;
    }

    public int resta () {
        return valorUno - valorDos;
    }

    public int multiplicacion (){
        return valorUno * valorDos;
    }

    public double division (){
        return valorUno / valorDos;

}}
