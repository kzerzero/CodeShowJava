package Encriptacion;

/**
 * Created by Diego on 05/07/2014.
 */
public class EncriptacionBasica {

    private String cadena;

    public EncriptacionBasica(){


    }

    public void encriptar(String s){
        this.cadena = s;
        char array[]= cadena.toCharArray(); //Metodo que transforma la cadena a un arreglo

        for (int i=0; i < array.length; i++ ){
            array[i]= (char)(array[i]+(char)5);
        }

        cadena = String.valueOf(array);
    }

    public void desencriptar(String s){
        char array[]= cadena.toCharArray(); //Metodo que transforma la cadena a un arreglo

        for (int i=0; i < array.length; i++ ){
            array[i]= (char)(array[i]-(char)5);
        }

        cadena = String.valueOf(array);
    }

    public String getCadenaEncriptada(){
        return cadena;

    }

    public String getCadenaDesencriptada(){
        return cadena;

    }
}
