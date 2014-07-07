package PracticasJava;

/**
 * Created by Diego on 04/07/2014.
 */
public class Articulo {
    //Variables del objeto
    private String title;
    private String content;
    private String autor;

    private int ID;
    //Constructores
    public Articulo(){

    }

    public Articulo(String title){
        this.title = title;
    }

    public Articulo(String title, String content){
        this.title = title;
        this.content = content;
    }

    //Getters and Setters

    public void setID(int id ){
        this.ID = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public int getID(){return ID;}

    public String getTitle(){return title;}

    public String getContent(){return content;}

    @Override
    public String toString(){
        String toString;
        toString = "["+this.ID+","+this.title+","+this.content+"]";
        return toString;
    }


}
