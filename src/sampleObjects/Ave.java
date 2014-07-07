package sampleObjects;

/**
 * Created by Diego on 04/07/2014.
 */
public class Ave extends Animal {

   public Ave(){
        super();
        setNombre("Ave");
        setApellido("Fernandez");
    }

    public void moverse(){
        System.out.println("El Ave esta volando");
    }
}
