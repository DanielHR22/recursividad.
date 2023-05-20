package recursivida.etc;
public class Polinomios {
    
public void multiplicar(Node p, Node q, Node r){
        Node pointer = p;
        Node pointer2 = r;
        while (pointer.next!=null){
            pointer2.c = pointer.c*q.c;
            pointer2.a = pointer.a+q.a;
            pointer2.x = pointer.x+q.x;
            pointer=pointer.next;
            pointer2=pointer2.next;
        }
    }

public void Dividir(Node p, Node q, Node r){
        Node pointer = p;
        Node pointer2 = r;
        while (pointer.next!=null){
            pointer2.c = pointer.c/q.c;
            pointer2.a = pointer.a-q.a;
            pointer2.x = pointer.x-q.x;
            pointer=pointer.next;
            pointer2=pointer2.next;
        }
    }


public void gradoPolinomio (Node p){
        Node pointer = p;
         int mayor=0;
        while (pointer.next!=null){
           if (pointer.x >= mayor){
            mayor = pointer.x;
           }            
        }
        System.out.println(mayor + "Este es el mayor exponente");
    }


public void integral (Node P, Node R){
        Node pointer = P;
        Node pointer2 = R;
        Node T = null;
        while (pointer.next != null){
            pointer2.x = pointer.x + 1;
            pointer2.c = pointer.c/pointer2.x;
            pointer=pointer.next;
            pointer2=pointer2.next;
        }
    }
}