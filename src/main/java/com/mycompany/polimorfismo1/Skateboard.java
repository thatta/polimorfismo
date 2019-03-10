/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo1;

/**
 *
 * @author Karen Tatiana Almansa Jimenez
 * @author Juan David Ojeda Bernal
 */
public class Skateboard extends Vehiculo{
    private String madera;

    /**
     *
     * @param madera variable donde de guardará el tipo de madera de la tabla
     * @param llantas variable de la clase padre donde se guardará la cantidad de ruedas de la patinetaa
     * @param marca variable donde se guardará la marca de la tabla
     * @param modelo variable de la clase padre donde se guardará el modelo de la tabla
     * @param precio variable de la clase padre donde se guardará el precio de la tabla
     */
    public Skateboard(String madera, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.madera = madera;
    }

    /**
     *
     * @return
     */
    public String getMadera() {
        return madera;
    }

    /**
     *
     * @param madera
     */
    public void setMadera(String madera) {
        this.madera = madera;
    }

    /**
     *metodo de la clase padre
     */
    @Override
    public void guardarVehiculo() {
      
    }

    /**
     *metodo de la clase padre
     */
    @Override
    public void usarVehiculo() {
       
    }

    /**
     *
     */
    public void imprimirSkateboard(){
        System.out.println("SOY UNA PATINETA");
    }
    
}


