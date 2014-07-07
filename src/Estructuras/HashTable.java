package Estructuras;

/**
 * Created by Diego on 05/07/2014.
 */
public class HashTable {

    private final Integer size = 13 ;
    //Numero primo no necesariamente a una potencia de 2


    public HashTable(){

    }

    //129, 0-12
    private Integer hash(Integer k) {
        Integer key = 0;
        key = (k & 0x7fffffff)% size; //0111 1111 Esta operacion obtiene el valor absoluto y fuerza a que sea positivo
        return key;
    }

    public Integer buscar(Integer k){
        return null;
    }

    public void insertar(Integer k) throws Exception{
        System.out.println(k+" tiene el hash:"+hash(k));
    }

    public void eliminar(){

    }

}
