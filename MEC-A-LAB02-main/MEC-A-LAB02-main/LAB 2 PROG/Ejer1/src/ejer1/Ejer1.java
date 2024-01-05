
package ejer1;
import java.util.Scanner;
import java.util.HashMap;
public class Ejer1 {
    static Scanner leer= new Scanner(System.in);
    
    public static void main(String[] args) {
        HashMap <Integer, Integer> mapa= new HashMap <>();
        int cantidad, aux, mediana, sumatoria=0;
        float media;
        double varianza=0.0, desviacion;
        System.out.println("Ingrese la cantidad de datos deseados: ");
        cantidad = leer.nextInt();
        int [] datos = new int [cantidad];
        //llenar arreglo con número aleatorios de 0 a 100
        for (int i=0; i<cantidad; i++){
            datos[i]= (int)(Math.random()*100);
        }
        //organizar datos de menor a mayor
        for(int i=0; i<(cantidad-1); i++){
           for(int j=0; j<(cantidad-1); j++){
               if(datos[j]>datos[j+1]){
                  aux= datos[j];
                  datos[j] = datos[j+1];
                  datos[j+1] = aux;
               }
           } 
        }
        System.out.println("DATOS GENERADOS: ");
        //escritura de datos organizados y sumatoria
        for(int i=0; i<(cantidad); i++){
            sumatoria+=datos[i];
            System.out.print(" "+datos[i]+ " ");
        }
        System.out.println();
        //mediana
        mediana=datos[cantidad/2];
        System.out.println("MEDIANA: "+mediana+" ");
        //media
        media= sumatoria/cantidad;
        System.out.println("MEDIA: "+media+" ");
        //moda
       for(int i =0; i<cantidad; i++){
           int dato = datos[i];
           if(mapa.containsKey(dato)){
               mapa.put(dato, mapa.get(dato)+1);
           } else {
               mapa.put(dato, 1);
           }
       }
       int moda=0;
       int modaN=0;
       for (Integer i : mapa.keySet()){
           if(mapa.get(i)>moda){
               moda=mapa.get(i);
               modaN= i;
           }
       }
       System.out.println("MODA: "+modaN+" ");
       //VARIANZA
       for(int i = 0 ; i < cantidad; i++){
        double rango;
        rango = Math.pow(datos[i] - media, 2);
        varianza = varianza + rango;
       }
       varianza = varianza / 10;
       System.out.println("VARIANZA: "+varianza+" ");
       //Desviación 
       desviacion = Math.sqrt(varianza);
       System.out.println("DESVIACION: "+desviacion+" ");
    }
    
}
