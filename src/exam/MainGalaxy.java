package src.exam;

import java.io.*;
import java.util.Scanner;

public class MainGalaxy {
    public static String menu = "Welcome to Galaxy Management System : \n1." +
            "show Galaxy \n2." +
            "Add New Planet\n3." +
            "Change count Moon \n4." +
            "Show Planet \n5." +
            "export And Exit ";

    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy("MilkWay");
        Planet planet = new Planet("Saturn", Type.Gas, 2, 20000000L, "NoLife", "Nothing");
        loadGalaxyFromFile(galaxy);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(menu);
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    showGalaxy(galaxy);
                    break;
                case "2":
                    addPalent(scanner, galaxy);
                    break;
                case "3":
                    System.out.println("Enter count moon : ");
                    Scanner scanner1 = new Scanner(System.in);
                    String countString = scanner1.nextLine();
                    int countMoon = Integer.valueOf(countString);
                    planet.changeCountMoon(countMoon);
                    break;
                case "4":
                    showPlanet(galaxy);
                    break;
                case "5":
                    exportPlanet(galaxy);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
    private static void loadGalaxyFromFile(Galaxy galaxy) {
        File galaxyFile = new File("D:\\test\\Planet.txt");
        try {
            try (Scanner scanner = new Scanner(galaxyFile)) {
                while (scanner.hasNextLine()) {
                    String planetString = scanner.nextLine();
                    String namePlanet = planetString.split("#")[0];
                    String type = planetString.split("#")[1];
                    Type typeEnum = null;

                    if (type == "gas") {
                        typeEnum = Type.Gas;
                    } else if (type == "rock") {
                        typeEnum = Type.Rock;
                    }
                    int countMoon = Integer.valueOf(planetString.split("#")[2]);
                    Long distanceFromSun = Long.valueOf(planetString.split("#")[3]);
                    String hasLife = planetString.split("#")[4];
                    String resource = planetString.split("#")[5];
                    Planet planet = new Planet(namePlanet, typeEnum, countMoon, distanceFromSun, hasLife, resource);
                    galaxy.getPlanetSet().add(planet);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void showGalaxy(Galaxy galaxy) {
        File galaxyFile = new File("D:\\test\\Planet.txt");
        try {
            try (Scanner scanner = new Scanner(galaxyFile)) {
                while (scanner.hasNextLine()) {
                    String planetString = scanner.nextLine();
                    String namePlanet = planetString.split("#")[0];
                    String type = planetString.split("#")[1];
                    Type typeEnum = null;

                    if (type == "gas") {
                        typeEnum = Type.Gas;
                    } else if (type == "rock") {
                        typeEnum = Type.Rock;
                    }
                    int countMoon = Integer.valueOf(planetString.split("#")[2]);
                    Long distanceFromSun = Long.valueOf(planetString.split("#")[3]);
                    String hasLife = planetString.split("#")[4];
                    String resource = planetString.split("#")[5];
                    Planet planet = new Planet(namePlanet, typeEnum, countMoon, distanceFromSun, hasLife, resource);
                    galaxy.getPlanetSet().add(planet);
                    System.out.println(planet.toString());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addPalent(Scanner scanner, Galaxy galaxy) {
        System.out.println("Enter planet name:");
        String namePlanet = scanner.nextLine();

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
        if (type == "gas") {
            nameType = Type.Gas;
        } else if (type == "rock") {
            nameType = Type.Rock;
        }
        System.out.println("Enter countMoon :");
        String countMoon = scanner.nextLine();
        int countMoonInteger = Integer.valueOf(countMoon);

        System.out.println("Enter distanceFromSun :");
        String distanceFromSun = scanner.nextLine();
        Long distanceFromSunInteger = Long.valueOf(countMoon);

        System.out.println("Enter hasLife :");
        String hasLife = scanner.nextLine();

        System.out.println("Enter resource :");
        String resource = scanner.nextLine();


        Planet planet = new Planet(namePlanet, nameType, countMoonInteger, distanceFromSunInteger, hasLife, resource);
        galaxy.getPlanetSet().add(planet);
        System.out.println("Planet :" + namePlanet + "  addad. " + "\n");
        exportPlanet(galaxy);
    }

    private static void exportPlanet(Galaxy galaxy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\test\\Planet.txt"))) {
            String exportData = "";
            for (Planet planet : galaxy.getPlanetSet()) {
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
                    String namePlanet = planetString.split("#")[0];
                    String type = planetString.split("#")[1];
                    Type typeEnum = null;

                    if (type == "gas") {
                        typeEnum = Type.Gas;
                    } else if (type == "rock") {
                        typeEnum = Type.Rock;
                    }
                    int countMoon = Integer.valueOf(planetString.split("#")[2]);
                    Long distanceFromSun = Long.valueOf(planetString.split("#")[3]);
                    String hasLife = planetString.split("#")[4];
                    String resource = planetString.split("#")[5];
                    Planet planet = new Planet(namePlanet, typeEnum, countMoon, distanceFromSun, hasLife, resource);
                    galaxy.getPlanetSet().add(planet);
                    System.out.println("Planet : " + planet.toString());
                }
            }
            System.out.println("\n");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
