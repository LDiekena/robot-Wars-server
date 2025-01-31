package com.btcag.bootcamp2024.Model;

public class Move {
    String id;
    String playerId;
    MovementType movementType;
    Align align;
    int mapIndex;

    public Move() {

    }

    public Move(String id, String playerId, MovementType movementType, Align align, int mapIndex) {
        this.id = id;
        this.playerId = playerId;
        this.movementType = movementType;
        this.align = align;
        this.mapIndex = mapIndex;
    }

    //Getter
    public String getId() {
        return id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public Align getAlign() {
        return align;
    }

    public int getMapIndex() {
        return mapIndex;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public void setMapIndex(int mapIndex) {
        this.mapIndex = mapIndex;
    }
}


