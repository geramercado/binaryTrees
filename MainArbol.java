package arbolBinario;

public class MainArbol {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        arbol.insertar(new Nodo(10), arbol.getRaiz());
        arbol.insertar(new Nodo(11), arbol.getRaiz());
        arbol.insertar(new Nodo(6), arbol.getRaiz());
        arbol.insertar(new Nodo(5), arbol.getRaiz());

        arbol.imprimir(arbol.getRaiz());
        System.out.println("");
        //System.out.println(arbol.buscarNivel(10));
        //arbol.promedio(arbol.getRaiz());
        //arbol.maximo(arbol.getRaiz());
        //System.out.println(arbol.maximo(arbol.getRaiz(), 0));
        //arbol.minimo(arbol.getRaiz());
        arbol.eliminarUno(11);
        System.out.println("");
        arbol.imprimir(arbol.getRaiz());


    }

}
