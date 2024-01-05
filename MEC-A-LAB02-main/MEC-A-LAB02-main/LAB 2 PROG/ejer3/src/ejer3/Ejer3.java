
package ejer3;

import java.util.Scanner;
public class Ejer3 {
    static Scanner leer = new Scanner(System.in);
  
    public static void main(String[] args) {
        int n, aux;
        int cantidad;
        System.out.println("1.) 100 ");
        System.out.println("2.) 500 ");
        System.out.println("3.) 1000 ");
        System.out.println("4.) 5000 ");
        System.out.println("5.) 10000 ");
        System.out.println("Escriba la prueba que desea realizar ");
        n= leer.nextInt();
        switch (n){
            case 1:
                cantidad=100;
                int [] datos = new int [cantidad];
                //llenado de arreglo
                for (int i=0; i<cantidad; i++){
                    datos[i]= (int)(Math.random()*100);
                }
                //burbuja
                long startTime=System.nanoTime();
                for(int i=0; i<(cantidad-1); i++){
                     for(int j=0; j<(cantidad-1); j++){
                        if(datos[j]>datos[j+1]){
                             aux= datos[j];
                             datos[j] = datos[j+1];
                             datos[j+1] = aux;
                        }
                    } 
                }
                long stopTime=System.nanoTime();
                long burbujatiempo=stopTime-startTime;
                break;
                //llenado de arreglo
                
                
                }
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                break;
            case 5: 
                break;
            default: 
                System.out.println("Equivocado ");
                break;
                
    }
        
    }
    
}
