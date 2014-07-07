package Decorator;

/**
 * Created by Diego on 04/07/2014.
 */
public class CarroEstandar implements Automovil {

    String nombre;

    public CarroEstandar(String s){
        nombre = s;

    }

    @Override
    public void accel() {
        System.out.println("acceleración estandar");
    }

    @Override
    public void stop() {
        System.out.println("Frenar");
    }

    @Override
    public void start() {
        System.out.println("Prendiendo el carro");

    }
}
