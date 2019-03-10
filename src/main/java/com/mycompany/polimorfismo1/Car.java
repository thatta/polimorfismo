/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo1;

/**
 * @author Karen Tatiana Almansa Jimenez
 * @author Juan David Ojeda Bernal
 */
public class Car extends PoweredVehicle{
    private String tipoConbustible;
    private String velocidadTerrestre;

    
    
    Car(String tipoConbustible, String velocidadTerrestre, String motor, String trasmision, String llantas, String marca, String modelo, String precio) {
        super(motor, trasmision, llantas, marca, modelo, precio);
        this.tipoConbustible = tipoConbustible;
        this.velocidadTerrestre = velocidadTerrestre;
    }

    /**
     *
     * @return
     */
    public String getTipoConbustible() {
        return tipoConbustible;
    }

    /**
     *
     * @param tipoConbustible
     */
    public void setTipoConbustible(String tipoConbustible) {
        this.tipoConbustible = tipoConbustible;
    }

    /**
     *
     * @return
     */
    public String getVelocidadTerrestre() {
        return velocidadTerrestre;
    }

    /**
     *
     * @param velocidadTerrestre
     */
    public void setVelocidadTerrestre(String velocidadTerrestre) {
        this.velocidadTerrestre = velocidadTerrestre;
    }

    /**
     * metodo de la clase padre
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
     *metodo de la clase padre
     */
    public void imprimirCar(){
        System.out.println("SOY UN CARRO");
    }
}


