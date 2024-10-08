package src.exam;

import java.util.HashSet;
import java.util.Set;

public class Galaxy {
    private String nameGalaxy;
    private Set<Planet> planetSet;

    public Galaxy(String nameGalaxy) {
        this.nameGalaxy = nameGalaxy;
        this.planetSet = new HashSet<>();
    }

    public Galaxy(String nameGalaxy, Set<Planet> planetSet) {
        this.nameGalaxy = nameGalaxy;
        this.planetSet = new HashSet<>();
    }

    public String getNameGalaxy() {
        return nameGalaxy;
    }

    public void setNameGalaxy(String nameGalaxy) {
        this.nameGalaxy = nameGalaxy;
    }

    public Set<Planet> getPlanetSet() {
        return planetSet;
    }

    public void setPlanetSet(Set<Planet> planetSet) {
        this.planetSet = planetSet;
    }
}
