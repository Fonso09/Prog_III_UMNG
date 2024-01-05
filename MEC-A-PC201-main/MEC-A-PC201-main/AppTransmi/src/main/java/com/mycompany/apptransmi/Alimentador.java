/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apptransmi;

/**
 *
 * @author Estudiante
 */
public class Alimentador extends Transporte {
    String nombre, placa;
    int tiempo;
    @Override
    public int precio(){
        return 2750;
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
}
