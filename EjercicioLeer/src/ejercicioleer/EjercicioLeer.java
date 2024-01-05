
package ejercicioleer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class EjercicioLeer {
    Map<String, Integer> mapa = new HashMap<>(){
        
    };
    public void SepararLineas(){
        File archivo = new File("./archivo.csv"); 
        try {
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } 
    }
    
   
}