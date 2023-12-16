/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_aaroncastillo;

/**
 *
 * @author Admin
 */
public class Items {

    private String nombre;
    private int HPpoints;
    private int MPpoints;

 
    public Items(String nombre, int HPpoints, int MPpoints) {
        this.nombre = nombre;
        this.HPpoints = HPpoints;
        this.MPpoints = MPpoints;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHPpoints() {
        return HPpoints;
    }

    public void setHPpoints(int HPpoints) {
        this.HPpoints = HPpoints;
    }

    public int getMPpoints() {
        return MPpoints;
    }

    public void setMPpoints(int MPpoints) {
        this.MPpoints = MPpoints;
    }

    @Override
    public String toString() {
        return "Items:" + nombre + ", HPpoints=" + HPpoints + ", MPpoints=" + MPpoints;
    }
    
    

}
