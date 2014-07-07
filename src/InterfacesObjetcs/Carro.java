package InterfacesObjetcs;

/**
 * Created by Diego on 04/07/2014.
 */
public class Carro implements Rueda{

    public Carro(){}


    @Override
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("El carro se detiene");
    }
}
