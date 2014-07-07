package Singleton;

/**
 * Created by Diego on 04/07/2014.
 */
public class Logger {

    private static Logger log;
    private String value;

    private Logger(){}; //Se crea el constructor de forma private (no se puede instaciar fuera de esta clase.)

    public static synchronized Logger getInstance(){ //Si se utilizan más hilos de ejecución, con la opcion syncronized para que asegura
                                                     //que los demás hilos esperen si esta tomado por otro y evitar un acceso directo de todos a la vez.
        if (log == null){
            log = new Logger();
        }
        return log;
    }

    public void log(String msg){
       System.out.println(msg);

    }

    public void setValue(String msg){
        value = msg;
    }

    public String getValue(){
        return value;
    }
}
