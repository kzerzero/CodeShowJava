package sampleObjects;

/**
 * Created by Diego on 04/07/2014.
 */
public class Perro extends Animal {
    public Perro(){
        super();//el Super ejecuta el codigo del constructor Animal
        setNombre("Perro");
    }

    //implementación del metodo abstracto del padre
    public void moverse(){
        System.out.println("El perro se esta moviendo");
    }
}
