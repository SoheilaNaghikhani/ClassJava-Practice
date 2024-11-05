
package src.examnew;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainGalaxy {
    public static List<Galaxy> galaxyList = new ArrayList<>();
    public static String menu = "Welcome to Galaxy Management System : \n1." +
            "show Galaxy \n2." +
            "Add New Planet\n3." +
            "Change count Moon \n4." +
            "Show Planet \n5." +
            "export And Exit ";

    public static void main(String[] args) {
        galaxyList = loadGalaxy();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(menu);
            System.out.println("Enter number : ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    showGalaxy(galaxyList);
                    break;
                case "2":
                    //   addPalent(scanner, galaxy2);
                    break;
                case "3":
                    //     changMoon(scanner, galaxy1);
                    break;
                case "4":
                    //    showPlanet(galaxy1);
                    break;
                case "5":
                    //   exportPlanet(galaxy1);
                    //    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    private static List<Galaxy> loadGalaxy() {
        List<Galaxy> galaxies = new ArrayList<>();
        Galaxy galaxy = null;
        List<Planet> planetList = new ArrayList<>();
        File galaxyFile = new File("D:\\test\\Planet.txt");
        try {
            try (Scanner scanner = new Scanner(galaxyFile)) {
                while (scanner.hasNextLine()) {
                    String planetString = scanner.nextLine();
                    String namePlanet = planetString.split(",")[0];
                    String nameGalaxy = planetString.split(",")[1];
                    String type = planetString.split(",")[2];
                    Type typeEnum = null;

                    if (type.equals("Gas")) {
                        typeEnum = Type.Gas;
                    } else if (type.equals("Rock")) {
                        typeEnum = Type.Rock;
                    }
                    int countMoon = Integer.valueOf(planetString.split(",")[3]);
                    Long distanceFromSun = Long.valueOf(planetString.split(",")[4]);

                    String hasLife = planetString.split(",")[5];
                    HasLife life = null;

                    if (hasLife.equals("HasLife")) {
                        life = HasLife.HasLife;
                    } else if (hasLife.equals("NoLife")) {
                        life = HasLife.NoLife;
                    }
                    String resource = planetString.split(",")[6];
                    Resource resource1 = null;

                    if (resource.equals("Iron")) {
                        resource1 = Resource.Iron;
                    } else if (resource.equals("Water")) {
                        resource1 = Resource.Water;
                    } else if (resource.equals("Gold")) {
                        resource1 = Resource.Gold;
                    } else if (resource.equals("Nothing")) {
                        resource1 = Resource.Nothing;
                    } else if (resource.equals("Else")) {
                        resource1 = Resource.Else;
                    }
                    Planet planet = new Planet(namePlanet, typeEnum, countMoon, distanceFromSun, resource1, life);
                    planetList.add(planet);
                    galaxy = new Galaxy(nameGalaxy, planetList);
                    galaxy.setNameGalaxy(nameGalaxy);
                    galaxy.getListPlanet().add(planet);
                    galaxies.add(galaxy);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return galaxies;
    }

    private static void showGalaxy(List<Galaxy> galaxy) {
        for (Galaxy galaxy1 : galaxy) {
            System.out.println(galaxy1.toString());
        }
    }


    public static void changMoon(Scanner scanner, Galaxy galaxy) {
        Boolean hasFound = false;
        System.out.println("Enter Planet Name : ");
        String planetName = scanner.nextLine();
        for (Planet planet : galaxy.getListPlanet()) {
            if (planet.getNamePlanet().equals(planetName)) {
                hasFound = true;
                System.out.println("Enter New Count Moon : ");
                Scanner scanner2 = new Scanner(System.in);
                String countString = scanner2.nextLine();
                int countMoon = Integer.valueOf(countString);
                planet.changeCountMoon(countMoon);
                System.out.println("New Count Moon : " + planet.getCountMoon());
                galaxy.getListPlanet().add(planet);
                exportPlanet(galaxy);
                break;
            }
        }
        if (!hasFound) {
            System.out.println("Palent Not Found!");
        }
    }

    public static void addPalent(Scanner scanner, Galaxy galaxy) {
        System.out.println("Enter Planet Name:");
        String namePlanet = scanner.nextLine();

        System.out.println("Enter Galaxy Name : ");
        String nameGalaxy = scanner.nextLine();

        System.out.println("Enter type... \n1.Gas\n2.Rock");
        String type = scanner.nextLine();
        Type nameType = null;
        switch (type) {
            case "1":
                nameType = Type.Gas;
                break;
            case "2":
                nameType = Type.Rock;
                break;
            default:
                System.out.println("invalid type.");
                break;
        }
        System.out.println("Enter countMoon :");
        String countMoon = scanner.nextLine();
        int countMoonInteger = Integer.valueOf(countMoon);

        System.out.println("Enter distanceFromSun :");
        String distanceFromSun = scanner.nextLine();
        Long distanceFromSunInteger = Long.valueOf(distanceFromSun);

        System.out.println("Enter hasLife ... \n1.HasLife\n2.NoLife");
        String hasLife = scanner.nextLine();
        HasLife life = null;
        switch (hasLife) {
            case "1":
                life = HasLife.HasLife;
                break;
            case "2":
                life = HasLife.NoLife;
                break;
            default:
                System.out.println("invalid Data.");
                break;
        }

        System.out.println("Enter Resource... \n1.Iron\n2.Water\n3.Gold\n4.Else\n5.Nothing");
        String resource = scanner.nextLine();
        Resource resource1 = null;
        switch (resource) {
            case "1":
                resource1 = Resource.Iron;
                break;
            case "2":
                resource1 = Resource.Water;
                break;
            case "3":
                resource1 = Resource.Gold;
                break;
            case "4":
                resource1 = Resource.Nothing;
                break;
            case "5":
                resource1 = Resource.Else;
                break;
            default:
                System.out.println("invalid resource.");
                break;
        }
        Planet planet = new Planet(namePlanet, nameType, countMoonInteger, distanceFromSunInteger, resource1, life);
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        Galaxy galaxy1 = new Galaxy(nameGalaxy, planetList);
        //galaxy.getListPlanet().add(planet);
        System.out.println("Planet : " + namePlanet + "  addad. " + "\n");
        exportPlanet(galaxy1);
    }

    private static void exportPlanet(Galaxy galaxy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\test\\Planet.txt"))) {
            String exportData = "";
            for (Planet planet : galaxy.getListPlanet()) {
                String planetString = planet.toString() + "\n";
                exportData += planetString;
            }
            exportData = exportData.substring(0, exportData.length() - 1);
            writer.write(exportData);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void showPlanet(Galaxy galaxy) {
        File galaxyFile = new File("D:\\test\\Planet.txt");
        try {
            try (Scanner scanner = new Scanner(galaxyFile)) {
                while (scanner.hasNextLine()) {
                    String planetString = scanner.nextLine();
                    String namePlanet = planetString.split(",")[0];

                    String hasLife = planetString.split(",")[5];
                    HasLife life = null;

                    if (hasLife.equals("HasLife")) {
                        life = HasLife.HasLife;
                    } else if (hasLife.equals("NoLife")) {
                        life = HasLife.NoLife;

                    }
                    String resource = planetString.split(",")[6];
                    Resource resource1 = null;

                    if (resource.equals("Iron")) {
                        resource1 = Resource.Iron;
                    } else if (resource.equals("Water")) {
                        resource1 = Resource.Water;
                    } else if (resource.equals("Gold")) {
                        resource1 = Resource.Gold;
                    } else if (resource.equals("Nothing")) {
                        resource1 = Resource.Nothing;
                    } else if (resource.equals("Else")) {
                        resource1 = Resource.Else;
                    }
                    System.out.println("Planet Name: " + namePlanet);
                    if (hasLife.equals("HasLife")) {
                        System.out.println("Planet HasLife ");
                    } else if (hasLife.equals("NoLife")) {
                        System.out.println("Planet NoLife ");
                    }
                    System.out.println("Resource is : " + resource1);
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

      /*private static void loadGalaxyFromFile(Galaxy galaxy) {
        File galaxyFile = new File("D:\\test\\Planet.txt");
        try {
            try (Scanner scanner = new Scanner(galaxyFile)) {
                while (scanner.hasNextLine()) {
                    String planetString = scanner.nextLine();
                    String namePlanet = planetString.split(",")[0];
                    String nameGalaxy = planetString.split(",")[1];
                    String type = planetString.split(",")[2];
                    Type typeEnum = null;

                    if (type == "gas") {
                        typeEnum = Type.Gas;
                    } else if (type == "rock") {
                        typeEnum = Type.Rock;
                    }
                    int countMoon = Integer.valueOf(planetString.split(",")[3]);
                    Long distanceFromSun = Long.valueOf(planetString.split(",")[4]);
                    String hasLife = planetString.split(",")[5];
                    String resource = planetString.split(",")[6];
                    galaxy.setNameGalaxy(nameGalaxy);
                    galaxy.getNameGalaxy(galaxy.getNameGalaxy());
                    Planet planet = new Planet(namePlanet, typeEnum, countMoon, distanceFromSun, hasLife, resource);
                    galaxy.getPlanetMap().add();
                    galaxy.getPlanetSet().add(planet);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }*/
}
