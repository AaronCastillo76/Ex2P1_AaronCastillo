/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_aaroncastillo;


public class Personaje {

    
    private String nombre;
    private int HP;
    private int MP;
    private int attackPoints;
    private int defensePoints;

    public Personaje(String nombre, int HP, int MP, int attackPoints, int defensePoints) {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    @Override
    public String toString() {
        return  nombre + "\nHP=" + HP + "\nMP=" + MP + "\nAttackPoints=" + attackPoints + "\nDefensePoints=" + defensePoints;
    }
    
    
    
    

}
