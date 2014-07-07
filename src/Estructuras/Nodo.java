package Estructuras;

/**
 * Created by Diego on 06/07/2014.
 */
public class Nodo {

    Object valor;//Obtendra el valor del nodo
    Nodo siguiente;//


    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public Object obtenerValor(){
        return  valor;
    }

    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }

    public Nodo obtenerSiguiente(){
        return siguiente; //Regresa el enlace del siguiente nodo
    }

}
