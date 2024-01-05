
package EPS;


public class Clientes {
String nombre;
int edad;
char afiliacion;
boolean cond;

    public Clientes(String nombre, int edad, char afiliacion, boolean cond) {
        this.nombre = nombre;
        this.edad = edad;
        this.afiliacion = afiliacion;
        this.cond = cond;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(char afiliacion) {
        this.afiliacion = afiliacion;
    }

    public boolean isCond() {
        return cond;
    }

    public void setCond(boolean cond) {
        this.cond = cond;
    }


}
