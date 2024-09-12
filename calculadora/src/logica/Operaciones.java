package logica;

public class Operaciones {
    //atributos
    int valorUno;
    int valorDos;

    //constructores

    public Operaciones(int valorUno, int valorDos) {

        this.valorUno = valorUno;
        this.valorDos = valorDos;
    }
    //metodos

    public int suma (){
        return valorUno+valorDos;
    }

}
