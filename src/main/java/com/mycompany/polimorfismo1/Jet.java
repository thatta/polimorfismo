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
public class Jet extends PoweredVehicle {
   private String turbinas;
   private String Alas;

    /**
     *
     * @param turbinas variable donde se guardará la cant de turbinas del jet
     * @param Alas variable donde se tendrán en cuanta la cantidad de aleros del jet
     * @param motor variable de la clase padre donde se guardara el motor
     * @param trasmision variable de la clase padre donde se guardará la transmision 
     * @param llantas variable de la clase padre donde se guardará la cantidad de llantas
     * @param marca variable de la clase padre donde se guardará la marca de jet    
     * @param modelo variable de la clase padre donde se guardará el modelodel jet
     * @param precio variable de la clase padre donde se guardará el precio del jet
     */
    public Jet(String turbinas, String Alas, String motor, String trasmision, String llantas, String marca, String modelo, String precio) {
        super(motor, trasmision, llantas, marca, modelo, precio);
        this.turbinas = turbinas;
        this.Alas = Alas;
    }

    /**
     *
     * @return
     */
    public String getTurbinas() {
        return turbinas;
    }

    /**
     *
     * @param turbinas
     */
    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }

    /**
     *
     * @return
     */
    public String getAlas() {
        return Alas;
    }

    /**
     *
     * @param Alas
     */
    public void setAlas(String Alas) {
        this.Alas = Alas;
    }

    /**
     *metodo de la clase padre
     */
    @Override
    public void guardarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *metodo de la clase padre
     */
    @Override
    public void usarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     */
    public void imprimirJet(){
        System.out.println("SOY UN JET");
    }
}


