package PracticasJava;

import java.util.StringTokenizer;

/**
 * Created by Diego on 04/07/2014.
 */
public class Tutorial {

    public Tutorial(){

    }

    public void test(){
        String txt;
        txt = "La casa, esta, en la playa";
        //StringTokenizer tokens = new StringTokenizer(txt,",");
        StringTokenizer tokens = new StringTokenizer(txt);
        while (tokens.hasMoreTokens())
        {

            System.out.println(tokens.nextToken());

        }
    }
}
