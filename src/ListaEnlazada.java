public class ListaEnlazada {

    Nodo inicio;
    public ListaEnlazada(){
        inicio=null;
    }

    public void insertar(Cancion cancion){
        Nodo nuevonodo = new Nodo(cancion);
        if (this.inicio==null){
            this.inicio=nuevonodo;
        }else{
            Nodo nodoactual = inicio.getSiguiente();
            if (nodoactual==null){
                inicio.setSiguiente(nuevonodo);
            }else {
                while (nodoactual.getSiguiente()!=null){
                    nodoactual = nodoactual.getSiguiente();
                }
                nodoactual.setSiguiente(nuevonodo);
            }
        }
    }

    public void mostrar(){
        Nodo nodoactual = inicio;
        while (nodoactual.getSiguiente()!=null){
            System.out.print(nodoactual.getCancion().getNombre()+" ");
            System.out.print(nodoactual.getCancion().getDuracion()+" ");
            System.out.println(nodoactual.getCancion().getRuta()+" ");
            nodoactual = nodoactual.getSiguiente();
        }
        System.out.print(nodoactual.getCancion().getNombre()+" ");
        System.out.print(nodoactual.getCancion().getDuracion()+" ");
        System.out.println(nodoactual.getCancion().getRuta()+" ");
    }
}
