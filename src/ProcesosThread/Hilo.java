package ProcesosThread;

/**
 * Created by Diego on 05/07/2014.
 */
/**
 * Created by Diego on 04/07/2014.
 */
public class Hilo implements   Runnable {
    Thread t;
    String nombre;

    public Hilo(){
        t = new Thread(this,"Hilo 1");
        t.start();

    }

    public Hilo(String nombre){
        this.nombre = nombre;
        t = new Thread(this,"Hilo 1");
        t.start();

    }

    public void run() {
        try{
            for(int i=0;i<200;i++){
                System.out.println(nombre+" "+i);
                Thread.sleep(500);
            }

        }catch (InterruptedException e){}
    }
}
