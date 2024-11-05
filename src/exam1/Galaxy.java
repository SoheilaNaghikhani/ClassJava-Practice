package src.exam1;

import java.util.*;

public class Galaxy {
    private String nameGalaxy;
    private List<Planet> listPlanet;

    public Galaxy(String nameGalaxy) {
        this.nameGalaxy = nameGalaxy;
        this.listPlanet = new ArrayList<>();
    }

    public Galaxy(String nameGalaxy, List<Planet> listPlanet) {
        this.nameGalaxy = nameGalaxy;
        this.listPlanet = new ArrayList<>();
    }

    public String getNameGalaxy() {
        return nameGalaxy;
    }

    public void setNameGalaxy(String nameGalaxy) {
        this.nameGalaxy = nameGalaxy;
    }

    public List<Planet> getListPlanet() {
        return listPlanet;
    }

    public void setListPlanet(List<Planet> listPlanet) {
        this.listPlanet = listPlanet;
    }
}

