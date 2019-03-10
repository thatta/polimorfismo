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
public abstract class PoweredVehicle extends Vehiculo {
    
    private String motor;
    private String trasmision;

    /**
     *
     * @param motor variable donde se guardaráel tipo de encendido del auto
     * @param trasmision variable donde se guardará si el auto es mecanico o automatico
     * @param llantas variable de la clase padre donde se guardará la cantidad de llantas
     * @param marca variable de la clase padre donde se guardará la marca del auto
     * @param modelo variable de la clase padre donde se guardará el modelo del auto
     * @param precio variable donde se guardará el precio del auto
     */
    public PoweredVehicle(String motor, String trasmision, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.motor = motor;
        this.trasmision = trasmision;
    }

    /**
     *
     * @return
     */
    public String getMotor() {
        return motor;
    }

    /**
     *
     * @param motor
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     *
     * @return
     */
    public String getTrasmision() {
        return trasmision;
    }

    /**
     *
     * @param trasmision
     */
    public void setTrasmision(String trasmision) {
        this.trasmision = trasmision;
    }

    /**
     *metodo de la clase padre
     */
    @Override
    public abstract void usarVehiculo();

    /**
     *metodo de la clase padre
     */
    @Override
    public abstract void guardarVehiculo();
   
    /**
     *
     */
    public void imprimirVehiculoPower(){
        System.out.println("SOY UN VEHICULO MOTORIZADO");
    }
    
}
