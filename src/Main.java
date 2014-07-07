import Decorator.AutoElectricoFeature;
import Decorator.Automovil;
import Decorator.CarroEstandar;
import Encriptacion.EncriptacionBasica;
import Estructuras.*;
import InterfacesObjetcs.Bicicleta;
import InterfacesObjetcs.Carro;
import PracticasJava.Articulo;
import PracticasJava.Tutorial;
import ProcesosThread.Hilo;
import Singleton.Logger;
import TiposGenericos.Elemento;
import sampleObjects.Animal;
import sampleObjects.Ave;
import sampleObjects.Perro;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (x!= 8){
            System.out.println("Menu");
            System.out.println("**********************");
            System.out.println("1.Clases");
            System.out.println("2.Patrones de Diseño");
            System.out.println("3.Encriptacion");
            System.out.println("4.Structuras");
            System.out.println("5.Procesos Multihilos ");
            System.out.println("6.Tipos de Datos Genericos");
            System.out.println("7.Practicas");
            System.out.println("8.EXIT");
            System.out.println("Seleccione Opción:");
            x = scanner.nextInt();
            switch(x) {
              case 1: SubOpClases();
                  break;
              case 2: SubOpPatrones();
                  break;
              case 3: SubOpEncriptacion();
                  break;
              case 4: SubOpEstructuras();
                    break;
              case 5: SubOpMultiprocesos();
                    break;
              case 6: SubOpTiposDatosGenericos();
                    break;
              case 7: SubOpPracticas();
                    break;
              case 8: System.out.println("Thanks :)");
                  break;
              default: System.out.println("Opción Invalida");
                  break;
            }
        }
    }

    public static void SubOpClases(){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x!= 4){
            System.out.println("Clases");
            System.out.println("**********************");
            System.out.println("1.Clases Abstractas");
            System.out.println("2.Interfaces");
            System.out.println("3.Clases Pro");
            System.out.println("4.Volver");
            x = scanner.nextInt();
            switch(x) {
                case 1: OpClaseAbstracta();
                    break;
                case 2: OpInterfaces();
                    break;
                case 3: OpClasesPro();
                    break;
                case 4: menu();
                    break;
                default: System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void SubOpPatrones(){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x!= 3){
            System.out.println("Patrones");
            System.out.println("**********************");
            System.out.println("1.Singleton");
            System.out.println("2.Decorator");
            System.out.println("3.Volver");
            x = scanner.nextInt();
            switch(x) {
                case 1: OpSingleton();
                    break;
                case 2: OpDecorator();
                    break;
                case 3: menu();
                    break;
                default: System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void SubOpEncriptacion(){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x!= 3){
            System.out.println("Encriptación");
            System.out.println("**********************");
            System.out.println("1.Basica (solo mensaje)");
            System.out.println("2.Avanzada (mensaje y clave)");
            System.out.println("3.Volver");
            x = scanner.nextInt();
            switch(x) {
                case 1: OpEncriptacionBasica();
                    break;
                case 2: menu();
                    break;
                case 3: menu();
                    break;
                default: System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void SubOpEstructuras(){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x!= 9){
            System.out.println("Estructuras");
            System.out.println("**********************");
            System.out.println("1.HashTable");
            System.out.println("2.Recorrer un LinkedList");
            System.out.println("3.Lista Enlazadas 1: Creación de lista y obtención de valor");
            System.out.println("4.Lista Enlazadas 2: Agregar nuevo elemento a una lista");
            System.out.println("5.Lista Enlazadas 3: Eliminar elemento de una lista");
            System.out.println("6.Pilas 1: PUSH, POOP, PEEK, EMPTY (lib. Stack)");
            System.out.println("7.Pilas 2: Creación de una pila Fija sin lib.");
            System.out.println("8.Pilas 3: Creación de una pila Dinamica sin lib.");
            System.out.println("9.Volver)");
            x = scanner.nextInt();
            switch(x) {
                case 1: OpHastTable();
                    break;
                case 2: OpLinkedList();
                    break;
                case 3: OpNodos();
                    break;
                case 4: OpNodosAgregarElementos();
                    break;
                case 5: OpNodosEliminarElementos();
                    break;
                case 6: OpPilasConLibreria();
                    break;
                case 7: OpPilasSinLibreria();
                    break;
                case 8: OpPilasSinLibreriaDina();
                    break;
                case 9: menu();
                    break;
                default: System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void SubOpMultiprocesos(){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x!= 2){
            System.out.println("Multiprocesos");
            System.out.println("**********************");
            System.out.println("1.Thread (Multihilos)");
            System.out.println("2.Volver)");
            x = scanner.nextInt();
            switch(x) {
                case 1: OpThread();
                    break;
                case 2: menu();
                    break;
                default: System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void SubOpTiposDatosGenericos(){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x!= 2){
            System.out.println("Datos Genericos");
            System.out.println("**********************");
            System.out.println("1.Tipos de Datos Genericos)");
            System.out.println("2.Volver)");
            x = scanner.nextInt();
            switch(x) {
                case 1: OpTipoDatosGenericos();
                    break;
                case 2: menu();
                    break;
                default: System.out.println("Opción invalida");
                    break;
            }
        }
    }

    public static void SubOpPracticas(){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x!= 3){
            System.out.println("Practicas");
            System.out.println("**********************");
            System.out.println("1.StringTokenizer (Romper Cadenas))");
            System.out.println("2.Excepciones (Try,catch))");
            System.out.println("3.Volver)");
            x = scanner.nextInt();
            switch(x) {
                case 1: OpStringTokenizer();
                    break;
                case 2: OpExcepciones();
                    break;
                case 3: menu();
                    break;
           default: System.out.println("Opción invalida");
                    break;
            }
        }
    }


    //Demo clases abstractas.
    public static void OpClaseAbstracta(){
        //String nombreave;
        Animal juanito = new Perro();
        juanito.comer();
        juanito.moverse();

        Animal pajarito = new Ave();
        pajarito.comer();
        pajarito.moverse();
        pajarito.setApellido("Fernandez");
        System.out.println(pajarito.getNombre());
        finalOp();
    }

    //Demo de Interfaces de una clase.
    public static void OpInterfaces(){
        Carro auto = new Carro();
        Bicicleta bici = new Bicicleta();
        auto.avanzar();
        bici.avanzar();
        bici.sentarse();
        finalOp();
    }

    //Demo Patron de Diseño Singleton: su función es permitir solo una instancia de la clase.
    //Aplicable para servicios de logs, inicios de usario, etc.
    public static void OpSingleton(){
        Logger logito = Logger.getInstance();
        Logger logito2 = Logger.getInstance();
        logito.setValue("mensaje"); // Se setea el valor con el objeto1
        System.out.println(logito2.getValue());//se retorna el valor con el objeto2 que corresponde a la misma instancia
        finalOp();
    }

    //Demo Patron Decorator: patrón que permite la herencia de clases permitiendo la extiendo de caracteristicas de un objeto.
    public static void OpDecorator(){
        Automovil carro = new AutoElectricoFeature(new CarroEstandar("Chevy"));
        carro.start();
        carro.accel();
        carro.stop();
        finalOp();
    }

    //Demo de tipos de datos genericos
    public static void OpTipoDatosGenericos(){
        Elemento<Integer> el = new Elemento<Integer>();
        el.setDato(2332);
        System.out.println(el.getDato());
        finalOp();

    }

    //Demo Encriptacion Basica: se reemplaza mensaje por formula con codigo ascii.
    public static void OpEncriptacionBasica(){
       EncriptacionBasica enc = new EncriptacionBasica();
       enc.encriptar("Hola a Todos");//Encriptación mensaje
       //enc.desencriptar(enc.getCadenaEncriptada());//Desencriptación de mensaje
       System.out.println(enc.getCadenaEncriptada());//Mostrar mensaje encriptado
       //System.out.println(enc.getCadenaDesencriptada());//Mostrar mensaje Desencriptado
       finalOp();
    }

    //Demo HastTable
    public static void OpHastTable(){ //Creación de indices para la tabla hash de valores naturales
        HashTable tabla = new HashTable();
        for (Integer i = -50; i <= 50; i++){
            try {
                tabla.insertar(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        finalOp();
    }

    //Demo LinkedList: Implementación e iteración con ListIterator de una lista enlazada.

    public static void  OpLinkedList(){
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("como");
        lista.add("estas");

        ListIterator<String> iterador = lista.listIterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
       // System.out.println("Despues"+iterador.next());
        System.out.println(lista.get(0));
        finalOp();
    }

    //Demo Thread: Procesos Multihilos
    public static void OpThread(){
        Hilo numero1 = new Hilo("N1");
        Hilo numero2 = new Hilo("N2");
        finalOp();
    }

    //Demo Clases Pro: Implementación buenas prácticas de una clase
    public static void OpClasesPro(){
        Articulo articulo = new Articulo();
        articulo.setID(1);
        articulo.setTitle("Un titulo");
        articulo.setContent("Esto es un contenido");
        System.out.println(articulo.getID()+" "+articulo.getTitle()+" "+articulo.getContent());
        System.out.println(articulo.toString());
        finalOp();
    }

    //Demo StringTokenizer: romper cadenas
    public static void OpStringTokenizer(){
        Tutorial tutorial = new Tutorial();
        tutorial.test();
        finalOp();
    }


    //Demo Excepciones personalizadas (Catch, Try, Finally.).
    public static void OpExcepciones(){
        Scanner scanner = new Scanner(System.in);
        int x; //Variable numerica
        System.out.println("Dame un valor numerico");
        try {
            x=scanner.nextInt();//Obtener un numero del taclado
            System.out.println(x);
        }catch (Exception e){
        //}catch (InputMismatchException e){ //Hereda de la clase Exception.
            System.out.println("No me diste un valor numerico");
        }finally { //Siempre se ejecuta, termine bien o mal
            System.out.println("Proceso terminado");
        }
        finalOp();
    }

    //Demo Lista Enlazadas Simples (NODOS): Creación de Nodos y obtención de valores.
    public static void OpNodos(){
        //Se crean los nodos
        Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercero = new Nodo("Hola");
        //Se enlazan los nodos: NODO1-->NODO2-->NODO3
        primer.enlazarSiguiente(segundo);
        primer.obtenerSiguiente().enlazarSiguiente(tercero);
        //Se obtiene el valor del 3er nodo apartir del 1ero.
        System.out.println(primer.obtenerSiguiente().obtenerSiguiente().obtenerValor().toString());
        finalOp();
     }

    //Demo Lista Enlazadas: Añadir Elementos a partir del índice a la lista.
    public static void OpNodosAgregarElementos(){
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("Esta vacia: "+ lista.estaVacia());

        lista.addPrimero("Diego");
        lista.addPrimero(20);
        lista.addPrimero("Hola que tal");
        lista.addPrimero(3);

        System.out.println("Primer elemento: "+lista.obtener(0));
        System.out.println("Ultimo elemento: "+lista.obtener(lista.size()-1));
        System.out.println("Index 2: "+lista.obtener(2));

        System.out.println("Esta vacia: "+lista.estaVacia());
        System.out.println("Tamaño"+lista.size());
        finalOp();
    }

    //Demo Lista Enlazadas: Eliminación de Nodos por indice y desde la cabecera.
    public static void OpNodosEliminarElementos(){
        ListaEnlazada lista = new ListaEnlazada();

        lista.addPrimero(6);
        lista.addPrimero(5);
        lista.addPrimero(4);
        lista.addPrimero(3);
        lista.addPrimero(2);
        lista.addPrimero(1);
        System.out.println("Esta vacia: "+ lista.estaVacia());

        lista.eliminarPrimero(); //Elimina el 1er elemento
        //lista.eliminar(3); //Elimina según índice
        //System.out.println("index 3 "+lista.obtener(3));
        //lista.cortar(3); //Corta elementos a partir del índice de la lista

        System.out.println("Primero: "+lista.obtener(0));
        System.out.println("Ultimo: "+lista.obtener(lista.size()-1));
        System.out.println("Tamaño: "+lista.size());
        finalOp();
     }

    /*Demo Pilas utilizando libreria stack:
                  PUSH (agregar un elemeno)
                  POP  (para sacar el ultimo elemento)
                  PEEK (Para ver ultimo elemento)
                  EMPTY (saber si esta vacía)*/
    public static void OpPilasConLibreria(){
        Stack stack = new Stack(); //[]
        stack.push("Mundo");       //[Mundo]
        stack.push("Hola");        //[Mundo, Hola]

        System.out.println(stack.peek()); //Hola

        //System.out.println(pila.pop());//Mundo
        //System.out.println(pila.empty());//False
        finalOp();

    }
    //Demo Pila con tamaño fijo utilizando una clase .
    public static void OpPilasSinLibreria(){
        Pila pila = new Pila(3);
        pila.push("1");
        pila.push("2");
        pila.push("3");
        pila.push("4");
        pila.push("5");

        System.out.println(pila.peek());
        System.out.println(pila.empty());
        System.out.println(pila.pop());
        System.out.println(pila.empty());
        finalOp();
    }

   //Demo Pila con tamaño Dinamico utilizando una clase .
    public static void OpPilasSinLibreriaDina(){
        PilaDinamica pila = new PilaDinamica();
        pila.push("1");
        pila.push("2");
        pila.push("3");
        pila.push("4");
        pila.push("5");
        pila.push("5");
        pila.push("6");

        System.out.println(pila.peek());
        System.out.println(pila.empty());
        System.out.println(pila.pop());
        System.out.println(pila.empty());
        finalOp();
    }

    public static void finalOp(){
        Scanner z = new Scanner(System.in);
        System.out.println("Ingrese cualquier caracter para volver al menu");
        z.hasNext();
    }
}
