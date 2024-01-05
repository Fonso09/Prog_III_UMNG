
package lab05.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Portátil de Fonso
 */
public class Datos {
   static ArrayList<String> Fecha= new ArrayList<>();
   static ArrayList<String> Predio= new ArrayList<>();
   static ArrayList<String> Vereda= new ArrayList<>();
   static ArrayList<String> Cantidad= new ArrayList<>();
   static HashMap<String, Integer> filtro = new HashMap<>();
    
    public Datos(){
        Coleccion();
    }
    public static void Coleccion(){
        File archivo = new File("./archivo.csv");
       // int nm=1;
        try {
        Scanner sc = new Scanner(archivo);
        while(sc.hasNextLine()){
            String palabras=sc.nextLine();
            String[] linea= palabras.split(",");
            Fecha.add(linea[0]);
            Predio.add(linea[1]);
            Vereda.add(linea[2]);
            Cantidad.add(linea[3]);
            
        }
        /*for(String a: Cantidad){
                System.out.println(nm+" "+a);
                nm++;
            }*/
        } catch(FileNotFoundException e){
            System.out.println("no se encontró el archivo");
        }
        
    }
    public static void Filtro(){
        for(int i=0; i<Vereda.size();i++){
            int cant= Integer.parseInt(Cantidad.get(i));
            if(filtro.containsKey(Vereda.get(i))){
                filtro.put(Vereda.get(i), filtro.get(Vereda.get(i))+cant);
                
            } else{
                filtro.put(Vereda.get(i), cant);
            }
        }
        for (String i : filtro.keySet()) {
            System.out.println("key: " + i + " value: " + filtro.get(i));
        }       
    }
    public static void main(String[] args){
        Coleccion();
        Filtro();
    }
    
}
