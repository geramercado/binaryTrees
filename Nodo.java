package arbolBinario;

public class Nodo {

    private Nodo nodoIzquierdo;
    private Nodo nodoDerecho;
    private int dato;

        public Nodo(int dato){
            this.nodoDerecho = null;
            this.nodoIzquierdo = null;
            this.dato = dato;
        }

        public Nodo getNodoIzquierdo() {
            return nodoIzquierdo;
        }

        public void setNodoIzquierdo(Nodo nodoIzquierdo) {
            this.nodoIzquierdo = nodoIzquierdo;
        }

        public Nodo getNodoDerecho() {
            return nodoDerecho;
        }

        public void setNodoDerecho(Nodo nodoDerecho) {
            this.nodoDerecho = nodoDerecho;
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

    @Override
    public String toString() {
        return "Nodo {" + "dato = " + dato + '}';
    }
}
