package TiposGenericos;

/**
 * Created by Diego on 05/07/2014.
 */
public class Elemento<T> {

    private T dato;

    public Elemento(){

    }

    public void setDato(T t){
        this.dato = t;
    }

    public T getDato(){
        return this.dato;
    }
}
