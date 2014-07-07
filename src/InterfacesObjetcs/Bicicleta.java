package InterfacesObjetcs;

/**
 * Created by Diego on 04/07/2014.
 */
public class Bicicleta implements Rueda, Silla {

    public Bicicleta(){}

    @Override
    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("El bicicleta se detiene");
    }


    @Override
    public void sentarse() {
        System.out.println("Sientese");
    }
}
