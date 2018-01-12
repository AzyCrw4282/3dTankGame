/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team142.gg.server.model.mappable;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author just1689
 */
public class Tank extends MovableElement {

    @Getter
    @Setter
    private double health;

    @Getter
    @Setter
    private double maxHealth;

    public Tank(double x, double y, double z, String skin, double speed, int tag, double hp) {
        super(x, y, z, skin, speed, tag);
        this.health = hp;
        this.maxHealth = hp;
    }

    public void damage(double dmg) {
        System.out.println("Damage! " + dmg);
        health -= dmg;

    }

}
