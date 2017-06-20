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
public class Jugador {

    public Jugador(int Sueño, int Hambre, int Aburrimiento, int Dinero) {
        this.Sueño = Sueño;
        this.Hambre = Hambre;
        this.Aburrimiento = Aburrimiento;
        this.Dinero = Dinero;
    }

    private int Sueño;
    private int Hambre;
    private int Aburrimiento;
    private int Dinero;

    public int getSueño() {
        return Sueño;
    }

    public void setSueño(int Sueño) {
        this.Sueño = Sueño;
    }

    public int getHambre() {
        return Hambre;
    }

    public void setHambre(int Hambre) {
        this.Hambre = Hambre;
    }

    public int getAburrimiento() {
        return Aburrimiento;
    }

    public void setAburrimiento(int Aburrimiento) {
        this.Aburrimiento = Aburrimiento;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

}
