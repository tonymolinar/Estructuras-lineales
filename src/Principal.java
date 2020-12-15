import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {

        ListaEnlazada listaenlazada = new ListaEnlazada();
        listaenlazada.insertar(new Cancion("Navidad","/navidad.mp3",65));
        listaenlazada.insertar(new Cancion("Nochebuena","/nochebuena.mp3",85));
        listaenlazada.insertar(new Cancion("Diciembre","/diciembre.mp3",105));
        listaenlazada.mostrar();

        LinkedList<Cancion> listaJava = new LinkedList<>();
        listaJava.add(new Cancion("Navidad","/navidad.mp3",65));
        listaJava.add(new Cancion("Nochebuena","/nochebuena.mp3",85));
        listaJava.add(new Cancion("Diciembre","/diciembre.mp3",105));
        for (int x=0;x<listaJava.size();x++){
            Cancion c = listaJava.get(x);
            System.out.println(c.getNombre());
        }

        /*Stack<Usuario> pila = new Stack<>();
        Queue<Usuario> cola = new LinkedList<>();
        pila.add(new Usuario("Yo","Calle 1","123"));
        pila.add(new Usuario("Tu","Calle 2","456"));
        pila.add(new Usuario("El","Calle 3","789"));
        Usuario imprimir = pila.pop();
        System.out.println(imprimir.getNombre());
        imprimir = pila.pop();
        System.out.println(imprimir.getNombre());
        pila.pop();
        if (pila.isEmpty()){
            System.out.println("Esta vacia");
        }
         */


    }
}
