package Decorator;

/**
 * Created by Diego on 04/07/2014.
 */
public class AutoElectricoFeature extends AutomovilDecorator {

    public AutoElectricoFeature(Automovil auto){
        super(auto);

    }
    @Override
    public void accel() {
        System.out.println("Acelerando electricamente");
        getAuto().accel();

    }

    @Override
    public void stop() {
        System.out.println("Controlando fremos electronicos");
        getAuto().stop();
    }

    @Override
    public void start() {
        System.out.println("Iniciando electricamente");
        getAuto().start();
    }
}
