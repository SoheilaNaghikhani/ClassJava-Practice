package src.exam1;

import java.util.Objects;

public class Planet {
    private String namePlanet;
    private Type type;
    private int countMoon;
    private Long distanceFromSun;
    private Resource resource;
    private HasLife hasLife;

    public int changeCountMoon(int countMoon) {
        this.countMoon = countMoon;
        return countMoon;
    }

    public Planet(String namePlanet, Type type, int countMoon, Long distanceFromSun, Resource resource, HasLife hasLife) {
        this.namePlanet = namePlanet;
        this.type = type;
        this.countMoon = countMoon;
        this.distanceFromSun = distanceFromSun;
        this.resource = resource;
        this.hasLife = hasLife;
    }
    public String getNamePlanet() {
        return namePlanet;
    }

    @Override
    public String toString() {
        return namePlanet + ',' +
                type + ',' +
                countMoon + ',' +
                distanceFromSun + ',' +
                hasLife + ',' +
                resource + ',';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(namePlanet, planet.namePlanet);
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

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public HasLife getHasLife() {
        return hasLife;
    }

    public void setHasLife(HasLife hasLife) {
        this.hasLife = hasLife;
    }
}
