package ejer2;
import java.util.Scanner;
import java.util.HashMap;
public class Ejer2 {
  static Scanner leer = new Scanner(System.in);

  public static void main(String[] args) {
    HashMap < Character, Integer > mapa = new HashMap < > ();
    char aux, modaC = ' ';
    int n, moda = 0;
    String palabra;

    System.out.println("Ingrese la Palabra:");
    palabra = leer.nextLine();
    System.out.println("1. Invertir");
    System.out.println("2. Sustituir");

    n = leer.nextInt();
    char[] aCarac = palabra.toCharArray(); //convierte cadena a un array de carcateres

    switch (n) {
    case 1:
      for (int i = 0; i < aCarac.length / 2; i++) {
        aux = aCarac[i];
        aCarac[i] = aCarac[aCarac.length - 1 - i];
        aCarac[aCarac.length - 1 - i] = aux;

      }
      for (int i = 0; i < aCarac.length; i++) {
        System.out.print(aCarac[i]);

      }

      break;
    case 2:
      for (int i = 0; i < aCarac.length; i++) {
        char letra = aCarac[i];
        if (mapa.containsKey(letra)) {
          mapa.put(letra, mapa.get(letra) + 1);
        } else {
          mapa.put(letra, 1);
        }
      }
      for (Character i: mapa.keySet()) {
        if (i != ' ') {
          if (mapa.get(i) > moda) {
            moda = mapa.get(i);
            modaC = i;

          }
        }
      }
      String palabraNueva = String.valueOf(aCarac);
      palabraNueva = palabraNueva.replace('e', modaC).replace('i', modaC)
        .replace('o', modaC).replace('u', modaC).replace('a', modaC);
      System.out.println(palabraNueva);

      break;
    default:
      System.out.println("valor equivocado");
      break;

    }
  }

}