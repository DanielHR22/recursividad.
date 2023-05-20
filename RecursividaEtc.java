package recursivida.etc;
import java.util.Scanner;

public class RecursividaEtc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recursividad r1 = new Recursividad();
        int n;
        System.out.println("Ingrese hasta el numero de cuadrados que quiere sumar: \n");
        n = Integer.parseInt(sc.nextLine());
        int resultado = r1.sumaCuadrados(n);        
        System.out.println("El resltado de sumar los primeros " + n + " cuadrados es: " + resultado);
        
        
        
    }
}
