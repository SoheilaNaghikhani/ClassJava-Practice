package src.exam;

import java.util.List;

public class Planet implements LifeSupportingPlanet,ResourceRichPlanet {
    private String namePlanet;
    private Type type;
    private int countMoon;
    private Long distanceFromSun;
    private String hasLife;
    private String resource;


    public int changeCountMoon(int countMoon)
    {
       this.countMoon=countMoon;
        return countMoon;
    }

    public Planet(String namePlanet, Type type, int countMoon, Long distanceFromSun, String hasLife, String resource) {
        this.namePlanet = namePlanet;
        this.type = type;
        this.countMoon = countMoon;
        this.distanceFromSun = distanceFromSun;
        this.hasLife = hasLife;
        this.resource = resource;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    @Override
    public String toString() {
        return  namePlanet + '#' +
                  type +'#' +
                  countMoon +'#' +
                  distanceFromSun +'#' +
                  hasLife  +'#' +
                  resource +'#' ;
    }


    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCountMoon() {
        return countMoon;
    }

    public void setCountMoon(int countMoon) {
        this.countMoon = countMoon;
    }

    public Long getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(Long distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public void live() {
        System.out.println("");
    }

    @Override
    public void showResource() {

    }
}
