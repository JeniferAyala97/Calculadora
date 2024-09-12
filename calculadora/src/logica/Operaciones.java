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
    public int suma(){

        int suma = this.valorUno+ this.valorDos;
        return suma;
        
    }


}
