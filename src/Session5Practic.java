package src;

public class Session5Practic {
    public static void main(String[] args) {
        String[] name = {"Soli", "Mona", "Nadia"};
        System.out.println(name[0]);
        System.out.println(name[name.length - 1]);

        name[name.length - 1] = "Zahra";
        System.out.println(name[name.length - 1]);
        name[2] = "Ali";
        System.out.println(name[2]);
            recMethod();


    }


    private static void recMethod() {
        System.out.println("j");
        recMethod();
    }

}
