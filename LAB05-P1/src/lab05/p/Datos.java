
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
public final class Datos {
   ArrayList<String> Fecha= new ArrayList<>();
   ArrayList<String> Predio= new ArrayList<>();
   ArrayList<String> Vereda= new ArrayList<>();
   ArrayList<String> Cantidad= new ArrayList<>();
   static HashMap<String, Integer> filtro = new HashMap<>();

    public HashMap<String, Integer> getFiltro() {
        return filtro;
    }

    public void setFiltro(HashMap<String, Integer> filtro) {
        Datos.filtro = filtro;
    }
    
    public Datos(){
        Coleccion();
    }
    public void Coleccion(){
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
    public void FiltroVereda(){
        for(int i=0; i<Vereda.size();i++){
            int cant= Integer.parseInt(Cantidad.get(i));
            if(filtro.containsKey(Vereda.get(i))){
                filtro.put(Vereda.get(i), filtro.get(Vereda.get(i))+cant);
                
            } else{
                filtro.put(Vereda.get(i), cant);
            }
        }
        /*for (String i : filtro.keySet()) {
            System.out.println("key: " + i + " value: " + filtro.get(i));
        }*/       
    }
    public void FiltroPredio(){
        for(int i=0; i<Predio.size();i++){
            int cant= Integer.parseInt(Cantidad.get(i));
            if(filtro.containsKey(Predio.get(i))){
                filtro.put(Predio.get(i), filtro.get(Predio.get(i))+cant);
                
            } else{
                filtro.put(Predio.get(i), cant);
            }
        }
        /*for (String i : filtro.keySet()) {
            System.out.println("key: " + i + " value: " + filtro.get(i));
        }*/       
    }
    public void FiltroFechas(){
        filtro.put("2020",0);
        filtro.put("2021",0);
        filtro.put("2022",0);
        for(int i=0; i<20; i++){
            int cant= Integer.parseInt(Cantidad.get(i));
            
            filtro.put("2020", filtro.get("2020")+cant);
                
            
        }
        for(int i=20; i<52; i++){
            int cant= Integer.parseInt(Cantidad.get(i));
            
            filtro.put("2021", filtro.get("2021")+cant);
                
            
        }
        for(int i=52; i<67; i++){
            int cant= Integer.parseInt(Cantidad.get(i));
            
            filtro.put("2022", filtro.get("2022")+cant);
                
            
        }
        /*for (String i : filtro.keySet()) {
            System.out.println("key: " + i + " value: " + filtro.get(i));
        }*/
    }
    public void FiltroVeredaFecha(String s){
        for(int i=0; i<Predio.size();i++){
            int cant= Integer.parseInt(Cantidad.get(i));
            String a= Predio.get(i);
            if(a.equals(s)){
                if(filtro.containsKey(Fecha.get(i))){
                filtro.put(Fecha.get(i), filtro.get(Fecha.get(i))+cant);
                
            } else{
                filtro.put(Fecha.get(i), cant);
                
            } /*else{
                System.out.println("no se nada pa");
                System.out.println(Predio.get(i));
                System.out.println(s);
            }*/
        }
        }
        /*for (String b : filtro.keySet()) {
            System.out.println("key: " + b + " value: " + filtro.get(b));
        }*/
    }
    
    /*public static void main(String[] args){
        Coleccion();
        //FiltroVereda();
        FiltroVeredaFecha("El Moyo");
    }*/
    
}
