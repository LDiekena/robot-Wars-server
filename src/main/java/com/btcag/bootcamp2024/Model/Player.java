package com.btcag.bootcamp2024.Model;

public class Player {
    String playerId;
    String robotId;

    public Player() {

    }

    public Player(String playerId, String robotId) {
        this.playerId = playerId;
        this.robotId = robotId;
    }

    //Getter
    public String getPlayerId() {
        return playerId;
    }

    public String getRobotId() {
        return robotId;
    }

    //Setter
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }
}
