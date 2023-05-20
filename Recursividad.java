/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivida.etc;

/**
 *
 * @author sala103
 */

public class Recursividad {
//Ejemplo:
    public int sumar (int n){
        if (n<=5){
            sumar(n+1); 
        }
         return n; 
    }
    
//Ejercicio 1:
    public int sumaCuadrados (int n){

        if (n==1){
            return 1;
        }
        else {
            int cuadrado = n*n;
           return cuadrado + sumaCuadrados(n-1);
        } 
    }    
}
