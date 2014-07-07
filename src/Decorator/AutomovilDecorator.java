package Decorator;

/**
 * Created by Diego on 04/07/2014.
 */
public abstract class AutomovilDecorator implements Automovil {

    private Automovil auto; //elemento privado de tipo Automovil que es la interface

    public AutomovilDecorator(Automovil auto) {
        this.auto= auto;
    }

    protected Automovil getAuto(){
        return auto;
    }



}
