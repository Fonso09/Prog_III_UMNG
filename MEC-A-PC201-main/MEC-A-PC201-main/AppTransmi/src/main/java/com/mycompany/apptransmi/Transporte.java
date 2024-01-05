
package com.mycompany.apptransmi;

/**
 *
 * @author Estudiante
 */
public abstract class Transporte extends Troncal {
    int hora_servicio, tiempo_llegada, precio;
    public abstract String[] buses (String estacion);
    public abstract int tiempo_recorrido(String estacion1, String estacion2);

    public int getHora_servicio() {
        return hora_servicio;
    }

    public void setHora_servicio(int hora_servicio) {
        this.hora_servicio = hora_servicio;
    }

    public int getTiempo_llegada() {
        return tiempo_llegada;
    }

    public void setTiempo_llegada(int tiempo_llegada) {
        this.tiempo_llegada = tiempo_llegada;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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
