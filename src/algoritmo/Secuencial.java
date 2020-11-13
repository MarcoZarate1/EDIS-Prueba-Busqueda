
package algoritmo;

import java.util.Scanner;


public class Secuencial {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista[]= {12,18,-20,0,15,12,9,6};
        int num;
        System.out.println("Ingresar valor a buscar: ");
        num = teclado.nextInt();
        
        boolean encontrado = false;
        
        for (int i = 0; i < lista.length && encontrado == false; i++){
            if ( num == lista[i]){
                encontrado = true;
                System.out.println("Posicion del numero busacado: " + i);
            }
        }
        if(encontrado == false){
            System.out.print("Valor no encontrado");
     
 }  
    }
    
}
