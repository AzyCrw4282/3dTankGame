/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team142.gg.server.model.mappable;

import com.team142.gg.server.controller.map.terrain.SkinType;
import com.team142.gg.server.model.Game;
import com.team142.gg.server.model.Player;
import com.team142.gg.server.model.Server;
import com.team142.gg.server.utils.PhysicsUtils;
import lombok.Getter;

/**
 *
 * @author just1689
 */
public class Bullet extends MovableElement {

    @Getter
    private Player player;

    @Getter
    private boolean ok;
    
    private Game game;

    public Bullet(Player player) {
        super(player.getTANK().getX(), player.getTANK().getY(), player.getTANK().getZ(), SkinType.BULLET.name(), Server.DEFAULT_SPEED, -1);
        this.setDirection(player.getTANK().getDirection());
        this.player = player;

    }

    public void movementTickBullet() {
        movementTick();

        //Check for hits
        //TODO
        player.getGame().getTANKS().values()
                .forEach((tank) -> PhysicsUtils.isTinyObjectInLarger(this, tank));
        
    }

}
