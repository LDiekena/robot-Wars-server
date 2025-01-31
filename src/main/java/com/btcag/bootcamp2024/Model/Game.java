package com.btcag.bootcamp2024.Model;

import java.util.List;

public class Game {
    String id;
    String mapId;
    List<Player> players;
    List<Move> moves;
    GameStatus gameStatus;

    public Game() {

    }

    public Game(String id, String mapId, List<Player> players, List<Move> moves, GameStatus gameStatus) {
        this.id = id;
        this.mapId = mapId;
        this.players = players;
        this.moves = moves;
        this.gameStatus = gameStatus;
    }

    //Setter
    public String getId() {
        return id;
    }

    public String getMapId() {
        return mapId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
