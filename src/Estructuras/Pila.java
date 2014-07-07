package Estructuras;

/**
 * Created by Diego on 06/07/2014.
 */
public class Pila {

    String arr[];
    int maxSize; //definición del tamano maximo de la pila
    int top;     //definición de índices.

    public Pila(int n){
        maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }


    //Metodo para saber si la pila contiene elementos.
    public boolean empty(){
        if(top==0){
            return true;
        }else{
            return false;
        }
    }
    //Metodo que agrega elemento a la pila.
    public void push(String str){
        if(top < maxSize){ //Se agrega elemento si top es menor que el tamaño maximo
            arr[top] = str;
            top++;
        }
    }
    //Metodo para ver el ultimo elemento de la pila.
    public String peek(){
        if (top>0)//Si contiene elementos la pila, visualiza el ultimo.
            return arr[top-1];
        else
            return null;

    }
    //Metodo para sacar el último elemento de la pila.
    public String pop(){
        String temp = null;
        if (top>0){//Si contiene elementos la pila, se nullea el ultimo elemento de la pila.
            temp = arr[top-1];
            arr[top-1]=null;
            top--;
        }
        return temp;
    }
}
