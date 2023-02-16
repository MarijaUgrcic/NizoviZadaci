import java.util.Random;

public class RandomPoker {
    public static void main(String[] args) {

        Random random = new Random();
        String[] niz = {"Heart", "Cherry", "Coin", "Melon", "Jocker"}; //pocetni niz

        String[] niz2 = {"Jocker", "Melon", "Melon", "Heart", "Coin"}; // ocekivani niz na izlazu
        String[] niz3 = new String[5]; //niz koji stampamo a koji treba da bude isti kao niz2


        while (!niz3[0].equals("Jocker") && !niz3[1].equals("Melon") && !niz3[2].equals("Melon")
                && !niz3[3].equals("Heart") && !niz3[4].equals("Coin")) {
            for (int i = 0; i < niz3.length; i++) {
                int index = random.nextInt(niz.length);
                System.out.println(niz3[index]);
            }
        }
    }
}
