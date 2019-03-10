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
public abstract class Vehiculo implements Interfaz{
    private String llantas;
    private String marca;
    private String modelo;
    private String precio;

    /**
     *
     * @param llantas variable donde se guardara la cantidad de llantas del vehiculo
     * @param marca variable donde se guardara la marca del vehiculo
     * @param modelo variable donde se guardará el modelo del vehiculo
     * @param precio variable donde se guardará el precio del vehiculo
     */
    public Vehiculo(String llantas, String marca, String modelo, String precio) {
        this.llantas = llantas;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public String getLlantas() {
        return llantas;
    }

    /**
     *
     * @param llantas
     */
    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    /**
     *metodo de la clase padre
     */
    @Override
    public abstract void guardarVehiculo();
       
    /**
     *metodo de la clase padre
     */
    @Override
    public abstract void usarVehiculo();
    
    /**
     *
     */
    public void imprimirVehiculo(){
        System.out.println("SOY UN VEHICULO");
    }
     
    
}

