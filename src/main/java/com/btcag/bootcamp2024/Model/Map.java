package com.btcag.bootcamp2024.Model;

import java.util.List;

public class Map {
    String id;
    int mapSize;
    int mapSizeX;
    List<MapItems> mapItems;

    public Map() {

    }

    public Map(String id,int mapSize, int mapSizeX, List<MapItems> mapItems) {
        this.id = id;
        this.mapSize = mapSize;
        this.mapSizeX = mapSizeX;
        this.mapItems = mapItems;
    }

    //Getter
    public String getId() {
        return id;
    }

    public int getMapSize() {
        return mapSize;
    }

    public int getMapSizeX() {
        return mapSizeX;
    }

    public List<MapItems> getMapItems() {
        return mapItems;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public void setMapSizeX(int mapSizeX) {
        this.mapSizeX = mapSizeX;
    }

    public void setMapItems(List<MapItems> mapItems) {
        this.mapItems = mapItems;
    }
}
