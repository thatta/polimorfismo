/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karen Tatiana Almansa Jimenez
 * @author Juan David Ojeda Bernal
 */
public class Principal {
  
    /**
     *clase donde se ejecutarán todas las clases
     */
    public void principal1(){
        
        Car carro1= new Car("","","","","","","","");
        Car carro2= new Car("","","","","","","","");
        
        Jet jet1=new Jet("","","","","","","","");
        Jet jet2=new Jet("","","","","","","","");
        
        Skateboard patineta1=new Skateboard("","","","","");
        Skateboard patineta2=new Skateboard("","","","","");
        
        Blcycle bicicleta1=new Blcycle ("","","","","","");
        Blcycle bicicleta2=new Blcycle ("","","","","","");
        
        List<Vehiculo> vehiculo = new ArrayList<>();
    
        vehiculo.add(carro1);
        vehiculo.add(carro2);
        vehiculo.add(jet1);
        vehiculo.add(jet2);
        vehiculo.add(bicicleta1);
        vehiculo.add(bicicleta2);
        vehiculo.add(patineta1);
        vehiculo.add(patineta2);
        
      
        for (Vehiculo listaTemporal:vehiculo){
            
            if (listaTemporal instanceof Car){
           
                Car car1 = (Car) listaTemporal;
                //car1.usarVehiculo();
                //car1.guardarVehiculo();
                car1.imprimirCar();
                car1.imprimirVehiculo();
                car1.imprimirVehiculoPower();
                
            }
            else if (listaTemporal instanceof Jet){
            
                Jet jett1 = (Jet) listaTemporal;
                //jett1.usarVehiculo();
                //jett1.guardarVehiculo();
                jett1.imprimirJet();
                jett1.imprimirVehiculo();
                jett1.imprimirVehiculoPower();
            }
            else if (listaTemporal instanceof Blcycle){
            
                Blcycle bici1 = (Blcycle) listaTemporal;
                //bici1.usarVehiculo();
                //bici1.guardarVehiculo();
                bici1.imprimirBlcycle();
                bici1.imprimirVehiculo();
            }
            else if (listaTemporal instanceof Skateboard){
            
                Skateboard board1 = (Skateboard) listaTemporal;
                //board1.usarVehiculo();
                //board1.guardarVehiculo();
                board1.imprimirSkateboard();
                board1.imprimirVehiculo();
            }
        }
    }
}
