package Estructuras;

/**
 * Created by Diego on 06/07/2014.
 */
public class ListaEnlazada {
    Nodo cabeza;  //Definición del 1er nodo de la lista.
    int size; //Definición del tamaño de la lista.

    public ListaEnlazada(){
        cabeza = null;
        size= 0;
    }

    //Metodo que crea un elemento y lo agrega al principio de la lista.
    public void addPrimero(Object obj){
        if(cabeza == null)//Si no existen elementos
        {
            cabeza = new Nodo(obj);//Se crea el elemento como cabecera
        }
        else{
            Nodo temp = cabeza; // Si existen elementos, se obtiene una instancia del elemento cabecera
            Nodo nuevo = new Nodo(obj); //Se crea el nuevo elemento
            nuevo.enlazarSiguiente(temp);//Se crea enlace con el elemento cabecera
            cabeza=nuevo;//elemento cabecera es el nuevo elemento creado
        }
        size++; //acumula elementos creados
    }
    //Metodo que elimina el 1er elemento de la lista
    public void eliminarPrimero(){
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }

    //Metodo que elimina un elemento según índice
    public void eliminar(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while(contador < index -1){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
        size--;
    }

    //Metodo que permite cortar elementos a partir de un índice
    public void cortar(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index -1){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(null);
        size = index;
    }



    //Metodo que obtiene el valor de un elemento según índice
    public Object obtener(int index){
        int contador = 0;
        Nodo temporal = cabeza; //Se instancia al 1er elemento de la lista
        while (contador < index) //contador = (Index -1).
        {
            temporal = temporal.obtenerSiguiente();//se instancia al elemento siguiente.
            contador++;
        }
        return temporal.obtenerValor();//se retorna el valor que contiene el elemento

    }
    //Metodo para obtener el tamaño de la lista
    public int size(){
        return size;
    }

    //Metodo para preguntar si la lista contiene elementos.
    public boolean estaVacia(){
        return (cabeza == null)?true:false;
    }



}
