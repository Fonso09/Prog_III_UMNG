
package calc_con;
import java.util.Scanner;

public class Calc_Con {
    static Scanner leer= new Scanner(System.in);
    public static void main(String[] args) {
        float a,b,r;
        double j, k;
        boolean exit = false;
        //variables para operaciones trigonométricas
        double resul;
        double anguloEnGrados;
        double anguloEnRadianes;
        int n;
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Seno");
        System.out.println("6 - Coseno");
        System.out.println("7 - Tangente");
        System.out.println("8 - Raíz Enésima");
        System.out.println("9 - Potencia enésima");
        System.out.println("10 - Porcentaje IVA");
        System.out.println("11 - Salir de la calculadora");
        while(!exit==true){
            System.out.println("Ingrese la operación que desea realizar");
            n = leer.nextInt();
        
            switch(n){
                case 1:  //suma
                    System.out.println("Ingrese los dos valores que desea sumar");
                    a= leer.nextFloat();
                    System.out.println("+");
                    b= leer.nextFloat(); //lector de Flotantes
                    r= a+b;
                    System.out.println("Resultado: "+r);
                    break;
                case 2: //resta
                    System.out.println("Ingrese los dos valores que desea restar");
                    a= leer.nextFloat();
                    System.out.println("-");
                    b= leer.nextFloat(); //lector de Flotantes
                    r= a-b;
                    System.out.println("Resultado: "+r);
                    break;
                case 3: //multiplicacion
                    System.out.println("Ingrese los dos valores que desea Multiplicar");
                    a= leer.nextFloat();
                    System.out.println("*");
                    b= leer.nextFloat(); //lector de Flotantes
                    r= a*b;
                    System.out.println("Resultado: "+r);
                    break;
                case 4: //division
                    System.out.println("Ingrese los dos valores que desea dividir");
                    a= leer.nextFloat();
                    System.out.println("/");
                    b= leer.nextFloat(); //lector de Flotantes
                    r= a/b;
                    System.out.println("Resultado: "+r);
                    break;
                case 5://sen
                    System.out.println("Ingrese el ángulo en Grados");
                    anguloEnGrados=leer.nextDouble();
                    anguloEnRadianes = Math.toRadians(anguloEnGrados);
                    resul= Math.sin(anguloEnRadianes);
                    System.out.println("Resultado: "+resul);
                    break;
                case 6: //cos
                    System.out.println("Ingrese el ángulo en Grados");
                    anguloEnGrados=leer.nextDouble();
                    anguloEnRadianes = Math.toRadians(anguloEnGrados);
                    resul= Math.cos(anguloEnRadianes);
                    System.out.println("Resultado: "+resul);
                    break;
                case 7: //tan
                    System.out.println("Ingrese el ángulo en Grados");
                    anguloEnGrados=leer.nextDouble();
                    anguloEnRadianes = Math.toRadians(anguloEnGrados);
                    resul= Math.tan(anguloEnRadianes);
                    System.out.println("Resultado: "+resul);
                    break;
                case 8: //raíz enésima
                    System.out.println("Primero ponga el indice y luego el radicando");
                    b= leer.nextFloat();
                    System.out.println("√");
                    a= leer.nextFloat(); //lector de Flotantes
                    k=1/b;
                    j= Math.pow(a, k);
                    System.out.println("Resultado: "+j);
                    
                    break;
                case 9: //potencia enesima
                    System.out.println("Primero ponga la base y luego el Exponente");
                    a= leer.nextFloat();
                    System.out.println("^");
                    b= leer.nextFloat(); //lector de Flotantes
                    j= Math.pow(a, b);
                    System.out.println("Cantidad del IVA: "+j);
                    break;
                case 10: //IVA
                    System.out.println("Primero ponga porcentaje y luego el Precio");
                    a= leer.nextFloat(); 
                    System.out.println("%");
                    b= leer.nextFloat();
                    a= a/100;
                    r=b*a; 
                    System.out.println("Cantidad del IVA: "+r);
                    break;
                case 11: //Exit
                    exit=true;
                    break;
                default:
                    System.out.println("NO ESCOGIÓ NINGUNA OPCIÓN VÁLIDA ");
                    break;
            }
        }
        
       
        
        
    }
    
}
