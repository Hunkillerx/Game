/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Josex
 */
public class AccionesJugador {
    
    Jugador player = new Jugador(100, 100, 100,20);
    
    public void Trabajar(){
        player.setSueño(player.getSueño()-40);
        player.setHambre(player.getHambre()-20);
        player.setAburrimiento(player.getAburrimiento()-50);
        player.setDinero(player.getDinero()+60);
    }
    
    public void Comer(){
        player.setHambre(player.getHambre() + 40);
        player.setDinero(player.getDinero()-20);
    }
    
    public void Dormir(){
        player.setSueño(player.getSueño()+70);
    }
    
    public void Jugar(){
        player.setAburrimiento(player.getAburrimiento()+30);
    }
    
}
