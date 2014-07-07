package sampleObjects;

/**
 * Created by Diego on 04/07/2014.
 */
public abstract class Animal {
    //variable privada
    private String nombre;
    private String apellido;

    //Constructor
    public Animal(){
        setApellido("Hola");
    }

    //metodos

    public void comer(){
        System.out.println("EL "+nombre+" esta comiendo");
    }

    public abstract void moverse();


     public void setNombre(String s){
        nombre=s;
    }

    public void setApellido(String s){
        apellido=s;

    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

}
