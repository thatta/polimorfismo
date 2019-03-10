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
public class Blcycle extends Vehiculo {
    private String Pedales;
    private String Marco;

    /**
     *
     * @param Pedales variable donde se guardarán los pedales, atributo propio de la clase
     * @param Marco variable donde se guardará la ref del marco
     * @param llantas variable de la clase padre para guardar la cantidad de llantas
     * @param marca variable de la clase padre donde se guardará la marca de la cicla
     * @param modelo variable donde se guardara el modelo de la cicla de la clase padre
     * @param precio variable de la clase padre donde se guardara el precio de la cicla
     */
    public Blcycle(String Pedales, String Marco, String llantas, String marca, String modelo, String precio) {
        super(llantas, marca, modelo, precio);
        this.Pedales = Pedales;
        this.Marco = Marco;
    }

    /**
     *
     * @return
     */
    public String getPedales() {
        return Pedales;
    }

    /**
     *
     * @param Pedales
     */
    public void setPedales(String Pedales) {
        this.Pedales = Pedales;
    }

    /**
     *
     * @return
     */
    public String getMarco() {
        return Marco;
    }

    /**
     *
     * @param Marco
     */
    public void setMarco(String Marco) {
        this.Marco = Marco;
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
     *metodo de la clase padre
     */
    public void imprimirBlcycle(){
        System.out.println("SOY UNA BICLILETA");
    }
}
