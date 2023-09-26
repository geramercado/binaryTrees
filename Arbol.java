package arbolBinario;

public class Arbol {

    private Nodo raiz;
    private Nodo temporal;


    public Arbol(){
            this.raiz = null;
    }

        public Nodo getTemporal() {
            return temporal;
        }

        public void setTemporal(Nodo temporal) {
            this.temporal = temporal;
        }

        public Nodo getRaiz() {
                    return raiz;
            }

        public void setRaiz(Nodo raiz) {
                this.raiz = raiz;
        }

        public boolean vacio(){
            return this.raiz == null;
        }

        public void insertar(Nodo temporal, Nodo auxiliar){
        int primero = 0;
                if(auxiliar == null){
                        this.raiz = temporal;
                        primero = temporal.getDato();
                        System.out.println("Este es el primer dato insertado "+primero);
                }else {
                        if(temporal.getDato() <= auxiliar.getDato()){
                                if(auxiliar.getNodoIzquierdo() == null){
                                        auxiliar.setNodoIzquierdo(temporal);
                                }else{
                                        insertar(temporal, auxiliar.getNodoIzquierdo());
                                }

                        }else{
                                if(auxiliar.getNodoDerecho() == null){
                                        auxiliar.setNodoDerecho(temporal);
                                }else{
                                        insertar(temporal, auxiliar.getNodoDerecho());
                                }
                        }
                }

        }

            public void imprimir(Nodo raiz){
                if (raiz != null) {
                    imprimir(raiz.getNodoIzquierdo());
                    System.out.print("("+raiz.getDato()+")");
                    imprimir(raiz.getNodoDerecho());
                }
            }

            private int suma;
            private int contador;
            public void promedio(Nodo raiz) {

                    if (raiz != null) {
                        promedio(raiz.getNodoIzquierdo());
                            ++contador;
                            suma += raiz.getDato();
                        promedio(raiz.getNodoDerecho());

                        System.out.println("Promedio es: "+(suma/contador));
                    }
            }

           // private int max;
            public int maximo(Nodo raiz,  int max){
                if (raiz != null) {
                    max = raiz.getDato();
                    return maximo(raiz.getNodoDerecho(), max);
                }
                //System.out.println("El valor maximo es: "+max);
                return max;
            }

            private int min;
            public void minimo(Nodo raiz){
                if (raiz != null) {
                    min = raiz.getDato();
                    minimo(raiz.getNodoIzquierdo());
                }
                System.out.println("El valor minimo es: "+min);
            }



            public boolean buscar(int busca){
                Nodo auxiliar = raiz;
                boolean bandera = false;

                    for(;;){
                        if(auxiliar != null && busca > auxiliar.getDato()){
                            auxiliar = auxiliar.getNodoDerecho();
                        }else if(auxiliar != null && busca < auxiliar.getDato()){
                            auxiliar = auxiliar.getNodoIzquierdo();
                        }else{
                            bandera = auxiliar != null;
                            break;
                        }
                    }
                return bandera;
            }



            public int buscarNivel(int busca){
                Nodo auxiliar = raiz;
                boolean bandera = false;
                int contador = 1;

                for(;;){
                    if(auxiliar != null && busca > auxiliar.getDato()){
                        auxiliar = auxiliar.getNodoDerecho();
                        contador++;
                    }else if(auxiliar != null && busca < auxiliar.getDato()){
                        auxiliar = auxiliar.getNodoIzquierdo();
                        contador++;
                    }else{
                        bandera = auxiliar != null;
                        break;
                    }
                }
                return contador;
            }



            public int primero(){
                return this.raiz.getDato();
            }

            public int ultimo(){
                return temporal.getDato();
            }



        public void eliminarUno(int elimina){
            Nodo aux = raiz;
            Nodo anterior = null;
            Nodo borrado;
            boolean bandera = false;

            for(;;){
                if(aux.getNodoDerecho() != null && elimina > aux.getNodoDerecho().getDato()){
                    anterior = aux;
                    aux = aux.getNodoDerecho();
                }else if(aux != null && elimina < aux.getDato()){
                    anterior=aux;
                    aux = aux.getNodoIzquierdo();
                }else{
                    bandera= aux!=null;
                    if(anterior.getDato() == elimina){
                        borrado = anterior.getNodoDerecho();
                        anterior.setNodoDerecho(null);
                    }else{
                        borrado = anterior.getNodoIzquierdo();
                        anterior.setNodoIzquierdo(null);
                    }
                    reInserta(borrado,elimina);
                    break;
                }
            }


        }


        String a="";
        public String subArbol(Nodo subRaiz){
            if(subRaiz!=null){
                subArbol(subRaiz.getNodoIzquierdo());
                a+=subRaiz.getDato() + " ";
                subArbol(subRaiz.getNodoDerecho());
            }
            return a;
        }

        public void reInserta(Nodo borrado, int elimina){

            String valores=subArbol(borrado);
            System.out.println("sub  "+valores);
            String num[]=valores.split(" ");

            for (int i = 0; i < num.length; i++) {
                Nodo nuevo = new Nodo(Integer.parseInt(num[i]));
                if(nuevo.getDato() != elimina){
                    insertar(nuevo, this.raiz);
                }
            }
        }


        public void descendiente(Nodo raiz){
            if (raiz != null) {
                descendiente(raiz.getNodoDerecho());
                System.out.print(raiz.getDato() + " |");
                descendiente(raiz.getNodoIzquierdo());
            }
        }


        public boolean buscar1(int busca){
            Nodo aux = raiz;
            boolean bandera = false;

            for(;;){

                if(aux != null && busca > aux.getDato()){
                    aux = aux.getNodoDerecho();
                }else if(aux != null && busca < aux.getDato()){
                    aux = aux.getNodoIzquierdo();
                }else{
                    bandera = aux != null;
                    break;
                }

            }
            return bandera;
        }




}
