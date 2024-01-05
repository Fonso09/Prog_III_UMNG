
package com.mycompany.apptransmi;

/**
 *
 * @author Estudiante
 */
public class Transmilenio extends Transporte{
    String nombre, placa;
    int tiempo;
    @Override
    public int precio(){
        return 2950;
    }

    @Override
    public String[] buses(String estacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Estaciones() {
        return "a";// retorna estaciones
    }

    @Override
    public int tiempo_recorrido(String estacion1, String estacion2) {
        return tiempo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public String[] getZonas() {
        return Zonas;
    }

    @Override
    public void setZonas(String[] Zonas) {
        this.Zonas = Zonas;
    }

    @Override
    public String[] getEstaciones() {
        return Estaciones;
    }

    @Override
    public void setEstaciones(String[] Estaciones) {
        this.Estaciones = Estaciones;
    }
    
}
