package aed;

public class Inicio {

    static void imprimir(int n){
        if(0 <= n){
            imprimir(n - 1);
            System.out.println(n);
        }  
    }
    
    static int f(int n){
        if(n == 1){
            return 1;
        }
        return n * f(n - 1);
    }
    
    static void largo(Nodo n, int s){
        if(n.getSig() != null){
            s += 1;
            largo(n.getSig(), s);
        }  
    }
    
    static void ins(Nodo n, int a, int b){
        if(n.getSig() != null){
            if(n.getDato() == a){
                Nodo nuevo = new Nodo(b);
                nuevo.setSig(n.getSig());
                n.setSig(nuevo);
                //si agrego un nodo nuevo, ya paso directo al siguiente
                n = n.getSig();
            }
            ins(n.getSig(), a, b);
        }  
    }
    
    public static void main(String[] args) {
        imprimir(9);
        System.out.println(f(5));
    }
}
